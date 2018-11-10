package com.taotieshop.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrder_snIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrder_snIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_snEqualTo(String value) {
            addCriterion("order_sn =", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThan(String value) {
            addCriterion("order_sn >", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThan(String value) {
            addCriterion("order_sn <", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLike(String value) {
            addCriterion("order_sn like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotLike(String value) {
            addCriterion("order_sn not like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snIn(List<String> values) {
            addCriterion("order_sn in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "order_sn");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusEqualTo(Boolean value) {
            addCriterion("order_status =", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotEqualTo(Boolean value) {
            addCriterion("order_status <>", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThan(Boolean value) {
            addCriterion("order_status >", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_status >=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThan(Boolean value) {
            addCriterion("order_status <", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("order_status <=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIn(List<Boolean> values) {
            addCriterion("order_status in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotIn(List<Boolean> values) {
            addCriterion("order_status not in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status not between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_statusEqualTo(Boolean value) {
            addCriterion("shipping_status =", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotEqualTo(Boolean value) {
            addCriterion("shipping_status <>", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusGreaterThan(Boolean value) {
            addCriterion("shipping_status >", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status >=", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusLessThan(Boolean value) {
            addCriterion("shipping_status <", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status <=", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIn(List<Boolean> values) {
            addCriterion("shipping_status in", values, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotIn(List<Boolean> values) {
            addCriterion("shipping_status not in", values, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status between", value1, value2, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status not between", value1, value2, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPay_statusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPay_statusEqualTo(Boolean value) {
            addCriterion("pay_status =", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotEqualTo(Boolean value) {
            addCriterion("pay_status <>", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusGreaterThan(Boolean value) {
            addCriterion("pay_status >", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_status >=", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusLessThan(Boolean value) {
            addCriterion("pay_status <", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_status <=", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusIn(List<Boolean> values) {
            addCriterion("pay_status in", values, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotIn(List<Boolean> values) {
            addCriterion("pay_status not in", values, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status between", value1, value2, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status not between", value1, value2, "pay_status");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Short value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Short value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Short value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Short value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Short value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Short value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Short> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Short> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Short value1, Short value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Short value1, Short value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Short value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Short value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Short value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Short value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Short value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Short> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Short> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Short value1, Short value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Short value1, Short value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Short value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Short value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Short value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Short value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Short value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Short value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Short> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Short> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Short value1, Short value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Short value1, Short value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Short value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Short value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Short value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Short value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Short value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Short value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Short> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Short> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Short value1, Short value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Short value1, Short value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andShipping_idIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShipping_idIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_idEqualTo(Byte value) {
            addCriterion("shipping_id =", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idNotEqualTo(Byte value) {
            addCriterion("shipping_id <>", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idGreaterThan(Byte value) {
            addCriterion("shipping_id >", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_id >=", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idLessThan(Byte value) {
            addCriterion("shipping_id <", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_id <=", value, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idIn(List<Byte> values) {
            addCriterion("shipping_id in", values, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idNotIn(List<Byte> values) {
            addCriterion("shipping_id not in", values, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id between", value1, value2, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_idNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id not between", value1, value2, "shipping_id");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThan(String value) {
            addCriterion("shipping_name <", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLike(String value) {
            addCriterion("shipping_name like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andPay_idIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPay_idIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPay_idEqualTo(Byte value) {
            addCriterion("pay_id =", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotEqualTo(Byte value) {
            addCriterion("pay_id <>", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idGreaterThan(Byte value) {
            addCriterion("pay_id >", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_id >=", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idLessThan(Byte value) {
            addCriterion("pay_id <", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idLessThanOrEqualTo(Byte value) {
            addCriterion("pay_id <=", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idIn(List<Byte> values) {
            addCriterion("pay_id in", values, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotIn(List<Byte> values) {
            addCriterion("pay_id not in", values, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idBetween(Byte value1, Byte value2) {
            addCriterion("pay_id between", value1, value2, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_id not between", value1, value2, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_nameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPay_nameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPay_nameEqualTo(String value) {
            addCriterion("pay_name =", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameGreaterThan(String value) {
            addCriterion("pay_name >", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLessThan(String value) {
            addCriterion("pay_name <", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLike(String value) {
            addCriterion("pay_name like", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotLike(String value) {
            addCriterion("pay_name not like", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameIn(List<String> values) {
            addCriterion("pay_name in", values, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "pay_name");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_feeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andActual_priceIsNull() {
            addCriterion("actual_price is null");
            return (Criteria) this;
        }

        public Criteria andActual_priceIsNotNull() {
            addCriterion("actual_price is not null");
            return (Criteria) this;
        }

        public Criteria andActual_priceEqualTo(BigDecimal value) {
            addCriterion("actual_price =", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceNotEqualTo(BigDecimal value) {
            addCriterion("actual_price <>", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceGreaterThan(BigDecimal value) {
            addCriterion("actual_price >", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_price >=", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceLessThan(BigDecimal value) {
            addCriterion("actual_price <", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_price <=", value, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceIn(List<BigDecimal> values) {
            addCriterion("actual_price in", values, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceNotIn(List<BigDecimal> values) {
            addCriterion("actual_price not in", values, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_price between", value1, value2, "actual_price");
            return (Criteria) this;
        }

        public Criteria andActual_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_price not between", value1, value2, "actual_price");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIsNull() {
            addCriterion("integral_money is null");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIsNotNull() {
            addCriterion("integral_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyEqualTo(BigDecimal value) {
            addCriterion("integral_money =", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotEqualTo(BigDecimal value) {
            addCriterion("integral_money <>", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyGreaterThan(BigDecimal value) {
            addCriterion("integral_money >", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money >=", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyLessThan(BigDecimal value) {
            addCriterion("integral_money <", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money <=", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIn(List<BigDecimal> values) {
            addCriterion("integral_money in", values, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotIn(List<BigDecimal> values) {
            addCriterion("integral_money not in", values, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money between", value1, value2, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money not between", value1, value2, "integral_money");
            return (Criteria) this;
        }

        public Criteria andOrder_priceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrder_priceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_priceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "order_price");
            return (Criteria) this;
        }

        public Criteria andOrder_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "order_price");
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

        public Criteria andGoods_priceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goods_price");
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

        public Criteria andConfirm_timeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeEqualTo(Integer value) {
            addCriterion("confirm_time =", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotEqualTo(Integer value) {
            addCriterion("confirm_time <>", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeGreaterThan(Integer value) {
            addCriterion("confirm_time >", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_time >=", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeLessThan(Integer value) {
            addCriterion("confirm_time <", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_time <=", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeIn(List<Integer> values) {
            addCriterion("confirm_time in", values, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotIn(List<Integer> values) {
            addCriterion("confirm_time not in", values, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time between", value1, value2, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time not between", value1, value2, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_timeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(Integer value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andFreight_priceIsNull() {
            addCriterion("freight_price is null");
            return (Criteria) this;
        }

        public Criteria andFreight_priceIsNotNull() {
            addCriterion("freight_price is not null");
            return (Criteria) this;
        }

        public Criteria andFreight_priceEqualTo(Integer value) {
            addCriterion("freight_price =", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceNotEqualTo(Integer value) {
            addCriterion("freight_price <>", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceGreaterThan(Integer value) {
            addCriterion("freight_price >", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_price >=", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceLessThan(Integer value) {
            addCriterion("freight_price <", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceLessThanOrEqualTo(Integer value) {
            addCriterion("freight_price <=", value, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceIn(List<Integer> values) {
            addCriterion("freight_price in", values, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceNotIn(List<Integer> values) {
            addCriterion("freight_price not in", values, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceBetween(Integer value1, Integer value2) {
            addCriterion("freight_price between", value1, value2, "freight_price");
            return (Criteria) this;
        }

        public Criteria andFreight_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_price not between", value1, value2, "freight_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThan(Integer value) {
            addCriterion("coupon_id <", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent_idEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThan(Integer value) {
            addCriterion("parent_id <", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceEqualTo(BigDecimal value) {
            addCriterion("coupon_price =", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotEqualTo(BigDecimal value) {
            addCriterion("coupon_price <>", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceGreaterThan(BigDecimal value) {
            addCriterion("coupon_price >", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price >=", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceLessThan(BigDecimal value) {
            addCriterion("coupon_price <", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price <=", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIn(List<BigDecimal> values) {
            addCriterion("coupon_price in", values, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotIn(List<BigDecimal> values) {
            addCriterion("coupon_price not in", values, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price between", value1, value2, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price not between", value1, value2, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCallback_statusIsNull() {
            addCriterion("callback_status is null");
            return (Criteria) this;
        }

        public Criteria andCallback_statusIsNotNull() {
            addCriterion("callback_status is not null");
            return (Criteria) this;
        }

        public Criteria andCallback_statusEqualTo(String value) {
            addCriterion("callback_status =", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusNotEqualTo(String value) {
            addCriterion("callback_status <>", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusGreaterThan(String value) {
            addCriterion("callback_status >", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusGreaterThanOrEqualTo(String value) {
            addCriterion("callback_status >=", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusLessThan(String value) {
            addCriterion("callback_status <", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusLessThanOrEqualTo(String value) {
            addCriterion("callback_status <=", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusLike(String value) {
            addCriterion("callback_status like", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusNotLike(String value) {
            addCriterion("callback_status not like", value, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusIn(List<String> values) {
            addCriterion("callback_status in", values, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusNotIn(List<String> values) {
            addCriterion("callback_status not in", values, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusBetween(String value1, String value2) {
            addCriterion("callback_status between", value1, value2, "callback_status");
            return (Criteria) this;
        }

        public Criteria andCallback_statusNotBetween(String value1, String value2) {
            addCriterion("callback_status not between", value1, value2, "callback_status");
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