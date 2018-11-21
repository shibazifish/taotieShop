package com.taotieshop.utils;

import com.taotieshop.demo.entity.Result;

/**
 * 返回值类
 */
public class ResultUtils {
    /**
     * 错误类型返回值
     * @param errorCode
     * @param errorMessage
     * @return
     */
    public static Result error(int errorCode, String errorMessage){
        Result result = new Result();
        result.setErrno(errorCode);
        result.setErrmsg(errorMessage);
        return result;
    }

    /**
     * 成功返回值
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setErrno(0);
        result.setErrmsg("");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
}
