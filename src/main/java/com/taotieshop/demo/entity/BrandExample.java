package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlIsNull() {
            addCriterion("list_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlIsNotNull() {
            addCriterion("list_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlEqualTo(String value) {
            addCriterion("list_pic_url =", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlNotEqualTo(String value) {
            addCriterion("list_pic_url <>", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlGreaterThan(String value) {
            addCriterion("list_pic_url >", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("list_pic_url >=", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlLessThan(String value) {
            addCriterion("list_pic_url <", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("list_pic_url <=", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlLike(String value) {
            addCriterion("list_pic_url like", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlNotLike(String value) {
            addCriterion("list_pic_url not like", value, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlIn(List<String> values) {
            addCriterion("list_pic_url in", values, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlNotIn(List<String> values) {
            addCriterion("list_pic_url not in", values, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlBetween(String value1, String value2) {
            addCriterion("list_pic_url between", value1, value2, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andList_pic_urlNotBetween(String value1, String value2) {
            addCriterion("list_pic_url not between", value1, value2, "list_pic_url");
            return (Criteria) this;
        }

        public Criteria andSimple_descIsNull() {
            addCriterion("simple_desc is null");
            return (Criteria) this;
        }

        public Criteria andSimple_descIsNotNull() {
            addCriterion("simple_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSimple_descEqualTo(String value) {
            addCriterion("simple_desc =", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descNotEqualTo(String value) {
            addCriterion("simple_desc <>", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descGreaterThan(String value) {
            addCriterion("simple_desc >", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descGreaterThanOrEqualTo(String value) {
            addCriterion("simple_desc >=", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descLessThan(String value) {
            addCriterion("simple_desc <", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descLessThanOrEqualTo(String value) {
            addCriterion("simple_desc <=", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descLike(String value) {
            addCriterion("simple_desc like", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descNotLike(String value) {
            addCriterion("simple_desc not like", value, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descIn(List<String> values) {
            addCriterion("simple_desc in", values, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descNotIn(List<String> values) {
            addCriterion("simple_desc not in", values, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descBetween(String value1, String value2) {
            addCriterion("simple_desc between", value1, value2, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andSimple_descNotBetween(String value1, String value2) {
            addCriterion("simple_desc not between", value1, value2, "simple_desc");
            return (Criteria) this;
        }

        public Criteria andPic_urlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPic_urlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPic_urlEqualTo(String value) {
            addCriterion("pic_url =", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlGreaterThan(String value) {
            addCriterion("pic_url >", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLessThan(String value) {
            addCriterion("pic_url <", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLike(String value) {
            addCriterion("pic_url like", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotLike(String value) {
            addCriterion("pic_url not like", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlIn(List<String> values) {
            addCriterion("pic_url in", values, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "pic_url");
            return (Criteria) this;
        }

        public Criteria andSort_orderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSort_orderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSort_orderEqualTo(Byte value) {
            addCriterion("sort_order =", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotEqualTo(Byte value) {
            addCriterion("sort_order <>", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThan(Byte value) {
            addCriterion("sort_order >", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort_order >=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThan(Byte value) {
            addCriterion("sort_order <", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThanOrEqualTo(Byte value) {
            addCriterion("sort_order <=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderIn(List<Byte> values) {
            addCriterion("sort_order in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotIn(List<Byte> values) {
            addCriterion("sort_order not in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderBetween(Byte value1, Byte value2) {
            addCriterion("sort_order between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotBetween(Byte value1, Byte value2) {
            addCriterion("sort_order not between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andIs_showIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIs_showIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIs_showEqualTo(String value) {
            addCriterion("is_show =", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotEqualTo(String value) {
            addCriterion("is_show <>", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThan(String value) {
            addCriterion("is_show >", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThanOrEqualTo(String value) {
            addCriterion("is_show >=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThan(String value) {
            addCriterion("is_show <", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThanOrEqualTo(String value) {
            addCriterion("is_show <=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showIn(List<String> values) {
            addCriterion("is_show in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotIn(List<String> values) {
            addCriterion("is_show not in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showBetween(String value1, String value2) {
            addCriterion("is_show between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotBetween(String value1, String value2) {
            addCriterion("is_show not between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andFloor_priceIsNull() {
            addCriterion("floor_price is null");
            return (Criteria) this;
        }

        public Criteria andFloor_priceIsNotNull() {
            addCriterion("floor_price is not null");
            return (Criteria) this;
        }

        public Criteria andFloor_priceEqualTo(BigDecimal value) {
            addCriterion("floor_price =", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceNotEqualTo(BigDecimal value) {
            addCriterion("floor_price <>", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceGreaterThan(BigDecimal value) {
            addCriterion("floor_price >", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("floor_price >=", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceLessThan(BigDecimal value) {
            addCriterion("floor_price <", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("floor_price <=", value, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceIn(List<BigDecimal> values) {
            addCriterion("floor_price in", values, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceNotIn(List<BigDecimal> values) {
            addCriterion("floor_price not in", values, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("floor_price between", value1, value2, "floor_price");
            return (Criteria) this;
        }

        public Criteria andFloor_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("floor_price not between", value1, value2, "floor_price");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlIsNull() {
            addCriterion("app_list_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlIsNotNull() {
            addCriterion("app_list_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlEqualTo(String value) {
            addCriterion("app_list_pic_url =", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlNotEqualTo(String value) {
            addCriterion("app_list_pic_url <>", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlGreaterThan(String value) {
            addCriterion("app_list_pic_url >", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("app_list_pic_url >=", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlLessThan(String value) {
            addCriterion("app_list_pic_url <", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("app_list_pic_url <=", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlLike(String value) {
            addCriterion("app_list_pic_url like", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlNotLike(String value) {
            addCriterion("app_list_pic_url not like", value, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlIn(List<String> values) {
            addCriterion("app_list_pic_url in", values, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlNotIn(List<String> values) {
            addCriterion("app_list_pic_url not in", values, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlBetween(String value1, String value2) {
            addCriterion("app_list_pic_url between", value1, value2, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andApp_list_pic_urlNotBetween(String value1, String value2) {
            addCriterion("app_list_pic_url not between", value1, value2, "app_list_pic_url");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIs_newEqualTo(String value) {
            addCriterion("is_new =", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotEqualTo(String value) {
            addCriterion("is_new <>", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThan(String value) {
            addCriterion("is_new >", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThanOrEqualTo(String value) {
            addCriterion("is_new >=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThan(String value) {
            addCriterion("is_new <", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThanOrEqualTo(String value) {
            addCriterion("is_new <=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newIn(List<String> values) {
            addCriterion("is_new in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotIn(List<String> values) {
            addCriterion("is_new not in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newBetween(String value1, String value2) {
            addCriterion("is_new between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotBetween(String value1, String value2) {
            addCriterion("is_new not between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlIsNull() {
            addCriterion("new_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlIsNotNull() {
            addCriterion("new_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlEqualTo(String value) {
            addCriterion("new_pic_url =", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlNotEqualTo(String value) {
            addCriterion("new_pic_url <>", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlGreaterThan(String value) {
            addCriterion("new_pic_url >", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("new_pic_url >=", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlLessThan(String value) {
            addCriterion("new_pic_url <", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("new_pic_url <=", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlLike(String value) {
            addCriterion("new_pic_url like", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlNotLike(String value) {
            addCriterion("new_pic_url not like", value, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlIn(List<String> values) {
            addCriterion("new_pic_url in", values, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlNotIn(List<String> values) {
            addCriterion("new_pic_url not in", values, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlBetween(String value1, String value2) {
            addCriterion("new_pic_url between", value1, value2, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_pic_urlNotBetween(String value1, String value2) {
            addCriterion("new_pic_url not between", value1, value2, "new_pic_url");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderIsNull() {
            addCriterion("new_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderIsNotNull() {
            addCriterion("new_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderEqualTo(Byte value) {
            addCriterion("new_sort_order =", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderNotEqualTo(Byte value) {
            addCriterion("new_sort_order <>", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderGreaterThan(Byte value) {
            addCriterion("new_sort_order >", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderGreaterThanOrEqualTo(Byte value) {
            addCriterion("new_sort_order >=", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderLessThan(Byte value) {
            addCriterion("new_sort_order <", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderLessThanOrEqualTo(Byte value) {
            addCriterion("new_sort_order <=", value, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderIn(List<Byte> values) {
            addCriterion("new_sort_order in", values, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderNotIn(List<Byte> values) {
            addCriterion("new_sort_order not in", values, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderBetween(Byte value1, Byte value2) {
            addCriterion("new_sort_order between", value1, value2, "new_sort_order");
            return (Criteria) this;
        }

        public Criteria andNew_sort_orderNotBetween(Byte value1, Byte value2) {
            addCriterion("new_sort_order not between", value1, value2, "new_sort_order");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}