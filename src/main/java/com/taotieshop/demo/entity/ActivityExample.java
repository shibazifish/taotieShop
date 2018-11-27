package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActivity_idIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivity_idIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_idEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idLessThan(Integer value) {
            addCriterion("activity_id <", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_nameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivity_nameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_nameEqualTo(String value) {
            addCriterion("activity_name =", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameLessThan(String value) {
            addCriterion("activity_name <", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameLike(String value) {
            addCriterion("activity_name like", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameNotLike(String value) {
            addCriterion("activity_name not like", value, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameIn(List<String> values) {
            addCriterion("activity_name in", values, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_nameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activity_name");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeIsNull() {
            addCriterion("activity_prize is null");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeIsNotNull() {
            addCriterion("activity_prize is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeEqualTo(String value) {
            addCriterion("activity_prize =", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeNotEqualTo(String value) {
            addCriterion("activity_prize <>", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeGreaterThan(String value) {
            addCriterion("activity_prize >", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_prize >=", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeLessThan(String value) {
            addCriterion("activity_prize <", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeLessThanOrEqualTo(String value) {
            addCriterion("activity_prize <=", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeLike(String value) {
            addCriterion("activity_prize like", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeNotLike(String value) {
            addCriterion("activity_prize not like", value, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeIn(List<String> values) {
            addCriterion("activity_prize in", values, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeNotIn(List<String> values) {
            addCriterion("activity_prize not in", values, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeBetween(String value1, String value2) {
            addCriterion("activity_prize between", value1, value2, "activity_prize");
            return (Criteria) this;
        }

        public Criteria andActivity_prizeNotBetween(String value1, String value2) {
            addCriterion("activity_prize not between", value1, value2, "activity_prize");
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