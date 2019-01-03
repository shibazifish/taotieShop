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

        public Criteria andActivity_infoIsNull() {
            addCriterion("activity_info is null");
            return (Criteria) this;
        }

        public Criteria andActivity_infoIsNotNull() {
            addCriterion("activity_info is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_infoEqualTo(String value) {
            addCriterion("activity_info =", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoNotEqualTo(String value) {
            addCriterion("activity_info <>", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoGreaterThan(String value) {
            addCriterion("activity_info >", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoGreaterThanOrEqualTo(String value) {
            addCriterion("activity_info >=", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoLessThan(String value) {
            addCriterion("activity_info <", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoLessThanOrEqualTo(String value) {
            addCriterion("activity_info <=", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoLike(String value) {
            addCriterion("activity_info like", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoNotLike(String value) {
            addCriterion("activity_info not like", value, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoIn(List<String> values) {
            addCriterion("activity_info in", values, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoNotIn(List<String> values) {
            addCriterion("activity_info not in", values, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoBetween(String value1, String value2) {
            addCriterion("activity_info between", value1, value2, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_infoNotBetween(String value1, String value2) {
            addCriterion("activity_info not between", value1, value2, "activity_info");
            return (Criteria) this;
        }

        public Criteria andActivity_statusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivity_statusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_statusEqualTo(String value) {
            addCriterion("activity_status =", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusNotEqualTo(String value) {
            addCriterion("activity_status <>", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusGreaterThan(String value) {
            addCriterion("activity_status >", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusGreaterThanOrEqualTo(String value) {
            addCriterion("activity_status >=", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusLessThan(String value) {
            addCriterion("activity_status <", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusLessThanOrEqualTo(String value) {
            addCriterion("activity_status <=", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusLike(String value) {
            addCriterion("activity_status like", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusNotLike(String value) {
            addCriterion("activity_status not like", value, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusIn(List<String> values) {
            addCriterion("activity_status in", values, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusNotIn(List<String> values) {
            addCriterion("activity_status not in", values, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusBetween(String value1, String value2) {
            addCriterion("activity_status between", value1, value2, "activity_status");
            return (Criteria) this;
        }

        public Criteria andActivity_statusNotBetween(String value1, String value2) {
            addCriterion("activity_status not between", value1, value2, "activity_status");
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

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(Date value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(Date value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(Date value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<Date> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
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