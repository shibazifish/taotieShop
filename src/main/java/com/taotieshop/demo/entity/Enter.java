package com.taotieshop.demo.entity;

import java.util.Date;

public class Enter {
    private Integer enter_id;

    private Integer activity_id;

    private String wechat_number;

    private String enter_desc;

    private Date create_time;

    private String create_name;

    private String creator;

    private String avatarUrl;

    private String enter_status;

    public Integer getEnter_id() {
        return enter_id;
    }

    public void setEnter_id(Integer enter_id) {
        this.enter_id = enter_id;
    }

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public String getWechat_number() {
        return wechat_number;
    }

    public void setWechat_number(String wechat_number) {
        this.wechat_number = wechat_number;
    }

    public String getEnter_desc() {
        return enter_desc;
    }

    public void setEnter_desc(String enter_desc) {
        this.enter_desc = enter_desc;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_name() {
        return create_name;
    }

    public void setCreate_name(String create_name) {
        this.create_name = create_name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getEnter_status() {
        return enter_status;
    }

    public void setEnter_status(String enter_status) {
        this.enter_status = enter_status;
    }
}