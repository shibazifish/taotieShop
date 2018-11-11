package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andFront_descIsNull() {
            addCriterion("front_desc is null");
            return (Criteria) this;
        }

        public Criteria andFront_descIsNotNull() {
            addCriterion("front_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFront_descEqualTo(String value) {
            addCriterion("front_desc =", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descNotEqualTo(String value) {
            addCriterion("front_desc <>", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descGreaterThan(String value) {
            addCriterion("front_desc >", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descGreaterThanOrEqualTo(String value) {
            addCriterion("front_desc >=", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descLessThan(String value) {
            addCriterion("front_desc <", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descLessThanOrEqualTo(String value) {
            addCriterion("front_desc <=", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descLike(String value) {
            addCriterion("front_desc like", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descNotLike(String value) {
            addCriterion("front_desc not like", value, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descIn(List<String> values) {
            addCriterion("front_desc in", values, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descNotIn(List<String> values) {
            addCriterion("front_desc not in", values, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descBetween(String value1, String value2) {
            addCriterion("front_desc between", value1, value2, "front_desc");
            return (Criteria) this;
        }

        public Criteria andFront_descNotBetween(String value1, String value2) {
            addCriterion("front_desc not between", value1, value2, "front_desc");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent_idEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThan(Integer value) {
            addCriterion("parent_id <", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parent_id");
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

        public Criteria andSort_orderEqualTo(Boolean value) {
            addCriterion("sort_order =", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotEqualTo(Boolean value) {
            addCriterion("sort_order <>", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThan(Boolean value) {
            addCriterion("sort_order >", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sort_order >=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThan(Boolean value) {
            addCriterion("sort_order <", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThanOrEqualTo(Boolean value) {
            addCriterion("sort_order <=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderIn(List<Boolean> values) {
            addCriterion("sort_order in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotIn(List<Boolean> values) {
            addCriterion("sort_order not in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderBetween(Boolean value1, Boolean value2) {
            addCriterion("sort_order between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sort_order not between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andShow_indexIsNull() {
            addCriterion("show_index is null");
            return (Criteria) this;
        }

        public Criteria andShow_indexIsNotNull() {
            addCriterion("show_index is not null");
            return (Criteria) this;
        }

        public Criteria andShow_indexEqualTo(Boolean value) {
            addCriterion("show_index =", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexNotEqualTo(Boolean value) {
            addCriterion("show_index <>", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexGreaterThan(Boolean value) {
            addCriterion("show_index >", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_index >=", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexLessThan(Boolean value) {
            addCriterion("show_index <", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexLessThanOrEqualTo(Boolean value) {
            addCriterion("show_index <=", value, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexIn(List<Boolean> values) {
            addCriterion("show_index in", values, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexNotIn(List<Boolean> values) {
            addCriterion("show_index not in", values, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexBetween(Boolean value1, Boolean value2) {
            addCriterion("show_index between", value1, value2, "show_index");
            return (Criteria) this;
        }

        public Criteria andShow_indexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_index not between", value1, value2, "show_index");
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

        public Criteria andIs_showEqualTo(Boolean value) {
            addCriterion("is_show =", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThan(Boolean value) {
            addCriterion("is_show <", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showIn(List<Boolean> values) {
            addCriterion("is_show in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andBanner_urlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBanner_urlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBanner_urlEqualTo(String value) {
            addCriterion("banner_url =", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlGreaterThan(String value) {
            addCriterion("banner_url >", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlLessThan(String value) {
            addCriterion("banner_url <", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlLike(String value) {
            addCriterion("banner_url like", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlNotLike(String value) {
            addCriterion("banner_url not like", value, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlIn(List<String> values) {
            addCriterion("banner_url in", values, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "banner_url");
            return (Criteria) this;
        }

        public Criteria andBanner_urlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "banner_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIcon_urlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIcon_urlEqualTo(String value) {
            addCriterion("icon_url =", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlGreaterThan(String value) {
            addCriterion("icon_url >", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlLessThan(String value) {
            addCriterion("icon_url <", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlLike(String value) {
            addCriterion("icon_url like", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlNotLike(String value) {
            addCriterion("icon_url not like", value, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlIn(List<String> values) {
            addCriterion("icon_url in", values, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "icon_url");
            return (Criteria) this;
        }

        public Criteria andIcon_urlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "icon_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImg_urlEqualTo(String value) {
            addCriterion("img_url =", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThan(String value) {
            addCriterion("img_url >", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThan(String value) {
            addCriterion("img_url <", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLike(String value) {
            addCriterion("img_url like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotLike(String value) {
            addCriterion("img_url not like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlIn(List<String> values) {
            addCriterion("img_url in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlIsNull() {
            addCriterion("wap_banner_url is null");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlIsNotNull() {
            addCriterion("wap_banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlEqualTo(String value) {
            addCriterion("wap_banner_url =", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlNotEqualTo(String value) {
            addCriterion("wap_banner_url <>", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlGreaterThan(String value) {
            addCriterion("wap_banner_url >", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlGreaterThanOrEqualTo(String value) {
            addCriterion("wap_banner_url >=", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlLessThan(String value) {
            addCriterion("wap_banner_url <", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlLessThanOrEqualTo(String value) {
            addCriterion("wap_banner_url <=", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlLike(String value) {
            addCriterion("wap_banner_url like", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlNotLike(String value) {
            addCriterion("wap_banner_url not like", value, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlIn(List<String> values) {
            addCriterion("wap_banner_url in", values, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlNotIn(List<String> values) {
            addCriterion("wap_banner_url not in", values, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlBetween(String value1, String value2) {
            addCriterion("wap_banner_url between", value1, value2, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andWap_banner_urlNotBetween(String value1, String value2) {
            addCriterion("wap_banner_url not between", value1, value2, "wap_banner_url");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFront_nameIsNull() {
            addCriterion("front_name is null");
            return (Criteria) this;
        }

        public Criteria andFront_nameIsNotNull() {
            addCriterion("front_name is not null");
            return (Criteria) this;
        }

        public Criteria andFront_nameEqualTo(String value) {
            addCriterion("front_name =", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameNotEqualTo(String value) {
            addCriterion("front_name <>", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameGreaterThan(String value) {
            addCriterion("front_name >", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameGreaterThanOrEqualTo(String value) {
            addCriterion("front_name >=", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameLessThan(String value) {
            addCriterion("front_name <", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameLessThanOrEqualTo(String value) {
            addCriterion("front_name <=", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameLike(String value) {
            addCriterion("front_name like", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameNotLike(String value) {
            addCriterion("front_name not like", value, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameIn(List<String> values) {
            addCriterion("front_name in", values, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameNotIn(List<String> values) {
            addCriterion("front_name not in", values, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameBetween(String value1, String value2) {
            addCriterion("front_name between", value1, value2, "front_name");
            return (Criteria) this;
        }

        public Criteria andFront_nameNotBetween(String value1, String value2) {
            addCriterion("front_name not between", value1, value2, "front_name");
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