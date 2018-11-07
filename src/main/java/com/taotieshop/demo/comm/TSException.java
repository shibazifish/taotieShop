package com.taotieshop.demo.comm;

/**
 * @Auther: 李宇
 * @Date: 2018/11/6 23:02
 * @Description:
 */
public class TSException extends RuntimeException {
    private int code;

    public TSException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
