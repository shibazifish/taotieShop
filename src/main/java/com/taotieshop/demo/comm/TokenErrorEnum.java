package com.taotieshop.demo.comm;

public enum TokenErrorEnum {
    BUSY(-1,"系统繁忙，此时请开发者稍候再试"),
    AppSecret(40001,"AppSecret 错误或者 AppSecret 不属于这个小程序，请开发者确认 AppSecret 的正确性"),
    GrantType(40002,"请确保 grant_type 字段值为 client_credential"),
    AppID(40013,"不合法的 AppID，请开发者检查 AppID 的正确性，避免异常字符，注意大小写");
    private int errcode;
    private String errmsg;

    TokenErrorEnum(int errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
    /**
     * 任务：
     * 描述：通过code返回msg
     * 作者：李宇
     * 时间：2019/1/16 10:22
    */
    public static String getErrmsgByErrcode(int errcode){
        TokenErrorEnum[] tokenErrorEnums = TokenErrorEnum.values();
        for (TokenErrorEnum tokenErrorEnum:tokenErrorEnums) {
            if(tokenErrorEnum.getErrcode() == errcode){
                return tokenErrorEnum.getErrmsg();
            }
        }
        return "";
    }
}
