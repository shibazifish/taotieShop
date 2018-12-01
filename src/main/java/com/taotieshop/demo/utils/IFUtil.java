package com.taotieshop.demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/299:00
 * 类名: IFUtil
 */
public class IFUtil {
    /**
     * 获取系统当前时间
     * @return
     */
    public static Date CurrentDate(){
        Date d = new Date();
        return d;
    }
    /*
     * 将时间戳转换为时间
     */
    public static Date stampToDate(String s) throws ParseException {
        Date res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        res = simpleDateFormat.parse(s);
        return res;
    }
}
