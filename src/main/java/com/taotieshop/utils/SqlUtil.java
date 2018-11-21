package com.taotieshop.utils;

/**
 * @Auther: 李宇
 * @Date: 2018/11/11 01:40
 * @Description:
 */
public class SqlUtil {
    /**
     * 左边模糊匹配
     * @param value
     * @return
     */
    public static String leftLike(String value){
        return "%"+value;
    }

    /**
     * 右边模糊匹配
     * @param value
     * @return
     */
    public static String rightLike(String value){
        return value+"%";
    }

    /**
     * 左右模糊匹配
     * @param value
     * @return
     */
    public static String allLike(String value){
        value = leftLike(value);
        return rightLike(value);
    }
}
