package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andGoods_specification_idsIsNull() {
            addCriterion("goods_specification_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsIsNotNull() {
            addCriterion("goods_specification_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsEqualTo(String value) {
            addCriterion("goods_specification_ids =", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsNotEqualTo(String value) {
            addCriterion("goods_specification_ids <>", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsGreaterThan(String value) {
            addCriterion("goods_specification_ids >", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specification_ids >=", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsLessThan(String value) {
            addCriterion("goods_specification_ids <", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsLessThanOrEqualTo(String value) {
            addCriterion("goods_specification_ids <=", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsLike(String value) {
            addCriterion("goods_specification_ids like", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsNotLike(String value) {
            addCriterion("goods_specification_ids not like", value, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsIn(List<String> values) {
            addCriterion("goods_specification_ids in", values, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsNotIn(List<String> values) {
            addCriterion("goods_specification_ids not in", values, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsBetween(String value1, String value2) {
            addCriterion("goods_specification_ids between", value1, value2, "goods_specification_ids");
            return (Criteria) this;
        }

        public Criteria andGoods_specification_idsNotBetween(String value1, String value2) {
            addCriterion("goods_specification_ids not between", value1, value2, "goods_specification_ids");
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

        public Criteria andGoods_numberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goods_number");
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