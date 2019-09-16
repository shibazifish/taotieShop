package com.taotieshop.demo.baby.entity;

import java.io.Serializable;
import java.util.Date;

public class BabyActive implements Serializable {
    private static final long serialVersionUID = 445881881738877228L;
    private String babyName;
    private String activeName;
    private Date activeDate;
    private int id;
    private String openId;

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
