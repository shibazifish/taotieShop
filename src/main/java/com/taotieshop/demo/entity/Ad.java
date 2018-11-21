package com.taotieshop.demo.entity;

public class Ad {
    private int id;

    private int ad_position_id;

    private Byte media_type;

    private String name;

    private String link;

    private String content;

    private Integer end_time;

    private Byte enabled;

    private String image_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAd_position_id() {
        return ad_position_id;
    }

    public void setAd_position_id(int ad_position_id) {
        this.ad_position_id = ad_position_id;
    }

    public Byte getMedia_type() {
        return media_type;
    }

    public void setMedia_type(Byte media_type) {
        this.media_type = media_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Integer end_time) {
        this.end_time = end_time;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}