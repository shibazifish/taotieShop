package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterExample() {
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

        public Criteria andEnter_idIsNull() {
            addCriterion("enter_id is null");
            return (Criteria) this;
        }

        public Criteria andEnter_idIsNotNull() {
            addCriterion("enter_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnter_idEqualTo(Integer value) {
            addCriterion("enter_id =", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idNotEqualTo(Integer value) {
            addCriterion("enter_id <>", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idGreaterThan(Integer value) {
            addCriterion("enter_id >", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_id >=", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idLessThan(Integer value) {
            addCriterion("enter_id <", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idLessThanOrEqualTo(Integer value) {
            addCriterion("enter_id <=", value, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idIn(List<Integer> values) {
            addCriterion("enter_id in", values, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idNotIn(List<Integer> values) {
            addCriterion("enter_id not in", values, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idBetween(Integer value1, Integer value2) {
            addCriterion("enter_id between", value1, value2, "enter_id");
            return (Criteria) this;
        }

        public Criteria andEnter_idNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_id not between", value1, value2, "enter_id");
            return (Criteria) this;
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

        public Criteria andWechat_numberIsNull() {
            addCriterion("wechat_number is null");
            return (Criteria) this;
        }

        public Criteria andWechat_numberIsNotNull() {
            addCriterion("wechat_number is not null");
            return (Criteria) this;
        }

        public Criteria andWechat_numberEqualTo(String value) {
            addCriterion("wechat_number =", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberNotEqualTo(String value) {
            addCriterion("wechat_number <>", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberGreaterThan(String value) {
            addCriterion("wechat_number >", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_number >=", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberLessThan(String value) {
            addCriterion("wechat_number <", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberLessThanOrEqualTo(String value) {
            addCriterion("wechat_number <=", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberLike(String value) {
            addCriterion("wechat_number like", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberNotLike(String value) {
            addCriterion("wechat_number not like", value, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberIn(List<String> values) {
            addCriterion("wechat_number in", values, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberNotIn(List<String> values) {
            addCriterion("wechat_number not in", values, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberBetween(String value1, String value2) {
            addCriterion("wechat_number between", value1, value2, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andWechat_numberNotBetween(String value1, String value2) {
            addCriterion("wechat_number not between", value1, value2, "wechat_number");
            return (Criteria) this;
        }

        public Criteria andEnter_descIsNull() {
            addCriterion("enter_desc is null");
            return (Criteria) this;
        }

        public Criteria andEnter_descIsNotNull() {
            addCriterion("enter_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEnter_descEqualTo(String value) {
            addCriterion("enter_desc =", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descNotEqualTo(String value) {
            addCriterion("enter_desc <>", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descGreaterThan(String value) {
            addCriterion("enter_desc >", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descGreaterThanOrEqualTo(String value) {
            addCriterion("enter_desc >=", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descLessThan(String value) {
            addCriterion("enter_desc <", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descLessThanOrEqualTo(String value) {
            addCriterion("enter_desc <=", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descLike(String value) {
            addCriterion("enter_desc like", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descNotLike(String value) {
            addCriterion("enter_desc not like", value, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descIn(List<String> values) {
            addCriterion("enter_desc in", values, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descNotIn(List<String> values) {
            addCriterion("enter_desc not in", values, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descBetween(String value1, String value2) {
            addCriterion("enter_desc between", value1, value2, "enter_desc");
            return (Criteria) this;
        }

        public Criteria andEnter_descNotBetween(String value1, String value2) {
            addCriterion("enter_desc not between", value1, value2, "enter_desc");
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

        public Criteria andCreate_nameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreate_nameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_nameEqualTo(String value) {
            addCriterion("create_name =", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameGreaterThan(String value) {
            addCriterion("create_name >", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameLessThan(String value) {
            addCriterion("create_name <", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameLike(String value) {
            addCriterion("create_name like", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameNotLike(String value) {
            addCriterion("create_name not like", value, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameIn(List<String> values) {
            addCriterion("create_name in", values, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreate_nameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "create_name");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatarUrl is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatarUrl =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatarUrl <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatarUrl >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatarUrl >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatarUrl <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatarUrl <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatarUrl like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatarUrl not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatarUrl in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatarUrl not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatarUrl between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatarUrl not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andEnter_statusIsNull() {
            addCriterion("enter_status is null");
            return (Criteria) this;
        }

        public Criteria andEnter_statusIsNotNull() {
            addCriterion("enter_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnter_statusEqualTo(String value) {
            addCriterion("enter_status =", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusNotEqualTo(String value) {
            addCriterion("enter_status <>", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusGreaterThan(String value) {
            addCriterion("enter_status >", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusGreaterThanOrEqualTo(String value) {
            addCriterion("enter_status >=", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusLessThan(String value) {
            addCriterion("enter_status <", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusLessThanOrEqualTo(String value) {
            addCriterion("enter_status <=", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusLike(String value) {
            addCriterion("enter_status like", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusNotLike(String value) {
            addCriterion("enter_status not like", value, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusIn(List<String> values) {
            addCriterion("enter_status in", values, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusNotIn(List<String> values) {
            addCriterion("enter_status not in", values, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusBetween(String value1, String value2) {
            addCriterion("enter_status between", value1, value2, "enter_status");
            return (Criteria) this;
        }

        public Criteria andEnter_statusNotBetween(String value1, String value2) {
            addCriterion("enter_status not between", value1, value2, "enter_status");
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