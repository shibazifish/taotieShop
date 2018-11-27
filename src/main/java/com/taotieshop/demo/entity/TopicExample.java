package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlIsNull() {
            addCriterion("item_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlIsNotNull() {
            addCriterion("item_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlEqualTo(String value) {
            addCriterion("item_pic_url =", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlNotEqualTo(String value) {
            addCriterion("item_pic_url <>", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlGreaterThan(String value) {
            addCriterion("item_pic_url >", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("item_pic_url >=", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlLessThan(String value) {
            addCriterion("item_pic_url <", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("item_pic_url <=", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlLike(String value) {
            addCriterion("item_pic_url like", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlNotLike(String value) {
            addCriterion("item_pic_url not like", value, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlIn(List<String> values) {
            addCriterion("item_pic_url in", values, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlNotIn(List<String> values) {
            addCriterion("item_pic_url not in", values, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlBetween(String value1, String value2) {
            addCriterion("item_pic_url between", value1, value2, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andItem_pic_urlNotBetween(String value1, String value2) {
            addCriterion("item_pic_url not between", value1, value2, "item_pic_url");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idIsNull() {
            addCriterion("topic_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idIsNotNull() {
            addCriterion("topic_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idEqualTo(Integer value) {
            addCriterion("topic_category_id =", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idNotEqualTo(Integer value) {
            addCriterion("topic_category_id <>", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idGreaterThan(Integer value) {
            addCriterion("topic_category_id >", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_category_id >=", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idLessThan(Integer value) {
            addCriterion("topic_category_id <", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idLessThanOrEqualTo(Integer value) {
            addCriterion("topic_category_id <=", value, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idIn(List<Integer> values) {
            addCriterion("topic_category_id in", values, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idNotIn(List<Integer> values) {
            addCriterion("topic_category_id not in", values, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idBetween(Integer value1, Integer value2) {
            addCriterion("topic_category_id between", value1, value2, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andTopic_category_idNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_category_id not between", value1, value2, "topic_category_id");
            return (Criteria) this;
        }

        public Criteria andPrice_infoIsNull() {
            addCriterion("price_info is null");
            return (Criteria) this;
        }

        public Criteria andPrice_infoIsNotNull() {
            addCriterion("price_info is not null");
            return (Criteria) this;
        }

        public Criteria andPrice_infoEqualTo(BigDecimal value) {
            addCriterion("price_info =", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoNotEqualTo(BigDecimal value) {
            addCriterion("price_info <>", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoGreaterThan(BigDecimal value) {
            addCriterion("price_info >", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_info >=", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoLessThan(BigDecimal value) {
            addCriterion("price_info <", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_info <=", value, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoIn(List<BigDecimal> values) {
            addCriterion("price_info in", values, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoNotIn(List<BigDecimal> values) {
            addCriterion("price_info not in", values, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_info between", value1, value2, "price_info");
            return (Criteria) this;
        }

        public Criteria andPrice_infoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_info not between", value1, value2, "price_info");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andRead_countEqualTo(String value) {
            addCriterion("read_count =", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotEqualTo(String value) {
            addCriterion("read_count <>", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThan(String value) {
            addCriterion("read_count >", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThanOrEqualTo(String value) {
            addCriterion("read_count >=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThan(String value) {
            addCriterion("read_count <", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThanOrEqualTo(String value) {
            addCriterion("read_count <=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLike(String value) {
            addCriterion("read_count like", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotLike(String value) {
            addCriterion("read_count not like", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countIn(List<String> values) {
            addCriterion("read_count in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotIn(List<String> values) {
            addCriterion("read_count not in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countBetween(String value1, String value2) {
            addCriterion("read_count between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotBetween(String value1, String value2) {
            addCriterion("read_count not between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlIsNull() {
            addCriterion("scene_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlIsNotNull() {
            addCriterion("scene_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlEqualTo(String value) {
            addCriterion("scene_pic_url =", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlNotEqualTo(String value) {
            addCriterion("scene_pic_url <>", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlGreaterThan(String value) {
            addCriterion("scene_pic_url >", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("scene_pic_url >=", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlLessThan(String value) {
            addCriterion("scene_pic_url <", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("scene_pic_url <=", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlLike(String value) {
            addCriterion("scene_pic_url like", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlNotLike(String value) {
            addCriterion("scene_pic_url not like", value, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlIn(List<String> values) {
            addCriterion("scene_pic_url in", values, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlNotIn(List<String> values) {
            addCriterion("scene_pic_url not in", values, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlBetween(String value1, String value2) {
            addCriterion("scene_pic_url between", value1, value2, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andScene_pic_urlNotBetween(String value1, String value2) {
            addCriterion("scene_pic_url not between", value1, value2, "scene_pic_url");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idIsNull() {
            addCriterion("topic_template_id is null");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idIsNotNull() {
            addCriterion("topic_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idEqualTo(Integer value) {
            addCriterion("topic_template_id =", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idNotEqualTo(Integer value) {
            addCriterion("topic_template_id <>", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idGreaterThan(Integer value) {
            addCriterion("topic_template_id >", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_template_id >=", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idLessThan(Integer value) {
            addCriterion("topic_template_id <", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idLessThanOrEqualTo(Integer value) {
            addCriterion("topic_template_id <=", value, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idIn(List<Integer> values) {
            addCriterion("topic_template_id in", values, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idNotIn(List<Integer> values) {
            addCriterion("topic_template_id not in", values, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idBetween(Integer value1, Integer value2) {
            addCriterion("topic_template_id between", value1, value2, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_template_idNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_template_id not between", value1, value2, "topic_template_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idIsNull() {
            addCriterion("topic_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idIsNotNull() {
            addCriterion("topic_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idEqualTo(Integer value) {
            addCriterion("topic_tag_id =", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idNotEqualTo(Integer value) {
            addCriterion("topic_tag_id <>", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idGreaterThan(Integer value) {
            addCriterion("topic_tag_id >", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_tag_id >=", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idLessThan(Integer value) {
            addCriterion("topic_tag_id <", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idLessThanOrEqualTo(Integer value) {
            addCriterion("topic_tag_id <=", value, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idIn(List<Integer> values) {
            addCriterion("topic_tag_id in", values, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idNotIn(List<Integer> values) {
            addCriterion("topic_tag_id not in", values, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idBetween(Integer value1, Integer value2) {
            addCriterion("topic_tag_id between", value1, value2, "topic_tag_id");
            return (Criteria) this;
        }

        public Criteria andTopic_tag_idNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_tag_id not between", value1, value2, "topic_tag_id");
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

        public Criteria andSort_orderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sort_order");
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