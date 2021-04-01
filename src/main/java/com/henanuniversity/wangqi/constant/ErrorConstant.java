package com.henanuniversity.wangqi.constant;

/**
 * @Title: ErrorConstant
 * @Description: 错误编码常量类
 */
public final class ErrorConstant {
    /**
     * 错误编码未定义
     */
    public static final String ERR_EXCEPTION_000 = "1000";
    /**
     * 参数check不通过
     */
    public static final String PARAMS_CHECK_ERROR = "1001";

    /**
     * JSON转换异常
     */
    public static final String ERROR_NUM_002 = "1002";

    /**
     * 内部错误
     */
    public static final String INNER_EXCEPTION_010 = "1010";


    /**
     * 业务异常
     */
    public static final String ERROR_BIZ = "1100";


    /** DB相关的error从400开始 */
    /**
     * 数据异常[可能不存在或存在多条]
     */
    public static final String DATA_NOT_EXIST = "1400";
    /**
     * 主键id不能为空
     */
    public static final String ERROR_NUM_401 = "1401";
    /**
     * 查询数据库异常
     */
    public static final String QUERY_DB_ERROR = "1402";
    /**
     * 插入数据库异常
     */
    public static final String ERROR_DB_INSERT = "1403";
    /**
     * 更新数据库异常
     */
    public static final String ERROR_DB_UPDATE = "1404";
    /**
     * 删除数据库异常
     */
    public static final String ERROR_NUM_405 = "1405";
    /**
     * 数据已存在
     */
    public static final String DATA_EXISTS = "1406";
    /**
     * 保存到redis异常
     */
    public static final String ERROR_NUM_407 = "1407";
    /**
     * 查询redis异常
     */
    public static final String ERROR_NUM_408 = "1408";
    /**
     * ap设备已离线
     */
    public static final String ERROR_NUM_409 = "1409";
    /**
     * 操作数据库异常
     */
    public static final String ERROR_NUM_411 = "1411";
    /**
     * 新增数据主键重复
     */
    public static final String ERROR_NUM_412 = "1412";
    /**
     * 数据不存在
     */
    public static final String ERROR_NUM_413 = "1413";

    /**
     * http 调用异常
     */
    public static final String ERROR_NUM_500 = "1500";

    /**
     * 边缘信息批量上报处理失败code值
     */
    public static final String ERROR_EDGE_REPORT = "1501";

    /**
     * telnet 链接异常
     */
    public static final String ERROR_TELNET_CONNECT = "1600";

    /**
     * 获取telnet链接超时
     */
    public static final String ERROR_TELNET_TIMED_OUT = "1601";

    /**
     * 获取wordTip异常
     */
    public static final String ERROR_TELNET_WORDTIP = "1602";

    public static final String ERROR_TELNET_EXEC = "1603";

    /**
     * freemarker 解析异常
     */
    public static final String ERROR_FREEMARKER_PROCESS = "1700";

    /**
     * 流操作异常
     */
    public static final String ERROR_STREAM_OPERATION = "1800";

    private ErrorConstant() {

    }

}
