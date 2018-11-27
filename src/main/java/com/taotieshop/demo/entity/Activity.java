package com.taotieshop.demo.entity;

import java.util.Date;

public class Activity {
    private Integer activity_id;

    private String activity_name;

    private String activity_prize;

    private Date create_time;

    private String activity_desc;

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_prize() {
        return activity_prize;
    }

    public void setActivity_prize(String activity_prize) {
        this.activity_prize = activity_prize;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getActivity_desc() {
        return activity_desc;
    }

    public void setActivity_desc(String activity_desc) {
        this.activity_desc = activity_desc;
    }
}