package com.henanuniversity.wangqi.exception;

import com.henanuniversity.wangqi.constant.ErrorConstant;

/**
 * @Title: BizException
 * @Description: 业务异常
 */
public class BizException extends BaseException {

    public BizException(String code, String message) {
        super(code, message);
    }

    public BizException(String message) {
        super(ErrorConstant.ERROR_BIZ, message);
    }

}
