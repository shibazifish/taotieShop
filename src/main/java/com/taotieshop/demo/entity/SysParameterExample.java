package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class SysParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysParameterExample() {
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

        public Criteria andSYS_PARA_IDIsNull() {
            addCriterion("SYS_PARA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDIsNotNull() {
            addCriterion("SYS_PARA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDEqualTo(Integer value) {
            addCriterion("SYS_PARA_ID =", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDNotEqualTo(Integer value) {
            addCriterion("SYS_PARA_ID <>", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDGreaterThan(Integer value) {
            addCriterion("SYS_PARA_ID >", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_PARA_ID >=", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDLessThan(Integer value) {
            addCriterion("SYS_PARA_ID <", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_PARA_ID <=", value, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDIn(List<Integer> values) {
            addCriterion("SYS_PARA_ID in", values, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDNotIn(List<Integer> values) {
            addCriterion("SYS_PARA_ID not in", values, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDBetween(Integer value1, Integer value2) {
            addCriterion("SYS_PARA_ID between", value1, value2, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andSYS_PARA_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_PARA_ID not between", value1, value2, "SYS_PARA_ID");
            return (Criteria) this;
        }

        public Criteria andPara_nameIsNull() {
            addCriterion("para_name is null");
            return (Criteria) this;
        }

        public Criteria andPara_nameIsNotNull() {
            addCriterion("para_name is not null");
            return (Criteria) this;
        }

        public Criteria andPara_nameEqualTo(String value) {
            addCriterion("para_name =", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameNotEqualTo(String value) {
            addCriterion("para_name <>", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameGreaterThan(String value) {
            addCriterion("para_name >", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameGreaterThanOrEqualTo(String value) {
            addCriterion("para_name >=", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameLessThan(String value) {
            addCriterion("para_name <", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameLessThanOrEqualTo(String value) {
            addCriterion("para_name <=", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameLike(String value) {
            addCriterion("para_name like", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameNotLike(String value) {
            addCriterion("para_name not like", value, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameIn(List<String> values) {
            addCriterion("para_name in", values, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameNotIn(List<String> values) {
            addCriterion("para_name not in", values, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameBetween(String value1, String value2) {
            addCriterion("para_name between", value1, value2, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_nameNotBetween(String value1, String value2) {
            addCriterion("para_name not between", value1, value2, "para_name");
            return (Criteria) this;
        }

        public Criteria andPara_valueIsNull() {
            addCriterion("para_value is null");
            return (Criteria) this;
        }

        public Criteria andPara_valueIsNotNull() {
            addCriterion("para_value is not null");
            return (Criteria) this;
        }

        public Criteria andPara_valueEqualTo(String value) {
            addCriterion("para_value =", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueNotEqualTo(String value) {
            addCriterion("para_value <>", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueGreaterThan(String value) {
            addCriterion("para_value >", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueGreaterThanOrEqualTo(String value) {
            addCriterion("para_value >=", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueLessThan(String value) {
            addCriterion("para_value <", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueLessThanOrEqualTo(String value) {
            addCriterion("para_value <=", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueLike(String value) {
            addCriterion("para_value like", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueNotLike(String value) {
            addCriterion("para_value not like", value, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueIn(List<String> values) {
            addCriterion("para_value in", values, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueNotIn(List<String> values) {
            addCriterion("para_value not in", values, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueBetween(String value1, String value2) {
            addCriterion("para_value between", value1, value2, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_valueNotBetween(String value1, String value2) {
            addCriterion("para_value not between", value1, value2, "para_value");
            return (Criteria) this;
        }

        public Criteria andPara_codeIsNull() {
            addCriterion("para_code is null");
            return (Criteria) this;
        }

        public Criteria andPara_codeIsNotNull() {
            addCriterion("para_code is not null");
            return (Criteria) this;
        }

        public Criteria andPara_codeEqualTo(String value) {
            addCriterion("para_code =", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeNotEqualTo(String value) {
            addCriterion("para_code <>", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeGreaterThan(String value) {
            addCriterion("para_code >", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeGreaterThanOrEqualTo(String value) {
            addCriterion("para_code >=", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeLessThan(String value) {
            addCriterion("para_code <", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeLessThanOrEqualTo(String value) {
            addCriterion("para_code <=", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeLike(String value) {
            addCriterion("para_code like", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeNotLike(String value) {
            addCriterion("para_code not like", value, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeIn(List<String> values) {
            addCriterion("para_code in", values, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeNotIn(List<String> values) {
            addCriterion("para_code not in", values, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeBetween(String value1, String value2) {
            addCriterion("para_code between", value1, value2, "para_code");
            return (Criteria) this;
        }

        public Criteria andPara_codeNotBetween(String value1, String value2) {
            addCriterion("para_code not between", value1, value2, "para_code");
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