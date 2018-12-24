package com.taotieshop.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class StarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StarExample() {
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

        public Criteria andStar_idIsNull() {
            addCriterion("star_id is null");
            return (Criteria) this;
        }

        public Criteria andStar_idIsNotNull() {
            addCriterion("star_id is not null");
            return (Criteria) this;
        }

        public Criteria andStar_idEqualTo(Integer value) {
            addCriterion("star_id =", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idNotEqualTo(Integer value) {
            addCriterion("star_id <>", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idGreaterThan(Integer value) {
            addCriterion("star_id >", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("star_id >=", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idLessThan(Integer value) {
            addCriterion("star_id <", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idLessThanOrEqualTo(Integer value) {
            addCriterion("star_id <=", value, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idIn(List<Integer> values) {
            addCriterion("star_id in", values, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idNotIn(List<Integer> values) {
            addCriterion("star_id not in", values, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idBetween(Integer value1, Integer value2) {
            addCriterion("star_id between", value1, value2, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_idNotBetween(Integer value1, Integer value2) {
            addCriterion("star_id not between", value1, value2, "star_id");
            return (Criteria) this;
        }

        public Criteria andStar_imgIsNull() {
            addCriterion("star_img is null");
            return (Criteria) this;
        }

        public Criteria andStar_imgIsNotNull() {
            addCriterion("star_img is not null");
            return (Criteria) this;
        }

        public Criteria andStar_imgEqualTo(String value) {
            addCriterion("star_img =", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgNotEqualTo(String value) {
            addCriterion("star_img <>", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgGreaterThan(String value) {
            addCriterion("star_img >", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgGreaterThanOrEqualTo(String value) {
            addCriterion("star_img >=", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgLessThan(String value) {
            addCriterion("star_img <", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgLessThanOrEqualTo(String value) {
            addCriterion("star_img <=", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgLike(String value) {
            addCriterion("star_img like", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgNotLike(String value) {
            addCriterion("star_img not like", value, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgIn(List<String> values) {
            addCriterion("star_img in", values, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgNotIn(List<String> values) {
            addCriterion("star_img not in", values, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgBetween(String value1, String value2) {
            addCriterion("star_img between", value1, value2, "star_img");
            return (Criteria) this;
        }

        public Criteria andStar_imgNotBetween(String value1, String value2) {
            addCriterion("star_img not between", value1, value2, "star_img");
            return (Criteria) this;
        }

        public Criteria andImg_widthIsNull() {
            addCriterion("img_width is null");
            return (Criteria) this;
        }

        public Criteria andImg_widthIsNotNull() {
            addCriterion("img_width is not null");
            return (Criteria) this;
        }

        public Criteria andImg_widthEqualTo(Double value) {
            addCriterion("img_width =", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthNotEqualTo(Double value) {
            addCriterion("img_width <>", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthGreaterThan(Double value) {
            addCriterion("img_width >", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthGreaterThanOrEqualTo(Double value) {
            addCriterion("img_width >=", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthLessThan(Double value) {
            addCriterion("img_width <", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthLessThanOrEqualTo(Double value) {
            addCriterion("img_width <=", value, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthIn(List<Double> values) {
            addCriterion("img_width in", values, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthNotIn(List<Double> values) {
            addCriterion("img_width not in", values, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthBetween(Double value1, Double value2) {
            addCriterion("img_width between", value1, value2, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_widthNotBetween(Double value1, Double value2) {
            addCriterion("img_width not between", value1, value2, "img_width");
            return (Criteria) this;
        }

        public Criteria andImg_heightIsNull() {
            addCriterion("img_height is null");
            return (Criteria) this;
        }

        public Criteria andImg_heightIsNotNull() {
            addCriterion("img_height is not null");
            return (Criteria) this;
        }

        public Criteria andImg_heightEqualTo(Double value) {
            addCriterion("img_height =", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightNotEqualTo(Double value) {
            addCriterion("img_height <>", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightGreaterThan(Double value) {
            addCriterion("img_height >", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightGreaterThanOrEqualTo(Double value) {
            addCriterion("img_height >=", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightLessThan(Double value) {
            addCriterion("img_height <", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightLessThanOrEqualTo(Double value) {
            addCriterion("img_height <=", value, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightIn(List<Double> values) {
            addCriterion("img_height in", values, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightNotIn(List<Double> values) {
            addCriterion("img_height not in", values, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightBetween(Double value1, Double value2) {
            addCriterion("img_height between", value1, value2, "img_height");
            return (Criteria) this;
        }

        public Criteria andImg_heightNotBetween(Double value1, Double value2) {
            addCriterion("img_height not between", value1, value2, "img_height");
            return (Criteria) this;
        }

        public Criteria andStar_nameIsNull() {
            addCriterion("star_name is null");
            return (Criteria) this;
        }

        public Criteria andStar_nameIsNotNull() {
            addCriterion("star_name is not null");
            return (Criteria) this;
        }

        public Criteria andStar_nameEqualTo(String value) {
            addCriterion("star_name =", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameNotEqualTo(String value) {
            addCriterion("star_name <>", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameGreaterThan(String value) {
            addCriterion("star_name >", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameGreaterThanOrEqualTo(String value) {
            addCriterion("star_name >=", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameLessThan(String value) {
            addCriterion("star_name <", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameLessThanOrEqualTo(String value) {
            addCriterion("star_name <=", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameLike(String value) {
            addCriterion("star_name like", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameNotLike(String value) {
            addCriterion("star_name not like", value, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameIn(List<String> values) {
            addCriterion("star_name in", values, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameNotIn(List<String> values) {
            addCriterion("star_name not in", values, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameBetween(String value1, String value2) {
            addCriterion("star_name between", value1, value2, "star_name");
            return (Criteria) this;
        }

        public Criteria andStar_nameNotBetween(String value1, String value2) {
            addCriterion("star_name not between", value1, value2, "star_name");
            return (Criteria) this;
        }

        public Criteria andFont_widthIsNull() {
            addCriterion("font_width is null");
            return (Criteria) this;
        }

        public Criteria andFont_widthIsNotNull() {
            addCriterion("font_width is not null");
            return (Criteria) this;
        }

        public Criteria andFont_widthEqualTo(Double value) {
            addCriterion("font_width =", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthNotEqualTo(Double value) {
            addCriterion("font_width <>", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthGreaterThan(Double value) {
            addCriterion("font_width >", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthGreaterThanOrEqualTo(Double value) {
            addCriterion("font_width >=", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthLessThan(Double value) {
            addCriterion("font_width <", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthLessThanOrEqualTo(Double value) {
            addCriterion("font_width <=", value, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthIn(List<Double> values) {
            addCriterion("font_width in", values, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthNotIn(List<Double> values) {
            addCriterion("font_width not in", values, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthBetween(Double value1, Double value2) {
            addCriterion("font_width between", value1, value2, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_widthNotBetween(Double value1, Double value2) {
            addCriterion("font_width not between", value1, value2, "font_width");
            return (Criteria) this;
        }

        public Criteria andFont_heightIsNull() {
            addCriterion("font_height is null");
            return (Criteria) this;
        }

        public Criteria andFont_heightIsNotNull() {
            addCriterion("font_height is not null");
            return (Criteria) this;
        }

        public Criteria andFont_heightEqualTo(Double value) {
            addCriterion("font_height =", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightNotEqualTo(Double value) {
            addCriterion("font_height <>", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightGreaterThan(Double value) {
            addCriterion("font_height >", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightGreaterThanOrEqualTo(Double value) {
            addCriterion("font_height >=", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightLessThan(Double value) {
            addCriterion("font_height <", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightLessThanOrEqualTo(Double value) {
            addCriterion("font_height <=", value, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightIn(List<Double> values) {
            addCriterion("font_height in", values, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightNotIn(List<Double> values) {
            addCriterion("font_height not in", values, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightBetween(Double value1, Double value2) {
            addCriterion("font_height between", value1, value2, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_heightNotBetween(Double value1, Double value2) {
            addCriterion("font_height not between", value1, value2, "font_height");
            return (Criteria) this;
        }

        public Criteria andFont_colorIsNull() {
            addCriterion("font_color is null");
            return (Criteria) this;
        }

        public Criteria andFont_colorIsNotNull() {
            addCriterion("font_color is not null");
            return (Criteria) this;
        }

        public Criteria andFont_colorEqualTo(String value) {
            addCriterion("font_color =", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorNotEqualTo(String value) {
            addCriterion("font_color <>", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorGreaterThan(String value) {
            addCriterion("font_color >", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorGreaterThanOrEqualTo(String value) {
            addCriterion("font_color >=", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorLessThan(String value) {
            addCriterion("font_color <", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorLessThanOrEqualTo(String value) {
            addCriterion("font_color <=", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorLike(String value) {
            addCriterion("font_color like", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorNotLike(String value) {
            addCriterion("font_color not like", value, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorIn(List<String> values) {
            addCriterion("font_color in", values, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorNotIn(List<String> values) {
            addCriterion("font_color not in", values, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorBetween(String value1, String value2) {
            addCriterion("font_color between", value1, value2, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_colorNotBetween(String value1, String value2) {
            addCriterion("font_color not between", value1, value2, "font_color");
            return (Criteria) this;
        }

        public Criteria andFont_angleIsNull() {
            addCriterion("font_angle is null");
            return (Criteria) this;
        }

        public Criteria andFont_angleIsNotNull() {
            addCriterion("font_angle is not null");
            return (Criteria) this;
        }

        public Criteria andFont_angleEqualTo(Double value) {
            addCriterion("font_angle =", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleNotEqualTo(Double value) {
            addCriterion("font_angle <>", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleGreaterThan(Double value) {
            addCriterion("font_angle >", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleGreaterThanOrEqualTo(Double value) {
            addCriterion("font_angle >=", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleLessThan(Double value) {
            addCriterion("font_angle <", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleLessThanOrEqualTo(Double value) {
            addCriterion("font_angle <=", value, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleIn(List<Double> values) {
            addCriterion("font_angle in", values, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleNotIn(List<Double> values) {
            addCriterion("font_angle not in", values, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleBetween(Double value1, Double value2) {
            addCriterion("font_angle between", value1, value2, "font_angle");
            return (Criteria) this;
        }

        public Criteria andFont_angleNotBetween(Double value1, Double value2) {
            addCriterion("font_angle not between", value1, value2, "font_angle");
            return (Criteria) this;
        }

        public Criteria andMaxWidthIsNull() {
            addCriterion("maxWidth is null");
            return (Criteria) this;
        }

        public Criteria andMaxWidthIsNotNull() {
            addCriterion("maxWidth is not null");
            return (Criteria) this;
        }

        public Criteria andMaxWidthEqualTo(Double value) {
            addCriterion("maxWidth =", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthNotEqualTo(Double value) {
            addCriterion("maxWidth <>", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthGreaterThan(Double value) {
            addCriterion("maxWidth >", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("maxWidth >=", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthLessThan(Double value) {
            addCriterion("maxWidth <", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthLessThanOrEqualTo(Double value) {
            addCriterion("maxWidth <=", value, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthIn(List<Double> values) {
            addCriterion("maxWidth in", values, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthNotIn(List<Double> values) {
            addCriterion("maxWidth not in", values, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthBetween(Double value1, Double value2) {
            addCriterion("maxWidth between", value1, value2, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxWidthNotBetween(Double value1, Double value2) {
            addCriterion("maxWidth not between", value1, value2, "maxWidth");
            return (Criteria) this;
        }

        public Criteria andMaxHeightIsNull() {
            addCriterion("maxHeight is null");
            return (Criteria) this;
        }

        public Criteria andMaxHeightIsNotNull() {
            addCriterion("maxHeight is not null");
            return (Criteria) this;
        }

        public Criteria andMaxHeightEqualTo(Double value) {
            addCriterion("maxHeight =", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightNotEqualTo(Double value) {
            addCriterion("maxHeight <>", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightGreaterThan(Double value) {
            addCriterion("maxHeight >", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("maxHeight >=", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightLessThan(Double value) {
            addCriterion("maxHeight <", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightLessThanOrEqualTo(Double value) {
            addCriterion("maxHeight <=", value, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightIn(List<Double> values) {
            addCriterion("maxHeight in", values, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightNotIn(List<Double> values) {
            addCriterion("maxHeight not in", values, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightBetween(Double value1, Double value2) {
            addCriterion("maxHeight between", value1, value2, "maxHeight");
            return (Criteria) this;
        }

        public Criteria andMaxHeightNotBetween(Double value1, Double value2) {
            addCriterion("maxHeight not between", value1, value2, "maxHeight");
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