package com.henanuniversity.wangqi.exception;

/**
 * @Title: ConnectionException
 * @Description: 连接异常
 */
public class ConnectionException extends BaseException {
    /**
     * linkType
     */
    private String linkType;
    /**
     * linkAddress
     */
    private String linkAddress;

    public String getLinkType() {
        return linkType;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public ConnectionException(String code, String message, String linkType, String linkAddress) {
        super(code, message);
        this.linkType = linkType;
        this.linkAddress = linkAddress;
    }
}
