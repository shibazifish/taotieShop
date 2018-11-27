package com.taotieshop.demo.entity;

import java.util.Date;

public class Clock {
    private Integer clock_id;

    private String user_id;

    private Integer activity_id;

    private String clock_image_url;

    private Date create_time;

    public Integer getClock_id() {
        return clock_id;
    }

    public void setClock_id(Integer clock_id) {
        this.clock_id = clock_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public String getClock_image_url() {
        return clock_image_url;
    }

    public void setClock_image_url(String clock_image_url) {
        this.clock_image_url = clock_image_url;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}