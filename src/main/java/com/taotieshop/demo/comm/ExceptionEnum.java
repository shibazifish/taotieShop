package com.taotieshop.demo.comm;
/**
 * 任务：
 * 描述：返回值使用到的枚举
 * 作者：李宇
 * 时间：2018/11/7 8:52
*/
public enum ExceptionEnum {
    SYS_EXCEPTION(-1,"系统异常"),
    DELETE_EXCEPTION(1,"删除报错，方法尚未实现！"),
    SAVE_EXCEPTION(1,"保存失败！");
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
