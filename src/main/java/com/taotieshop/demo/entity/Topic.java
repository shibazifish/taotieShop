package com.taotieshop.demo.entity;

import java.math.BigDecimal;

public class Topic {
    private Integer id;

    private String title;

    private String avatar;

    private String item_pic_url;

    private String subtitle;

    private Integer topic_category_id;

    private BigDecimal price_info;

    private String read_count;

    private String scene_pic_url;

    private Integer topic_template_id;

    private Integer topic_tag_id;

    private Integer sort_order;

    private Boolean is_show;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getItem_pic_url() {
        return item_pic_url;
    }

    public void setItem_pic_url(String item_pic_url) {
        this.item_pic_url = item_pic_url;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getTopic_category_id() {
        return topic_category_id;
    }

    public void setTopic_category_id(Integer topic_category_id) {
        this.topic_category_id = topic_category_id;
    }

    public BigDecimal getPrice_info() {
        return price_info;
    }

    public void setPrice_info(BigDecimal price_info) {
        this.price_info = price_info;
    }

    public String getRead_count() {
        return read_count;
    }

    public void setRead_count(String read_count) {
        this.read_count = read_count;
    }

    public String getScene_pic_url() {
        return scene_pic_url;
    }

    public void setScene_pic_url(String scene_pic_url) {
        this.scene_pic_url = scene_pic_url;
    }

    public Integer getTopic_template_id() {
        return topic_template_id;
    }

    public void setTopic_template_id(Integer topic_template_id) {
        this.topic_template_id = topic_template_id;
    }

    public Integer getTopic_tag_id() {
        return topic_tag_id;
    }

    public void setTopic_tag_id(Integer topic_tag_id) {
        this.topic_tag_id = topic_tag_id;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Boolean getIs_show() {
        return is_show;
    }

    public void setIs_show(Boolean is_show) {
        this.is_show = is_show;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}