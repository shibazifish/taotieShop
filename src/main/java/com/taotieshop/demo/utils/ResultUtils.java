package com.taotieshop.demo.utils;

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
        result.setCode(errorCode);
        result.setMssage(errorMessage);
        return result;
    }

    /**
     * 成功返回值
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMssage("操作成功！");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
}
