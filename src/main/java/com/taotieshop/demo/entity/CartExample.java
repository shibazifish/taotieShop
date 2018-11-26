package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andSession_idIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSession_idIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSession_idEqualTo(String value) {
            addCriterion("session_id =", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idNotEqualTo(String value) {
            addCriterion("session_id <>", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idGreaterThan(String value) {
            addCriterion("session_id >", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idLessThan(String value) {
            addCriterion("session_id <", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idLike(String value) {
            addCriterion("session_id like", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idNotLike(String value) {
            addCriterion("session_id not like", value, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idIn(List<String> values) {
            addCriterion("session_id in", values, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idNotIn(List<String> values) {
            addCriterion("session_id not in", values, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "session_id");
            return (Criteria) this;
        }

        public Criteria andSession_idNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "session_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_idEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Integer value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_snEqualTo(String value) {
            addCriterion("goods_sn =", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThan(String value) {
            addCriterion("goods_sn <", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLike(String value) {
            addCriterion("goods_sn like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotLike(String value) {
            addCriterion("goods_sn not like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snIn(List<String> values) {
            addCriterion("goods_sn in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameEqualTo(String value) {
            addCriterion("goods_name =", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThan(String value) {
            addCriterion("goods_name <", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLike(String value) {
            addCriterion("goods_name like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotLike(String value) {
            addCriterion("goods_name not like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIn(List<String> values) {
            addCriterion("goods_name in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetail_priceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetail_priceEqualTo(BigDecimal value) {
            addCriterion("retail_price =", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceNotEqualTo(BigDecimal value) {
            addCriterion("retail_price <>", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceGreaterThan(BigDecimal value) {
            addCriterion("retail_price >", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price >=", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceLessThan(BigDecimal value) {
            addCriterion("retail_price <", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price <=", value, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceIn(List<BigDecimal> values) {
            addCriterion("retail_price in", values, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceNotIn(List<BigDecimal> values) {
            addCriterion("retail_price not in", values, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price between", value1, value2, "retail_price");
            return (Criteria) this;
        }

        public Criteria andRetail_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price not between", value1, value2, "retail_price");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Short value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Short value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Short value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Short value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Short value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Short> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Short> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Short value1, Short value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Short value1, Short value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsIsNull() {
            addCriterion("goods_specifition_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsIsNotNull() {
            addCriterion("goods_specifition_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsEqualTo(String value) {
            addCriterion("goods_specifition_ids =", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsNotEqualTo(String value) {
            addCriterion("goods_specifition_ids <>", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsGreaterThan(String value) {
            addCriterion("goods_specifition_ids >", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specifition_ids >=", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsLessThan(String value) {
            addCriterion("goods_specifition_ids <", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsLessThanOrEqualTo(String value) {
            addCriterion("goods_specifition_ids <=", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsLike(String value) {
            addCriterion("goods_specifition_ids like", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsNotLike(String value) {
            addCriterion("goods_specifition_ids not like", value, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsIn(List<String> values) {
            addCriterion("goods_specifition_ids in", values, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsNotIn(List<String> values) {
            addCriterion("goods_specifition_ids not in", values, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsBetween(String value1, String value2) {
            addCriterion("goods_specifition_ids between", value1, value2, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specifition_idsNotBetween(String value1, String value2) {
            addCriterion("goods_specifition_ids not between", value1, value2, "goods_specifition_ids");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Boolean value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Boolean value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Boolean value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Boolean value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Boolean> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Boolean> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checked not between", value1, value2, "checked");
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