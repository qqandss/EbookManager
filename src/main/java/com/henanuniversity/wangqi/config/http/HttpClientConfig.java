package com.henanuniversity.wangqi.config.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.cert.X509Certificate;

/**
 * HttpClient 的配置
 */
@Slf4j
@Configuration
@ConditionalOnClass({HttpClient.class})
@EnableConfigurationProperties(HttpPoolProperties.class)
public class HttpClientConfig {

    @Autowired
    private HttpPoolProperties httpPoolProperties;

    @Autowired
    private HttpClientHelper helper;

    @Bean("httpRequestFactory")
    @ConditionalOnMissingBean
    public ClientHttpRequestFactory httpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory(httpClient());
    }

    @Bean("httpClient")
    @ConditionalOnMissingBean
    public HttpClient httpClient() {
        // 在调用SSL之前需要重写验证方法，取消检测SSL
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] xcs, String str) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] xcs, String str) {
            }
        };
        SSLConnectionSocketFactory socketFactory = null;
        try {
            SSLContext ctx = helper.getSslContext();
            ctx.init(null, new TrustManager[]{trustManager}, null);
            socketFactory = new SSLConnectionSocketFactory(ctx, NoopHostnameVerifier.INSTANCE);
        } catch (KeyManagementException e) {
            log.error("创建 SSL 失败", e);
        }

        assert socketFactory != null;
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", socketFactory)
                .build();
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(registry);
        connectionManager.setMaxTotal(httpPoolProperties.getMaxTotal());
        connectionManager.setDefaultMaxPerRoute(httpPoolProperties.getDefaultMaxPerRoute());
        connectionManager.setValidateAfterInactivity(httpPoolProperties.getValidateAfterInactivity());
        RequestConfig requestConfig = RequestConfig.custom()
                //服务器返回数据(response)的时间，超过抛出read timeout
                .setSocketTimeout(httpPoolProperties.getSocketTimeout())
                //连接上服务器(握手成功)的时间，超出抛出connect timeout
                .setConnectTimeout(httpPoolProperties.getConnectTimeout())
                //从连接池中获取连接的超时时间，超时间未拿到可用连接，会抛出org.apache.http.conn.ConnectionPoolTimeoutException: Timeout waiting
                // for connection from pool
                .setConnectionRequestTimeout(httpPoolProperties.getConnectionRequestTimeout())
                .build();
        return HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .setConnectionManager(connectionManager)
                .build();
    }
}
