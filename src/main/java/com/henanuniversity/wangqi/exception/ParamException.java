package com.henanuniversity.wangqi.exception;

import com.henanuniversity.wangqi.constant.ErrorConstant;

/**
 * @Title: ParamException
 * @Description:  参数异常
 */
public class ParamException extends BaseException {

    public ParamException(String code, String message) {
        super(code, message);
    }

    public ParamException(String message) {
        super(ErrorConstant.PARAMS_CHECK_ERROR, message);
    }
}
