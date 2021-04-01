package com.henanuniversity.wangqi.utils;

import com.henanuniversity.wangqi.constant.NumConstant;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Slf4j
public final class OkhttpUtils {


    /**
     * getClient
     * @return OkHttpClient
     */

    private static OkHttpClient getClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().
                connectTimeout(NumConstant.CODE_5, TimeUnit.SECONDS).
                readTimeout(NumConstant.CODE_20, TimeUnit.SECONDS).
                writeTimeout(NumConstant.CODE_20, TimeUnit.SECONDS).
                build();
        return okHttpClient;
    }


    /**
     * getRequest
     * @param url url
     * @return Request
     * @throws MalformedURLException 异常
     */
    private static Request getRequest(String url) throws MalformedURLException {
        Request.Builder builder = getBuilder();
        URL uri = new URL(url);
        return builder.url(uri).build();
    }


    /**
     * doGet
     * @param url url
     * @param param param
     * @return 结果
     */

    public static String doGet(String url, String param) {
        if (param != null) {
            url = url + "?" + param;
        }
        OkHttpClient okHttpClient = getClient();

        String result = null;
        try {
            Request request = getRequest(url);
            Response response = okHttpClient.newCall(request).execute();
            int code = response.code();
            String msg = response.message();
            if (code == NumConstant.CODE_200) {
                ResponseBody body = response.body();
                if (body != null) {
                    result = body.string();
                } else {
                    throw new IOException("response body is null");
                }
            } else {
                response.close();
                log.error("GET请求地址:" + url + "返回状态异常,code值为:" + code + "异常信息:" + msg);
            }
        } catch (IOException e) {
            log.error("GET请求异常,url = {}", url, e);
        }
        return result;
    }

    /**
     * getBuilder
     * @return Builder
     */

    private static Request.Builder getBuilder() {
        Request.Builder builder = new Request.Builder();

        builder.addHeader("accept", "application/json").
                addHeader("connection", "Keep-Alive").
                addHeader("Content-Type", "application/json;charset=UTF-8");
        return builder;
    }

    /**
     * doPost
     * @param url url
     * @param param param
     * @return 请求结果
     */

    public static String doPost(String url, String param) {

        OkHttpClient okHttpClient = getClient();
        Request.Builder builder = getBuilder();
        String result = null;
        try {
            RequestBody requestBody = RequestBody.create(param.getBytes("UTF-8"),
                    MediaType.parse(org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE));
            builder.post(requestBody);
            Request request = builder.url(url).build();
            Response response = okHttpClient.newCall(request).execute();
            int code = response.code();
            String msg = response.message();
            if (code == NumConstant.CODE_200) {
                ResponseBody body = response.body();
                if (body != null) {
                    result = body.string();
                } else {
                    throw new IOException("response body is null");
                }
            } else {
                response.close();
                log.error("POST请求地址:" + url + "参数:" + param + "返回状态异常,code值为:" + code + "异常信息:" + msg);
            }
        } catch (Exception e) {
            log.error("POST请求异常,url = {}", url, e);
        }
        return result;
    }

    /**
     * doDelete
     * @param url url
     * @param param param
     * @return 请求结果
     */

    public static String doDelete(String url, String param) {

        OkHttpClient okHttpClient = getClient();
        Request.Builder builder = getBuilder();
        String result = null;
        try {
            if (param != null) {
                RequestBody requestBody = RequestBody.create(param.getBytes("UTF-8"),
                        MediaType.parse(org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE));
                builder.delete(requestBody);
            } else {
                builder.delete();
            }
            Request request = builder.url(url).build();
            Response response = okHttpClient.newCall(request).execute();
            int code = response.code();
            String msg = response.message();
            if (code == NumConstant.CODE_200) {
                ResponseBody body = response.body();
                if (body != null) {
                    result = body.string();
                } else {
                    throw new IOException("response body is null");
                }
            } else {
                response.close();
                log.error("DELETE请求地址:" + url + "参数:" + param + "返回状态异常,code值为:" + code + "异常信息:" + msg);
            }
        } catch (Exception e) {
            log.error("DELETE请求异常,url = {}", url, e);
        }
        return result;
    }

    /**
     * doPut
     * @param url url
     * @param param param
     * @return 请求结果
     */

    public static String doPut(String url, String param) {

        OkHttpClient okHttpClient = getClient();
        Request.Builder builder = getBuilder();
        String result = null;
        try {
            RequestBody requestBody = RequestBody.create(param.getBytes("UTF-8"),
                    MediaType.parse(org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE));
            builder.put(requestBody);
            Request request = builder.url(url).build();
            Response response = okHttpClient.newCall(request).execute();
            int code = response.code();
            String msg = response.message();
            if (code == NumConstant.CODE_200) {
                ResponseBody body = response.body();
                if (body != null) {
                    result = body.string();
                } else {
                    throw new IOException("response body is null");
                }
            } else {
                response.close();
                log.error("PUT请求地址:" + url + "参数:" + param + "返回状态异常,code值为:" + code + "异常信息:" + msg);
            }
        } catch (Exception e) {
            log.error("PUT请求异常,url = {}", url, e);
        }
        return result;
    }
    private OkhttpUtils() {

    }
}
