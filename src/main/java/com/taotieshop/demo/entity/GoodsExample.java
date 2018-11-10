package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(Integer value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(Integer value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(Integer value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<Integer> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThan(Integer value) {
            addCriterion("brand_id <", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brand_id");
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andGoods_briefIsNull() {
            addCriterion("goods_brief is null");
            return (Criteria) this;
        }

        public Criteria andGoods_briefIsNotNull() {
            addCriterion("goods_brief is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_briefEqualTo(String value) {
            addCriterion("goods_brief =", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefNotEqualTo(String value) {
            addCriterion("goods_brief <>", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefGreaterThan(String value) {
            addCriterion("goods_brief >", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brief >=", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefLessThan(String value) {
            addCriterion("goods_brief <", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefLessThanOrEqualTo(String value) {
            addCriterion("goods_brief <=", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefLike(String value) {
            addCriterion("goods_brief like", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefNotLike(String value) {
            addCriterion("goods_brief not like", value, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefIn(List<String> values) {
            addCriterion("goods_brief in", values, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefNotIn(List<String> values) {
            addCriterion("goods_brief not in", values, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefBetween(String value1, String value2) {
            addCriterion("goods_brief between", value1, value2, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andGoods_briefNotBetween(String value1, String value2) {
            addCriterion("goods_brief not between", value1, value2, "goods_brief");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleIsNull() {
            addCriterion("is_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleIsNotNull() {
            addCriterion("is_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleEqualTo(Boolean value) {
            addCriterion("is_on_sale =", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleNotEqualTo(Boolean value) {
            addCriterion("is_on_sale <>", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleGreaterThan(Boolean value) {
            addCriterion("is_on_sale >", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale >=", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleLessThan(Boolean value) {
            addCriterion("is_on_sale <", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_on_sale <=", value, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleIn(List<Boolean> values) {
            addCriterion("is_on_sale in", values, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleNotIn(List<Boolean> values) {
            addCriterion("is_on_sale not in", values, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale between", value1, value2, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andIs_on_saleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_on_sale not between", value1, value2, "is_on_sale");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeEqualTo(Integer value) {
            addCriterion("add_time =", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThan(Integer value) {
            addCriterion("add_time <", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIn(List<Integer> values) {
            addCriterion("add_time in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "add_time");
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

        public Criteria andSort_orderEqualTo(Short value) {
            addCriterion("sort_order =", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotEqualTo(Short value) {
            addCriterion("sort_order <>", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThan(Short value) {
            addCriterion("sort_order >", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThanOrEqualTo(Short value) {
            addCriterion("sort_order >=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThan(Short value) {
            addCriterion("sort_order <", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThanOrEqualTo(Short value) {
            addCriterion("sort_order <=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderIn(List<Short> values) {
            addCriterion("sort_order in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotIn(List<Short> values) {
            addCriterion("sort_order not in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderBetween(Short value1, Short value2) {
            addCriterion("sort_order between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotBetween(Short value1, Short value2) {
            addCriterion("sort_order not between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryIsNull() {
            addCriterion("attribute_category is null");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryIsNotNull() {
            addCriterion("attribute_category is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryEqualTo(Integer value) {
            addCriterion("attribute_category =", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryNotEqualTo(Integer value) {
            addCriterion("attribute_category <>", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryGreaterThan(Integer value) {
            addCriterion("attribute_category >", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_category >=", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryLessThan(Integer value) {
            addCriterion("attribute_category <", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_category <=", value, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryIn(List<Integer> values) {
            addCriterion("attribute_category in", values, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryNotIn(List<Integer> values) {
            addCriterion("attribute_category not in", values, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryBetween(Integer value1, Integer value2) {
            addCriterion("attribute_category between", value1, value2, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andAttribute_categoryNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_category not between", value1, value2, "attribute_category");
            return (Criteria) this;
        }

        public Criteria andCounter_priceIsNull() {
            addCriterion("counter_price is null");
            return (Criteria) this;
        }

        public Criteria andCounter_priceIsNotNull() {
            addCriterion("counter_price is not null");
            return (Criteria) this;
        }

        public Criteria andCounter_priceEqualTo(BigDecimal value) {
            addCriterion("counter_price =", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceNotEqualTo(BigDecimal value) {
            addCriterion("counter_price <>", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceGreaterThan(BigDecimal value) {
            addCriterion("counter_price >", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("counter_price >=", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceLessThan(BigDecimal value) {
            addCriterion("counter_price <", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("counter_price <=", value, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceIn(List<BigDecimal> values) {
            addCriterion("counter_price in", values, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceNotIn(List<BigDecimal> values) {
            addCriterion("counter_price not in", values, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("counter_price between", value1, value2, "counter_price");
            return (Criteria) this;
        }

        public Criteria andCounter_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("counter_price not between", value1, value2, "counter_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceIsNull() {
            addCriterion("extra_price is null");
            return (Criteria) this;
        }

        public Criteria andExtra_priceIsNotNull() {
            addCriterion("extra_price is not null");
            return (Criteria) this;
        }

        public Criteria andExtra_priceEqualTo(BigDecimal value) {
            addCriterion("extra_price =", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceNotEqualTo(BigDecimal value) {
            addCriterion("extra_price <>", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceGreaterThan(BigDecimal value) {
            addCriterion("extra_price >", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extra_price >=", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceLessThan(BigDecimal value) {
            addCriterion("extra_price <", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("extra_price <=", value, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceIn(List<BigDecimal> values) {
            addCriterion("extra_price in", values, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceNotIn(List<BigDecimal> values) {
            addCriterion("extra_price not in", values, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extra_price between", value1, value2, "extra_price");
            return (Criteria) this;
        }

        public Criteria andExtra_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extra_price not between", value1, value2, "extra_price");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIs_newEqualTo(Boolean value) {
            addCriterion("is_new =", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThan(Boolean value) {
            addCriterion("is_new <", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newIn(List<Boolean> values) {
            addCriterion("is_new in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andGoods_unitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoods_unitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_unitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitLessThan(String value) {
            addCriterion("goods_unit <", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitLike(String value) {
            addCriterion("goods_unit like", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andGoods_unitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goods_unit");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlIsNull() {
            addCriterion("primary_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlIsNotNull() {
            addCriterion("primary_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlEqualTo(String value) {
            addCriterion("primary_pic_url =", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlNotEqualTo(String value) {
            addCriterion("primary_pic_url <>", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlGreaterThan(String value) {
            addCriterion("primary_pic_url >", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("primary_pic_url >=", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlLessThan(String value) {
            addCriterion("primary_pic_url <", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlLessThanOrEqualTo(String value) {
            addCriterion("primary_pic_url <=", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlLike(String value) {
            addCriterion("primary_pic_url like", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlNotLike(String value) {
            addCriterion("primary_pic_url not like", value, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlIn(List<String> values) {
            addCriterion("primary_pic_url in", values, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlNotIn(List<String> values) {
            addCriterion("primary_pic_url not in", values, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlBetween(String value1, String value2) {
            addCriterion("primary_pic_url between", value1, value2, "primary_pic_url");
            return (Criteria) this;
        }

        public Criteria andPrimary_pic_urlNotBetween(String value1, String value2) {
            addCriterion("primary_pic_url not between", value1, value2, "primary_pic_url");
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

        public Criteria andSell_volumeIsNull() {
            addCriterion("sell_volume is null");
            return (Criteria) this;
        }

        public Criteria andSell_volumeIsNotNull() {
            addCriterion("sell_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSell_volumeEqualTo(Integer value) {
            addCriterion("sell_volume =", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeNotEqualTo(Integer value) {
            addCriterion("sell_volume <>", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeGreaterThan(Integer value) {
            addCriterion("sell_volume >", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_volume >=", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeLessThan(Integer value) {
            addCriterion("sell_volume <", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeLessThanOrEqualTo(Integer value) {
            addCriterion("sell_volume <=", value, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeIn(List<Integer> values) {
            addCriterion("sell_volume in", values, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeNotIn(List<Integer> values) {
            addCriterion("sell_volume not in", values, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeBetween(Integer value1, Integer value2) {
            addCriterion("sell_volume between", value1, value2, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andSell_volumeNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_volume not between", value1, value2, "sell_volume");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idIsNull() {
            addCriterion("primary_product_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idIsNotNull() {
            addCriterion("primary_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idEqualTo(Integer value) {
            addCriterion("primary_product_id =", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idNotEqualTo(Integer value) {
            addCriterion("primary_product_id <>", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idGreaterThan(Integer value) {
            addCriterion("primary_product_id >", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_product_id >=", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idLessThan(Integer value) {
            addCriterion("primary_product_id <", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idLessThanOrEqualTo(Integer value) {
            addCriterion("primary_product_id <=", value, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idIn(List<Integer> values) {
            addCriterion("primary_product_id in", values, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idNotIn(List<Integer> values) {
            addCriterion("primary_product_id not in", values, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idBetween(Integer value1, Integer value2) {
            addCriterion("primary_product_id between", value1, value2, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andPrimary_product_idNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_product_id not between", value1, value2, "primary_product_id");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnit_priceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unit_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_descIsNull() {
            addCriterion("promotion_desc is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_descIsNotNull() {
            addCriterion("promotion_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_descEqualTo(String value) {
            addCriterion("promotion_desc =", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descNotEqualTo(String value) {
            addCriterion("promotion_desc <>", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descGreaterThan(String value) {
            addCriterion("promotion_desc >", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_desc >=", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descLessThan(String value) {
            addCriterion("promotion_desc <", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descLessThanOrEqualTo(String value) {
            addCriterion("promotion_desc <=", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descLike(String value) {
            addCriterion("promotion_desc like", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descNotLike(String value) {
            addCriterion("promotion_desc not like", value, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descIn(List<String> values) {
            addCriterion("promotion_desc in", values, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descNotIn(List<String> values) {
            addCriterion("promotion_desc not in", values, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descBetween(String value1, String value2) {
            addCriterion("promotion_desc between", value1, value2, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_descNotBetween(String value1, String value2) {
            addCriterion("promotion_desc not between", value1, value2, "promotion_desc");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagIsNull() {
            addCriterion("promotion_tag is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagIsNotNull() {
            addCriterion("promotion_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagEqualTo(String value) {
            addCriterion("promotion_tag =", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagNotEqualTo(String value) {
            addCriterion("promotion_tag <>", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagGreaterThan(String value) {
            addCriterion("promotion_tag >", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_tag >=", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagLessThan(String value) {
            addCriterion("promotion_tag <", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagLessThanOrEqualTo(String value) {
            addCriterion("promotion_tag <=", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagLike(String value) {
            addCriterion("promotion_tag like", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagNotLike(String value) {
            addCriterion("promotion_tag not like", value, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagIn(List<String> values) {
            addCriterion("promotion_tag in", values, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagNotIn(List<String> values) {
            addCriterion("promotion_tag not in", values, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagBetween(String value1, String value2) {
            addCriterion("promotion_tag between", value1, value2, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andPromotion_tagNotBetween(String value1, String value2) {
            addCriterion("promotion_tag not between", value1, value2, "promotion_tag");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceIsNull() {
            addCriterion("app_exclusive_price is null");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceIsNotNull() {
            addCriterion("app_exclusive_price is not null");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceEqualTo(BigDecimal value) {
            addCriterion("app_exclusive_price =", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceNotEqualTo(BigDecimal value) {
            addCriterion("app_exclusive_price <>", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceGreaterThan(BigDecimal value) {
            addCriterion("app_exclusive_price >", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("app_exclusive_price >=", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceLessThan(BigDecimal value) {
            addCriterion("app_exclusive_price <", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("app_exclusive_price <=", value, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceIn(List<BigDecimal> values) {
            addCriterion("app_exclusive_price in", values, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceNotIn(List<BigDecimal> values) {
            addCriterion("app_exclusive_price not in", values, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_exclusive_price between", value1, value2, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andApp_exclusive_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("app_exclusive_price not between", value1, value2, "app_exclusive_price");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveIsNull() {
            addCriterion("is_app_exclusive is null");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveIsNotNull() {
            addCriterion("is_app_exclusive is not null");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveEqualTo(Boolean value) {
            addCriterion("is_app_exclusive =", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveNotEqualTo(Boolean value) {
            addCriterion("is_app_exclusive <>", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveGreaterThan(Boolean value) {
            addCriterion("is_app_exclusive >", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_app_exclusive >=", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveLessThan(Boolean value) {
            addCriterion("is_app_exclusive <", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_app_exclusive <=", value, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveIn(List<Boolean> values) {
            addCriterion("is_app_exclusive in", values, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveNotIn(List<Boolean> values) {
            addCriterion("is_app_exclusive not in", values, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_app_exclusive between", value1, value2, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_app_exclusiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_app_exclusive not between", value1, value2, "is_app_exclusive");
            return (Criteria) this;
        }

        public Criteria andIs_limitedIsNull() {
            addCriterion("is_limited is null");
            return (Criteria) this;
        }

        public Criteria andIs_limitedIsNotNull() {
            addCriterion("is_limited is not null");
            return (Criteria) this;
        }

        public Criteria andIs_limitedEqualTo(Boolean value) {
            addCriterion("is_limited =", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedNotEqualTo(Boolean value) {
            addCriterion("is_limited <>", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedGreaterThan(Boolean value) {
            addCriterion("is_limited >", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_limited >=", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedLessThan(Boolean value) {
            addCriterion("is_limited <", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_limited <=", value, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedIn(List<Boolean> values) {
            addCriterion("is_limited in", values, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedNotIn(List<Boolean> values) {
            addCriterion("is_limited not in", values, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_limited between", value1, value2, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_limitedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_limited not between", value1, value2, "is_limited");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIs_hotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "is_hot");
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