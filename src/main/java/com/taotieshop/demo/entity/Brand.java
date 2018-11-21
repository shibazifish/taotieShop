package com.taotieshop.demo.entity;

import java.math.BigDecimal;

public class Brand {
    private Integer id;

    private String name;

    private String list_pic_url;

    private String simple_desc;

    private String pic_url;

    private Byte sort_order;

    private String is_show;

    private BigDecimal floor_price;

    private String app_list_pic_url;

    private String is_new;

    private String new_pic_url;

    private Byte new_sort_order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getList_pic_url() {
        return list_pic_url;
    }

    public void setList_pic_url(String list_pic_url) {
        this.list_pic_url = list_pic_url;
    }

    public String getSimple_desc() {
        return simple_desc;
    }

    public void setSimple_desc(String simple_desc) {
        this.simple_desc = simple_desc;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Byte getSort_order() {
        return sort_order;
    }

    public void setSort_order(Byte sort_order) {
        this.sort_order = sort_order;
    }

    public String getIs_show() {
        return is_show;
    }

    public void setIs_show(String is_show) {
        this.is_show = is_show;
    }

    public BigDecimal getFloor_price() {
        return floor_price;
    }

    public void setFloor_price(BigDecimal floor_price) {
        this.floor_price = floor_price;
    }

    public String getApp_list_pic_url() {
        return app_list_pic_url;
    }

    public void setApp_list_pic_url(String app_list_pic_url) {
        this.app_list_pic_url = app_list_pic_url;
    }

    public String getIs_new() {
        return is_new;
    }

    public void setIs_new(String is_new) {
        this.is_new = is_new;
    }

    public String getNew_pic_url() {
        return new_pic_url;
    }

    public void setNew_pic_url(String new_pic_url) {
        this.new_pic_url = new_pic_url;
    }

    public Byte getNew_sort_order() {
        return new_sort_order;
    }

    public void setNew_sort_order(Byte new_sort_order) {
        this.new_sort_order = new_sort_order;
    }
}