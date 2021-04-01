package com.henanuniversity.wangqi.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.henanuniversity.wangqi.exception.BaseException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ResultEntity
 * @Description: 统一返回类
 */
@Setter
@Getter
@ToString
public class ResultEntity implements Serializable {

    private static final long serialVersionUID = -90000059L;
    /**
     * OK
     */
    public static final String CODE_OK = "0";
    /**
     * OK
     */
    public static final String MSG_OK = "OK";
    /**
     * errorCode
     */
    public static final String ERROR_CODE = "errorCode";
    /**
     * errorMsg
     */
    public static final String ERROR_MSG = "errorMsg";
    /**
     * data
     */
    public static final String DATA = "data";
    /**
     * 结果码
     */
    private String errorCode;
    /**
     * 结果信息
     */
    private String errorMsg;
    /**
     * 结果数据
     */
    private Object data;

    public ResultEntity(String code, String errorMsg, Object data) {
        this.errorCode = code;
        this.errorMsg = errorMsg;
        this.data = data;
    }


    /**
     * 返回所有
     *
     * @param errorCode 结果码
     * @param errorMsg  结果信息
     * @param data      结果数据
     * @return json
     */
    public static String success(String errorCode, String errorMsg, Object data) {
        if (data == null) {
            data = new Object();
        }
        ResultEntity resultEntity = new ResultEntity(errorCode, errorMsg, data);
        return JSON.toJSONString(resultEntity);
    }

    /**
     * 返回信息跟数据
     *
     * @param errorMsg 结果信息
     * @param data     结果数据
     * @return json
     */
    public static String success(String errorMsg, Object data) {
        return success(CODE_OK, errorMsg, data);
    }

    /**
     * 返回结果数据
     *
     * @param data 结果数据
     * @return String
     */
    public static String success(Object data) {
        return success(MSG_OK, data);
    }

    /**
     * 无结果数据返回
     * @return json
     */
    public static String success() {
        return success(null);
    }


    /**
     * 错误返回
     *
     * @param errorCode 结果码
     * @param errorMsg 结果数据
     * @param data 数据
     * @return json
     */
    public static String error(String errorCode, String errorMsg, Object data) {
        return JSON.toJSONString(new ResultEntity(errorCode, errorMsg, data));
    }

    /**
     * 错误返回
     * @param errorCode 错误码
     * @param errorMsg  错误信息
     * @return json
     */
    public static String error(String errorCode, String errorMsg) {
        return error(errorCode, errorMsg, null);
    }

    /**
     * 错误返回
     * @param e 异常
     * @return json
     */
    public static String error(BaseException e) {
        return error(e.getCode(), e.getMessage());
    }

    /**
     * 错误返回
     * @param errorMsg 错误信息
     * @return json
     */
    public static String error(String errorMsg) {
        return error("1001", errorMsg);
    }

    /**
     * 判断结果是否是正确结果
     * @param result 返回
     * @return boolean
     */
    public static boolean getCode(String result) {
        if (result == null) {
            return false;
        }
        JSONObject jsonObject = JSON.parseObject(result);
        if (jsonObject.containsKey(ERROR_CODE) && jsonObject.getInteger(ERROR_CODE) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 获取数据
     * @param result result
     * @param data data
     * @return 返回
     */
    public static boolean getData(String result, Map data) {
        if (result == null) {
            return false;
        }
        if (data == null) {
            data = new HashMap();
        }
        JSONObject jsonObject = JSON.parseObject(result);
        if (jsonObject.containsKey(ERROR_CODE) && jsonObject.getInteger(ERROR_CODE) == 0) {
            if (jsonObject.containsKey(DATA)) {
                data.put("data", jsonObject.get("data"));
                data.put("errorMsg", jsonObject.get("errorMsg"));
            }
            return true;
        }

        if (jsonObject.containsKey(ERROR_MSG) && StringUtils.isNoneBlank(jsonObject.getString(ERROR_MSG))) {
            data.put("errorMsg", jsonObject.get("errorMsg"));
        }
        return false;
    }
}
