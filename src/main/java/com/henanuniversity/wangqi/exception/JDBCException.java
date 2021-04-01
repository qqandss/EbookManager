package com.henanuniversity.wangqi.exception;

/**
 * @Title: JDBCException
 * @Description: 数据库访问异常
 */
public class JDBCException extends BaseException {

    public JDBCException(String code, String message) {
        super(code, message);
    }
}
