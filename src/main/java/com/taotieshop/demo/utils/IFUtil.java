package com.taotieshop.demo.utils;

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
    public static Date CurrentDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
        return d;
    }
}
