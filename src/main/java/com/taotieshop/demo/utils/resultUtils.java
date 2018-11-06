package com.taotieshop.demo.utils;

import com.taotieshop.demo.entity.result;

/**
 * 返回值类
 */
public class resultUtils {
    /**
     * 错误类型返回值
     * @param errorCode
     * @param errorMessage
     * @return
     */
    public static result error(int errorCode, String errorMessage){
        result errorResult = new result();
        errorResult.setCode(errorCode);
        errorResult.setMssage(errorMessage);
        return errorResult;
    }

    /**
     * 成功返回值
     * @param object
     * @return
     */
    public static result success(Object object){
        result successResult = new result();
        successResult.setCode(0);
        successResult.setMssage("操作成功！");
        successResult.setData(object);
        return successResult;
    }
    public static result success(){
        return success(null);
    }
}
