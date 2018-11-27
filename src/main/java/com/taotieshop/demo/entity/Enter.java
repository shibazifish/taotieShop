package com.taotieshop.demo.entity;

import java.util.Date;

public class Enter {
    private Integer enter_id;

    private String user_id;

    private String user_name;

    private Integer activity_id;

    private Date create_date;

    public Integer getEnter_id() {
        return enter_id;
    }

    public void setEnter_id(Integer enter_id) {
        this.enter_id = enter_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}