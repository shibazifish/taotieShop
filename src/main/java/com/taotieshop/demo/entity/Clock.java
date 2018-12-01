package com.taotieshop.demo.entity;

import java.util.Date;

public class Clock {
    private Integer clock_id;

    private String open_id;

    private Integer run_data;

    private Integer ice_data;

    private Date create_time;

    public Integer getClock_id() {
        return clock_id;
    }

    public void setClock_id(Integer clock_id) {
        this.clock_id = clock_id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public Integer getRun_data() {
        return run_data;
    }

    public void setRun_data(Integer run_data) {
        this.run_data = run_data;
    }

    public Integer getIce_data() {
        return ice_data;
    }

    public void setIce_data(Integer ice_data) {
        this.ice_data = ice_data;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}