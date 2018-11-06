package com.taotieshop.demo.comm;

/**
 * @Auther: 李宇
 * @Date: 2018/11/6 23:02
 * @Description:
 */
public class TSException extends RuntimeException {
    private int code;

    public TSException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
