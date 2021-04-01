package com.henanuniversity.wangqi.exception;

/**
 * @Title: BaseException
 * @Description: 基础异常类
 */
public class BaseException extends RuntimeException {
    /**
     * 错误编码
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }
}
