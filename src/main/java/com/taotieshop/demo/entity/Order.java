package com.taotieshop.demo.entity;

import java.math.BigDecimal;

public class Order {
    private Integer id;

    private String order_sn;

    private Integer user_id;

    private Boolean order_status;

    private Boolean shipping_status;

    private Boolean pay_status;

    private String consignee;

    private Short country;

    private Short province;

    private Short city;

    private Short district;

    private String address;

    private String mobile;

    private String postscript;

    private Byte shipping_id;

    private String shipping_name;

    private Byte pay_id;

    private String pay_name;

    private BigDecimal shipping_fee;

    private BigDecimal actual_price;

    private Integer integral;

    private BigDecimal integral_money;

    private BigDecimal order_price;

    private BigDecimal goods_price;

    private Integer add_time;

    private Integer confirm_time;

    private Integer pay_time;

    private Integer freight_price;

    private Integer coupon_id;

    private Integer parent_id;

    private BigDecimal coupon_price;

    private String callback_status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Boolean getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Boolean order_status) {
        this.order_status = order_status;
    }

    public Boolean getShipping_status() {
        return shipping_status;
    }

    public void setShipping_status(Boolean shipping_status) {
        this.shipping_status = shipping_status;
    }

    public Boolean getPay_status() {
        return pay_status;
    }

    public void setPay_status(Boolean pay_status) {
        this.pay_status = pay_status;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Short getCountry() {
        return country;
    }

    public void setCountry(Short country) {
        this.country = country;
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrict() {
        return district;
    }

    public void setDistrict(Short district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public Byte getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(Byte shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getShipping_name() {
        return shipping_name;
    }

    public void setShipping_name(String shipping_name) {
        this.shipping_name = shipping_name;
    }

    public Byte getPay_id() {
        return pay_id;
    }

    public void setPay_id(Byte pay_id) {
        this.pay_id = pay_id;
    }

    public String getPay_name() {
        return pay_name;
    }

    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
    }

    public BigDecimal getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(BigDecimal shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public BigDecimal getActual_price() {
        return actual_price;
    }

    public void setActual_price(BigDecimal actual_price) {
        this.actual_price = actual_price;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getIntegral_money() {
        return integral_money;
    }

    public void setIntegral_money(BigDecimal integral_money) {
        this.integral_money = integral_money;
    }

    public BigDecimal getOrder_price() {
        return order_price;
    }

    public void setOrder_price(BigDecimal order_price) {
        this.order_price = order_price;
    }

    public BigDecimal getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(BigDecimal goods_price) {
        this.goods_price = goods_price;
    }

    public Integer getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    public Integer getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(Integer confirm_time) {
        this.confirm_time = confirm_time;
    }

    public Integer getPay_time() {
        return pay_time;
    }

    public void setPay_time(Integer pay_time) {
        this.pay_time = pay_time;
    }

    public Integer getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(Integer freight_price) {
        this.freight_price = freight_price;
    }

    public Integer getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Integer coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public BigDecimal getCoupon_price() {
        return coupon_price;
    }

    public void setCoupon_price(BigDecimal coupon_price) {
        this.coupon_price = coupon_price;
    }

    public String getCallback_status() {
        return callback_status;
    }

    public void setCallback_status(String callback_status) {
        this.callback_status = callback_status;
    }
}