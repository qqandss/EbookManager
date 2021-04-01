package com.henanuniversity.wangqi.config.http;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Httpclient 的线程池配置
 */
@ConfigurationProperties(prefix = "http-pool")
@Data
public class HttpPoolProperties {

    /**
     * 最大线程数
     */
    private Integer maxTotal = 20;

    /**
     * 默认线程数
     */
    private Integer defaultMaxPerRoute = 10;

    /**
     * 连接上服务器(握手成功)的时间
     */
    private Integer connectTimeout = 1000;

    /**
     * 从连接池中获取连接的超时时间
     */
    private Integer connectionRequestTimeout = 3000;

    /**
     * 服务器返回数据(response)的时间
     */
    private Integer socketTimeout = 5000;

    /**
     * 用于校验线程空闲的时间
     */
    private Integer validateAfterInactivity = 7000;

    /**
     * 开启异步线程池
     */
    private Boolean async = true;

}
