package com.taotieshop.demo.entity;

public class SysParameter {
    private Integer SYS_PARA_ID;

    private String para_name;

    private String para_value;

    private String para_code;

    public Integer getSYS_PARA_ID() {
        return SYS_PARA_ID;
    }

    public void setSYS_PARA_ID(Integer SYS_PARA_ID) {
        this.SYS_PARA_ID = SYS_PARA_ID;
    }

    public String getPara_name() {
        return para_name;
    }

    public void setPara_name(String para_name) {
        this.para_name = para_name;
    }

    public String getPara_value() {
        return para_value;
    }

    public void setPara_value(String para_value) {
        this.para_value = para_value;
    }

    public String getPara_code() {
        return para_code;
    }

    public void setPara_code(String para_code) {
        this.para_code = para_code;
    }
}