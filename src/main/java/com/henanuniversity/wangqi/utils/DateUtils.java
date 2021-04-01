package com.henanuniversity.wangqi.utils;

import com.henanuniversity.wangqi.constant.NumConstant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DateUtils {
    private DateUtils() {
    }

    /**
     * 指定日期转换为指定格式字符串
     *
     * @param date    日期
     * @param pattern 格式 例如:yyyy-MM-dd HH:mm:ss.SSS
     * @return 时间
     */
    public static String dateToString(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 指定格式日期字符串转换为日期对象
     *
     * @param str     字符串日期
     * @param pattern 字符串日期格式
     * @return 时间
     */
    public static Date strToDate(String str, String pattern) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            Logger.getLogger(DateUtils.class.getName()).log(Level.WARNING, "str = {0} pattern = {1}",
                    new Object[]{str, pattern});
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 时间戳转换为日期对象
     *
     * @param time 时间戳
     * @return 日期
     */
    public static Date timeToDate(long time) {
        Date date = new Date(time);
        return date;
    }

    /**
     * 时间戳转换为指定格式字符串
     *
     * @param time    时间戳
     * @param pattern 格式 例如:yyyy-MM-dd HH:mm:ss.SSS
     * @return 时间
     */
    public static String timeToString(long time, String pattern) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 计算时间差
     * @author weiyichi
     * @param endDate    结束时间 格式:yyyy-MM-dd hh:mm:ss
     * @param startDate  开始时间 格式:yyyy-MM-dd hh:mm:ss
     * @return xx天xx时xx分
     */
    public static String getDatePoor(Date endDate, Date startDate) {

        long nd = NumConstant.CODE_1000 * NumConstant.CODE_24 * NumConstant.CODE_60 * NumConstant.CODE_60;
        long nh = NumConstant.CODE_1000 * NumConstant.CODE_60 * NumConstant.CODE_60;
        long nm = NumConstant.CODE_1000 * NumConstant.CODE_60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - startDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return day + "天" + hour + "时" + min + "分";
    }


}
