package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeExample() {
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

        public Criteria andGoods_descIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoods_descIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_descEqualTo(String value) {
            addCriterion("goods_desc =", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLessThan(String value) {
            addCriterion("goods_desc <", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLike(String value) {
            addCriterion("goods_desc like", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotLike(String value) {
            addCriterion("goods_desc not like", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descIn(List<String> values) {
            addCriterion("goods_desc in", values, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andGoods_urlIsNull() {
            addCriterion("goods_url is null");
            return (Criteria) this;
        }

        public Criteria andGoods_urlIsNotNull() {
            addCriterion("goods_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_urlEqualTo(String value) {
            addCriterion("goods_url =", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlNotEqualTo(String value) {
            addCriterion("goods_url <>", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlGreaterThan(String value) {
            addCriterion("goods_url >", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_url >=", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlLessThan(String value) {
            addCriterion("goods_url <", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlLessThanOrEqualTo(String value) {
            addCriterion("goods_url <=", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlLike(String value) {
            addCriterion("goods_url like", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlNotLike(String value) {
            addCriterion("goods_url not like", value, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlIn(List<String> values) {
            addCriterion("goods_url in", values, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlNotIn(List<String> values) {
            addCriterion("goods_url not in", values, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlBetween(String value1, String value2) {
            addCriterion("goods_url between", value1, value2, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_urlNotBetween(String value1, String value2) {
            addCriterion("goods_url not between", value1, value2, "goods_url");
            return (Criteria) this;
        }

        public Criteria andGoods_iceIsNull() {
            addCriterion("goods_ice is null");
            return (Criteria) this;
        }

        public Criteria andGoods_iceIsNotNull() {
            addCriterion("goods_ice is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_iceEqualTo(Integer value) {
            addCriterion("goods_ice =", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceNotEqualTo(Integer value) {
            addCriterion("goods_ice <>", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceGreaterThan(Integer value) {
            addCriterion("goods_ice >", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_ice >=", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceLessThan(Integer value) {
            addCriterion("goods_ice <", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceLessThanOrEqualTo(Integer value) {
            addCriterion("goods_ice <=", value, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceIn(List<Integer> values) {
            addCriterion("goods_ice in", values, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceNotIn(List<Integer> values) {
            addCriterion("goods_ice not in", values, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceBetween(Integer value1, Integer value2) {
            addCriterion("goods_ice between", value1, value2, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_iceNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_ice not between", value1, value2, "goods_ice");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_priceEqualTo(Long value) {
            addCriterion("goods_price =", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotEqualTo(Long value) {
            addCriterion("goods_price <>", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThan(Long value) {
            addCriterion("goods_price >", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_price >=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThan(Long value) {
            addCriterion("goods_price <", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThanOrEqualTo(Long value) {
            addCriterion("goods_price <=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIn(List<Long> values) {
            addCriterion("goods_price in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotIn(List<Long> values) {
            addCriterion("goods_price not in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceBetween(Long value1, Long value2) {
            addCriterion("goods_price between", value1, value2, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotBetween(Long value1, Long value2) {
            addCriterion("goods_price not between", value1, value2, "goods_price");
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