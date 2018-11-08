package com.taotieshop.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 23:17
 * @Description:
 */
@Entity
@Table(name = "nideshop_goods", schema = "nideshop", catalog = "")
public class NideshopGoods {
    private int id;
    private int categoryId;
    private String goodsSn;
    private String name;
    private int brandId;
    private int goodsNumber;
    private String keywords;
    private String goodsBrief;
    private String goodsDesc;
    private String isOnSale;
    private int addTime;
    private short sortOrder;
    private String isDelete;
    private int attributeCategory;
    private BigDecimal counterPrice;
    private BigDecimal extraPrice;
    private String isNew;
    private String goodsUnit;
    private String primaryPicUrl;
    private String listPicUrl;
    private BigDecimal retailPrice;
    private int sellVolume;
    private int primaryProductId;
    private BigDecimal unitPrice;
    private String promotionDesc;
    private String promotionTag;
    private BigDecimal appExclusivePrice;
    private String isAppExclusive;
    private String isLimited;
    private String isHot;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "goods_sn")
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "brand_id")
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "goods_number")
    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "goods_brief")
    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    @Basic
    @Column(name = "goods_desc")
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Basic
    @Column(name = "is_on_sale")
    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Basic
    @Column(name = "add_time")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "sort_order")
    public short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "is_delete")
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "attribute_category")
    public int getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(int attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    @Basic
    @Column(name = "counter_price")
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    @Basic
    @Column(name = "extra_price")
    public BigDecimal getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(BigDecimal extraPrice) {
        this.extraPrice = extraPrice;
    }

    @Basic
    @Column(name = "is_new")
    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "goods_unit")
    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    @Basic
    @Column(name = "primary_pic_url")
    public String getPrimaryPicUrl() {
        return primaryPicUrl;
    }

    public void setPrimaryPicUrl(String primaryPicUrl) {
        this.primaryPicUrl = primaryPicUrl;
    }

    @Basic
    @Column(name = "list_pic_url")
    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    @Basic
    @Column(name = "retail_price")
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "sell_volume")
    public int getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(int sellVolume) {
        this.sellVolume = sellVolume;
    }

    @Basic
    @Column(name = "primary_product_id")
    public int getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(int primaryProductId) {
        this.primaryProductId = primaryProductId;
    }

    @Basic
    @Column(name = "unit_price")
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "promotion_desc")
    public String getPromotionDesc() {
        return promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    @Basic
    @Column(name = "promotion_tag")
    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    @Basic
    @Column(name = "app_exclusive_price")
    public BigDecimal getAppExclusivePrice() {
        return appExclusivePrice;
    }

    public void setAppExclusivePrice(BigDecimal appExclusivePrice) {
        this.appExclusivePrice = appExclusivePrice;
    }

    @Basic
    @Column(name = "is_app_exclusive")
    public String getIsAppExclusive() {
        return isAppExclusive;
    }

    public void setIsAppExclusive(String isAppExclusive) {
        this.isAppExclusive = isAppExclusive;
    }

    @Basic
    @Column(name = "is_limited")
    public String getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(String isLimited) {
        this.isLimited = isLimited;
    }

    @Basic
    @Column(name = "is_hot")
    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NideshopGoods that = (NideshopGoods) o;
        return id == that.id &&
                categoryId == that.categoryId &&
                brandId == that.brandId &&
                goodsNumber == that.goodsNumber &&
                isOnSale == that.isOnSale &&
                addTime == that.addTime &&
                sortOrder == that.sortOrder &&
                isDelete == that.isDelete &&
                attributeCategory == that.attributeCategory &&
                isNew == that.isNew &&
                sellVolume == that.sellVolume &&
                primaryProductId == that.primaryProductId &&
                isAppExclusive == that.isAppExclusive &&
                isLimited == that.isLimited &&
                isHot == that.isHot &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(name, that.name) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(goodsBrief, that.goodsBrief) &&
                Objects.equals(goodsDesc, that.goodsDesc) &&
                Objects.equals(counterPrice, that.counterPrice) &&
                Objects.equals(extraPrice, that.extraPrice) &&
                Objects.equals(goodsUnit, that.goodsUnit) &&
                Objects.equals(primaryPicUrl, that.primaryPicUrl) &&
                Objects.equals(listPicUrl, that.listPicUrl) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(promotionDesc, that.promotionDesc) &&
                Objects.equals(promotionTag, that.promotionTag) &&
                Objects.equals(appExclusivePrice, that.appExclusivePrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, categoryId, goodsSn, name, brandId, goodsNumber, keywords, goodsBrief, goodsDesc, isOnSale, addTime, sortOrder, isDelete, attributeCategory, counterPrice, extraPrice, isNew, goodsUnit, primaryPicUrl, listPicUrl, retailPrice, sellVolume, primaryProductId, unitPrice, promotionDesc, promotionTag, appExclusivePrice, isAppExclusive, isLimited, isHot);
    }
}
