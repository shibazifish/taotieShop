package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClockExample() {
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

        public Criteria andClock_idIsNull() {
            addCriterion("clock_id is null");
            return (Criteria) this;
        }

        public Criteria andClock_idIsNotNull() {
            addCriterion("clock_id is not null");
            return (Criteria) this;
        }

        public Criteria andClock_idEqualTo(Integer value) {
            addCriterion("clock_id =", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idNotEqualTo(Integer value) {
            addCriterion("clock_id <>", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idGreaterThan(Integer value) {
            addCriterion("clock_id >", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("clock_id >=", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idLessThan(Integer value) {
            addCriterion("clock_id <", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idLessThanOrEqualTo(Integer value) {
            addCriterion("clock_id <=", value, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idIn(List<Integer> values) {
            addCriterion("clock_id in", values, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idNotIn(List<Integer> values) {
            addCriterion("clock_id not in", values, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idBetween(Integer value1, Integer value2) {
            addCriterion("clock_id between", value1, value2, "clock_id");
            return (Criteria) this;
        }

        public Criteria andClock_idNotBetween(Integer value1, Integer value2) {
            addCriterion("clock_id not between", value1, value2, "clock_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpen_idIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpen_idEqualTo(String value) {
            addCriterion("open_id =", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idNotEqualTo(String value) {
            addCriterion("open_id <>", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idGreaterThan(String value) {
            addCriterion("open_id >", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idLessThan(String value) {
            addCriterion("open_id <", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idLike(String value) {
            addCriterion("open_id like", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idNotLike(String value) {
            addCriterion("open_id not like", value, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idIn(List<String> values) {
            addCriterion("open_id in", values, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idNotIn(List<String> values) {
            addCriterion("open_id not in", values, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "open_id");
            return (Criteria) this;
        }

        public Criteria andOpen_idNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "open_id");
            return (Criteria) this;
        }

        public Criteria andRun_dataIsNull() {
            addCriterion("run_data is null");
            return (Criteria) this;
        }

        public Criteria andRun_dataIsNotNull() {
            addCriterion("run_data is not null");
            return (Criteria) this;
        }

        public Criteria andRun_dataEqualTo(Integer value) {
            addCriterion("run_data =", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataNotEqualTo(Integer value) {
            addCriterion("run_data <>", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataGreaterThan(Integer value) {
            addCriterion("run_data >", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_data >=", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataLessThan(Integer value) {
            addCriterion("run_data <", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataLessThanOrEqualTo(Integer value) {
            addCriterion("run_data <=", value, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataIn(List<Integer> values) {
            addCriterion("run_data in", values, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataNotIn(List<Integer> values) {
            addCriterion("run_data not in", values, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataBetween(Integer value1, Integer value2) {
            addCriterion("run_data between", value1, value2, "run_data");
            return (Criteria) this;
        }

        public Criteria andRun_dataNotBetween(Integer value1, Integer value2) {
            addCriterion("run_data not between", value1, value2, "run_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataIsNull() {
            addCriterion("ice_data is null");
            return (Criteria) this;
        }

        public Criteria andIce_dataIsNotNull() {
            addCriterion("ice_data is not null");
            return (Criteria) this;
        }

        public Criteria andIce_dataEqualTo(Integer value) {
            addCriterion("ice_data =", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataNotEqualTo(Integer value) {
            addCriterion("ice_data <>", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataGreaterThan(Integer value) {
            addCriterion("ice_data >", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataGreaterThanOrEqualTo(Integer value) {
            addCriterion("ice_data >=", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataLessThan(Integer value) {
            addCriterion("ice_data <", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataLessThanOrEqualTo(Integer value) {
            addCriterion("ice_data <=", value, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataIn(List<Integer> values) {
            addCriterion("ice_data in", values, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataNotIn(List<Integer> values) {
            addCriterion("ice_data not in", values, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataBetween(Integer value1, Integer value2) {
            addCriterion("ice_data between", value1, value2, "ice_data");
            return (Criteria) this;
        }

        public Criteria andIce_dataNotBetween(Integer value1, Integer value2) {
            addCriterion("ice_data not between", value1, value2, "ice_data");
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

        public Criteria andForm_idIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andForm_idIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andForm_idEqualTo(String value) {
            addCriterion("form_id =", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idNotEqualTo(String value) {
            addCriterion("form_id <>", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idGreaterThan(String value) {
            addCriterion("form_id >", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idGreaterThanOrEqualTo(String value) {
            addCriterion("form_id >=", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idLessThan(String value) {
            addCriterion("form_id <", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idLessThanOrEqualTo(String value) {
            addCriterion("form_id <=", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idLike(String value) {
            addCriterion("form_id like", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idNotLike(String value) {
            addCriterion("form_id not like", value, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idIn(List<String> values) {
            addCriterion("form_id in", values, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idNotIn(List<String> values) {
            addCriterion("form_id not in", values, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idBetween(String value1, String value2) {
            addCriterion("form_id between", value1, value2, "form_id");
            return (Criteria) this;
        }

        public Criteria andForm_idNotBetween(String value1, String value2) {
            addCriterion("form_id not between", value1, value2, "form_id");
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