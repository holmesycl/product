package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.List;

public class UiComponentElementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UiComponentElementExample() {
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

        public Criteria andAttrCompIdIsNull() {
            addCriterion("ATTR_COMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdIsNotNull() {
            addCriterion("ATTR_COMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdEqualTo(Long value) {
            addCriterion("ATTR_COMP_ID =", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdNotEqualTo(Long value) {
            addCriterion("ATTR_COMP_ID <>", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdGreaterThan(Long value) {
            addCriterion("ATTR_COMP_ID >", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTR_COMP_ID >=", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdLessThan(Long value) {
            addCriterion("ATTR_COMP_ID <", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdLessThanOrEqualTo(Long value) {
            addCriterion("ATTR_COMP_ID <=", value, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdIn(List<Long> values) {
            addCriterion("ATTR_COMP_ID in", values, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdNotIn(List<Long> values) {
            addCriterion("ATTR_COMP_ID not in", values, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdBetween(Long value1, Long value2) {
            addCriterion("ATTR_COMP_ID between", value1, value2, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrCompIdNotBetween(Long value1, Long value2) {
            addCriterion("ATTR_COMP_ID not between", value1, value2, "attrCompId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("ATTR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("ATTR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Long value) {
            addCriterion("ATTR_ID =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Long value) {
            addCriterion("ATTR_ID <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Long value) {
            addCriterion("ATTR_ID >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTR_ID >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Long value) {
            addCriterion("ATTR_ID <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("ATTR_ID <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Long> values) {
            addCriterion("ATTR_ID in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Long> values) {
            addCriterion("ATTR_ID not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Long value1, Long value2) {
            addCriterion("ATTR_ID between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("ATTR_ID not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdIsNull() {
            addCriterion("UI_COMPONENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdIsNotNull() {
            addCriterion("UI_COMPONENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdEqualTo(Long value) {
            addCriterion("UI_COMPONENT_ID =", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdNotEqualTo(Long value) {
            addCriterion("UI_COMPONENT_ID <>", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdGreaterThan(Long value) {
            addCriterion("UI_COMPONENT_ID >", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_COMPONENT_ID >=", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdLessThan(Long value) {
            addCriterion("UI_COMPONENT_ID <", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdLessThanOrEqualTo(Long value) {
            addCriterion("UI_COMPONENT_ID <=", value, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdIn(List<Long> values) {
            addCriterion("UI_COMPONENT_ID in", values, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdNotIn(List<Long> values) {
            addCriterion("UI_COMPONENT_ID not in", values, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdBetween(Long value1, Long value2) {
            addCriterion("UI_COMPONENT_ID between", value1, value2, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiComponentIdNotBetween(Long value1, Long value2) {
            addCriterion("UI_COMPONENT_ID not between", value1, value2, "uiComponentId");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyIsNull() {
            addCriterion("IS_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyIsNotNull() {
            addCriterion("IS_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyEqualTo(String value) {
            addCriterion("IS_READ_ONLY =", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyNotEqualTo(String value) {
            addCriterion("IS_READ_ONLY <>", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyGreaterThan(String value) {
            addCriterion("IS_READ_ONLY >", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_READ_ONLY >=", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyLessThan(String value) {
            addCriterion("IS_READ_ONLY <", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyLessThanOrEqualTo(String value) {
            addCriterion("IS_READ_ONLY <=", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyLike(String value) {
            addCriterion("IS_READ_ONLY like", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyNotLike(String value) {
            addCriterion("IS_READ_ONLY not like", value, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyIn(List<String> values) {
            addCriterion("IS_READ_ONLY in", values, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyNotIn(List<String> values) {
            addCriterion("IS_READ_ONLY not in", values, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyBetween(String value1, String value2) {
            addCriterion("IS_READ_ONLY between", value1, value2, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsReadOnlyNotBetween(String value1, String value2) {
            addCriterion("IS_READ_ONLY not between", value1, value2, "isReadOnly");
            return (Criteria) this;
        }

        public Criteria andIsNotNullIsNull() {
            addCriterion("IS_NOT_NULL is null");
            return (Criteria) this;
        }

        public Criteria andIsNotNullIsNotNull() {
            addCriterion("IS_NOT_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andIsNotNullEqualTo(String value) {
            addCriterion("IS_NOT_NULL =", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullNotEqualTo(String value) {
            addCriterion("IS_NOT_NULL <>", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullGreaterThan(String value) {
            addCriterion("IS_NOT_NULL >", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NOT_NULL >=", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullLessThan(String value) {
            addCriterion("IS_NOT_NULL <", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullLessThanOrEqualTo(String value) {
            addCriterion("IS_NOT_NULL <=", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullLike(String value) {
            addCriterion("IS_NOT_NULL like", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullNotLike(String value) {
            addCriterion("IS_NOT_NULL not like", value, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullIn(List<String> values) {
            addCriterion("IS_NOT_NULL in", values, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullNotIn(List<String> values) {
            addCriterion("IS_NOT_NULL not in", values, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullBetween(String value1, String value2) {
            addCriterion("IS_NOT_NULL between", value1, value2, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andIsNotNullNotBetween(String value1, String value2) {
            addCriterion("IS_NOT_NULL not between", value1, value2, "isNotNull");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("DEFAULT_VALUE =", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <>", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("DEFAULT_VALUE >", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE >=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("DEFAULT_VALUE <", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLike(String value) {
            addCriterion("DEFAULT_VALUE like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotLike(String value) {
            addCriterion("DEFAULT_VALUE not like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIn(List<String> values) {
            addCriterion("DEFAULT_VALUE in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotIn(List<String> values) {
            addCriterion("DEFAULT_VALUE not in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE not between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("IS_HIDE is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("IS_HIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(String value) {
            addCriterion("IS_HIDE =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(String value) {
            addCriterion("IS_HIDE <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(String value) {
            addCriterion("IS_HIDE >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HIDE >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(String value) {
            addCriterion("IS_HIDE <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(String value) {
            addCriterion("IS_HIDE <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLike(String value) {
            addCriterion("IS_HIDE like", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotLike(String value) {
            addCriterion("IS_HIDE not like", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<String> values) {
            addCriterion("IS_HIDE in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<String> values) {
            addCriterion("IS_HIDE not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(String value1, String value2) {
            addCriterion("IS_HIDE between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(String value1, String value2) {
            addCriterion("IS_HIDE not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andBeginRowIsNull() {
            addCriterion("BEGIN_ROW is null");
            return (Criteria) this;
        }

        public Criteria andBeginRowIsNotNull() {
            addCriterion("BEGIN_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andBeginRowEqualTo(Short value) {
            addCriterion("BEGIN_ROW =", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowNotEqualTo(Short value) {
            addCriterion("BEGIN_ROW <>", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowGreaterThan(Short value) {
            addCriterion("BEGIN_ROW >", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowGreaterThanOrEqualTo(Short value) {
            addCriterion("BEGIN_ROW >=", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowLessThan(Short value) {
            addCriterion("BEGIN_ROW <", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowLessThanOrEqualTo(Short value) {
            addCriterion("BEGIN_ROW <=", value, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowIn(List<Short> values) {
            addCriterion("BEGIN_ROW in", values, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowNotIn(List<Short> values) {
            addCriterion("BEGIN_ROW not in", values, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowBetween(Short value1, Short value2) {
            addCriterion("BEGIN_ROW between", value1, value2, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginRowNotBetween(Short value1, Short value2) {
            addCriterion("BEGIN_ROW not between", value1, value2, "beginRow");
            return (Criteria) this;
        }

        public Criteria andBeginColIsNull() {
            addCriterion("BEGIN_COL is null");
            return (Criteria) this;
        }

        public Criteria andBeginColIsNotNull() {
            addCriterion("BEGIN_COL is not null");
            return (Criteria) this;
        }

        public Criteria andBeginColEqualTo(Short value) {
            addCriterion("BEGIN_COL =", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColNotEqualTo(Short value) {
            addCriterion("BEGIN_COL <>", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColGreaterThan(Short value) {
            addCriterion("BEGIN_COL >", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColGreaterThanOrEqualTo(Short value) {
            addCriterion("BEGIN_COL >=", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColLessThan(Short value) {
            addCriterion("BEGIN_COL <", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColLessThanOrEqualTo(Short value) {
            addCriterion("BEGIN_COL <=", value, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColIn(List<Short> values) {
            addCriterion("BEGIN_COL in", values, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColNotIn(List<Short> values) {
            addCriterion("BEGIN_COL not in", values, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColBetween(Short value1, Short value2) {
            addCriterion("BEGIN_COL between", value1, value2, "beginCol");
            return (Criteria) this;
        }

        public Criteria andBeginColNotBetween(Short value1, Short value2) {
            addCriterion("BEGIN_COL not between", value1, value2, "beginCol");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNull() {
            addCriterion("ROW_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNotNull() {
            addCriterion("ROW_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRowNumEqualTo(Short value) {
            addCriterion("ROW_NUM =", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotEqualTo(Short value) {
            addCriterion("ROW_NUM <>", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThan(Short value) {
            addCriterion("ROW_NUM >", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThanOrEqualTo(Short value) {
            addCriterion("ROW_NUM >=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThan(Short value) {
            addCriterion("ROW_NUM <", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThanOrEqualTo(Short value) {
            addCriterion("ROW_NUM <=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumIn(List<Short> values) {
            addCriterion("ROW_NUM in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotIn(List<Short> values) {
            addCriterion("ROW_NUM not in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumBetween(Short value1, Short value2) {
            addCriterion("ROW_NUM between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotBetween(Short value1, Short value2) {
            addCriterion("ROW_NUM not between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andColNumIsNull() {
            addCriterion("COL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andColNumIsNotNull() {
            addCriterion("COL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andColNumEqualTo(Short value) {
            addCriterion("COL_NUM =", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotEqualTo(Short value) {
            addCriterion("COL_NUM <>", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumGreaterThan(Short value) {
            addCriterion("COL_NUM >", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumGreaterThanOrEqualTo(Short value) {
            addCriterion("COL_NUM >=", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumLessThan(Short value) {
            addCriterion("COL_NUM <", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumLessThanOrEqualTo(Short value) {
            addCriterion("COL_NUM <=", value, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumIn(List<Short> values) {
            addCriterion("COL_NUM in", values, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotIn(List<Short> values) {
            addCriterion("COL_NUM not in", values, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumBetween(Short value1, Short value2) {
            addCriterion("COL_NUM between", value1, value2, "colNum");
            return (Criteria) this;
        }

        public Criteria andColNumNotBetween(Short value1, Short value2) {
            addCriterion("COL_NUM not between", value1, value2, "colNum");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNull() {
            addCriterion("PARAMETER1 is null");
            return (Criteria) this;
        }

        public Criteria andParameter1IsNotNull() {
            addCriterion("PARAMETER1 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter1EqualTo(String value) {
            addCriterion("PARAMETER1 =", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotEqualTo(String value) {
            addCriterion("PARAMETER1 <>", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThan(String value) {
            addCriterion("PARAMETER1 >", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1GreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER1 >=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThan(String value) {
            addCriterion("PARAMETER1 <", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1LessThanOrEqualTo(String value) {
            addCriterion("PARAMETER1 <=", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Like(String value) {
            addCriterion("PARAMETER1 like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotLike(String value) {
            addCriterion("PARAMETER1 not like", value, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1In(List<String> values) {
            addCriterion("PARAMETER1 in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotIn(List<String> values) {
            addCriterion("PARAMETER1 not in", values, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1Between(String value1, String value2) {
            addCriterion("PARAMETER1 between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter1NotBetween(String value1, String value2) {
            addCriterion("PARAMETER1 not between", value1, value2, "parameter1");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNull() {
            addCriterion("PARAMETER2 is null");
            return (Criteria) this;
        }

        public Criteria andParameter2IsNotNull() {
            addCriterion("PARAMETER2 is not null");
            return (Criteria) this;
        }

        public Criteria andParameter2EqualTo(String value) {
            addCriterion("PARAMETER2 =", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotEqualTo(String value) {
            addCriterion("PARAMETER2 <>", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThan(String value) {
            addCriterion("PARAMETER2 >", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2GreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER2 >=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThan(String value) {
            addCriterion("PARAMETER2 <", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2LessThanOrEqualTo(String value) {
            addCriterion("PARAMETER2 <=", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Like(String value) {
            addCriterion("PARAMETER2 like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotLike(String value) {
            addCriterion("PARAMETER2 not like", value, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2In(List<String> values) {
            addCriterion("PARAMETER2 in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotIn(List<String> values) {
            addCriterion("PARAMETER2 not in", values, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2Between(String value1, String value2) {
            addCriterion("PARAMETER2 between", value1, value2, "parameter2");
            return (Criteria) this;
        }

        public Criteria andParameter2NotBetween(String value1, String value2) {
            addCriterion("PARAMETER2 not between", value1, value2, "parameter2");
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