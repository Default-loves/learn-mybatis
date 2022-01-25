package com.junyi.entity;

import java.util.ArrayList;
import java.util.List;

public class SubParkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubParkExample() {
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

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(Integer value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(Integer value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(Integer value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(Integer value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(Integer value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<Integer> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<Integer> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(Integer value1, Integer value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdIsNull() {
            addCriterion("manage_box_id is null");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdIsNotNull() {
            addCriterion("manage_box_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdEqualTo(Integer value) {
            addCriterion("manage_box_id =", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdNotEqualTo(Integer value) {
            addCriterion("manage_box_id <>", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdGreaterThan(Integer value) {
            addCriterion("manage_box_id >", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manage_box_id >=", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdLessThan(Integer value) {
            addCriterion("manage_box_id <", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdLessThanOrEqualTo(Integer value) {
            addCriterion("manage_box_id <=", value, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdIn(List<Integer> values) {
            addCriterion("manage_box_id in", values, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdNotIn(List<Integer> values) {
            addCriterion("manage_box_id not in", values, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdBetween(Integer value1, Integer value2) {
            addCriterion("manage_box_id between", value1, value2, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andManageBoxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manage_box_id not between", value1, value2, "manageBoxId");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeIsNull() {
            addCriterion("limit_card_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeIsNotNull() {
            addCriterion("limit_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeEqualTo(Integer value) {
            addCriterion("limit_card_type =", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeNotEqualTo(Integer value) {
            addCriterion("limit_card_type <>", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeGreaterThan(Integer value) {
            addCriterion("limit_card_type >", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_card_type >=", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeLessThan(Integer value) {
            addCriterion("limit_card_type <", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_card_type <=", value, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeIn(List<Integer> values) {
            addCriterion("limit_card_type in", values, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeNotIn(List<Integer> values) {
            addCriterion("limit_card_type not in", values, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("limit_card_type between", value1, value2, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andLimitCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_card_type not between", value1, value2, "limitCardType");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceIsNull() {
            addCriterion("total_space is null");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceIsNotNull() {
            addCriterion("total_space is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceEqualTo(Integer value) {
            addCriterion("total_space =", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceNotEqualTo(Integer value) {
            addCriterion("total_space <>", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceGreaterThan(Integer value) {
            addCriterion("total_space >", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_space >=", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceLessThan(Integer value) {
            addCriterion("total_space <", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("total_space <=", value, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceIn(List<Integer> values) {
            addCriterion("total_space in", values, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceNotIn(List<Integer> values) {
            addCriterion("total_space not in", values, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceBetween(Integer value1, Integer value2) {
            addCriterion("total_space between", value1, value2, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andTotalSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_space not between", value1, value2, "totalSpace");
            return (Criteria) this;
        }

        public Criteria andInDsnsIsNull() {
            addCriterion("in_dsns is null");
            return (Criteria) this;
        }

        public Criteria andInDsnsIsNotNull() {
            addCriterion("in_dsns is not null");
            return (Criteria) this;
        }

        public Criteria andInDsnsEqualTo(String value) {
            addCriterion("in_dsns =", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsNotEqualTo(String value) {
            addCriterion("in_dsns <>", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsGreaterThan(String value) {
            addCriterion("in_dsns >", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsGreaterThanOrEqualTo(String value) {
            addCriterion("in_dsns >=", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsLessThan(String value) {
            addCriterion("in_dsns <", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsLessThanOrEqualTo(String value) {
            addCriterion("in_dsns <=", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsLike(String value) {
            addCriterion("in_dsns like", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsNotLike(String value) {
            addCriterion("in_dsns not like", value, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsIn(List<String> values) {
            addCriterion("in_dsns in", values, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsNotIn(List<String> values) {
            addCriterion("in_dsns not in", values, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsBetween(String value1, String value2) {
            addCriterion("in_dsns between", value1, value2, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInDsnsNotBetween(String value1, String value2) {
            addCriterion("in_dsns not between", value1, value2, "inDsns");
            return (Criteria) this;
        }

        public Criteria andInNamesIsNull() {
            addCriterion("in_names is null");
            return (Criteria) this;
        }

        public Criteria andInNamesIsNotNull() {
            addCriterion("in_names is not null");
            return (Criteria) this;
        }

        public Criteria andInNamesEqualTo(String value) {
            addCriterion("in_names =", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesNotEqualTo(String value) {
            addCriterion("in_names <>", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesGreaterThan(String value) {
            addCriterion("in_names >", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesGreaterThanOrEqualTo(String value) {
            addCriterion("in_names >=", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesLessThan(String value) {
            addCriterion("in_names <", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesLessThanOrEqualTo(String value) {
            addCriterion("in_names <=", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesLike(String value) {
            addCriterion("in_names like", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesNotLike(String value) {
            addCriterion("in_names not like", value, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesIn(List<String> values) {
            addCriterion("in_names in", values, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesNotIn(List<String> values) {
            addCriterion("in_names not in", values, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesBetween(String value1, String value2) {
            addCriterion("in_names between", value1, value2, "inNames");
            return (Criteria) this;
        }

        public Criteria andInNamesNotBetween(String value1, String value2) {
            addCriterion("in_names not between", value1, value2, "inNames");
            return (Criteria) this;
        }

        public Criteria andOutDsnsIsNull() {
            addCriterion("out_dsns is null");
            return (Criteria) this;
        }

        public Criteria andOutDsnsIsNotNull() {
            addCriterion("out_dsns is not null");
            return (Criteria) this;
        }

        public Criteria andOutDsnsEqualTo(String value) {
            addCriterion("out_dsns =", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsNotEqualTo(String value) {
            addCriterion("out_dsns <>", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsGreaterThan(String value) {
            addCriterion("out_dsns >", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsGreaterThanOrEqualTo(String value) {
            addCriterion("out_dsns >=", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsLessThan(String value) {
            addCriterion("out_dsns <", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsLessThanOrEqualTo(String value) {
            addCriterion("out_dsns <=", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsLike(String value) {
            addCriterion("out_dsns like", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsNotLike(String value) {
            addCriterion("out_dsns not like", value, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsIn(List<String> values) {
            addCriterion("out_dsns in", values, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsNotIn(List<String> values) {
            addCriterion("out_dsns not in", values, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsBetween(String value1, String value2) {
            addCriterion("out_dsns between", value1, value2, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutDsnsNotBetween(String value1, String value2) {
            addCriterion("out_dsns not between", value1, value2, "outDsns");
            return (Criteria) this;
        }

        public Criteria andOutNamesIsNull() {
            addCriterion("out_names is null");
            return (Criteria) this;
        }

        public Criteria andOutNamesIsNotNull() {
            addCriterion("out_names is not null");
            return (Criteria) this;
        }

        public Criteria andOutNamesEqualTo(String value) {
            addCriterion("out_names =", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesNotEqualTo(String value) {
            addCriterion("out_names <>", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesGreaterThan(String value) {
            addCriterion("out_names >", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesGreaterThanOrEqualTo(String value) {
            addCriterion("out_names >=", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesLessThan(String value) {
            addCriterion("out_names <", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesLessThanOrEqualTo(String value) {
            addCriterion("out_names <=", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesLike(String value) {
            addCriterion("out_names like", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesNotLike(String value) {
            addCriterion("out_names not like", value, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesIn(List<String> values) {
            addCriterion("out_names in", values, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesNotIn(List<String> values) {
            addCriterion("out_names not in", values, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesBetween(String value1, String value2) {
            addCriterion("out_names between", value1, value2, "outNames");
            return (Criteria) this;
        }

        public Criteria andOutNamesNotBetween(String value1, String value2) {
            addCriterion("out_names not between", value1, value2, "outNames");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("`delete` is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("`delete` is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Byte value) {
            addCriterion("`delete` =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Byte value) {
            addCriterion("`delete` <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Byte value) {
            addCriterion("`delete` >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("`delete` >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Byte value) {
            addCriterion("`delete` <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("`delete` <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Byte> values) {
            addCriterion("`delete` in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Byte> values) {
            addCriterion("`delete` not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Byte value1, Byte value2) {
            addCriterion("`delete` between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("`delete` not between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("`limit` is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("`limit` is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Byte value) {
            addCriterion("`limit` =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Byte value) {
            addCriterion("`limit` <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Byte value) {
            addCriterion("`limit` >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("`limit` >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Byte value) {
            addCriterion("`limit` <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Byte value) {
            addCriterion("`limit` <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Byte> values) {
            addCriterion("`limit` in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Byte> values) {
            addCriterion("`limit` not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Byte value1, Byte value2) {
            addCriterion("`limit` between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("`limit` not between", value1, value2, "limit");
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