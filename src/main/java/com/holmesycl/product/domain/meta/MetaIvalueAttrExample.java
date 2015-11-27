package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.List;

public class MetaIvalueAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaIvalueAttrExample() {
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

        public Criteria andMappingAttrIdIsNull() {
            addCriterion("MAPPING_ATTR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdIsNotNull() {
            addCriterion("MAPPING_ATTR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdEqualTo(Long value) {
            addCriterion("MAPPING_ATTR_ID =", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdNotEqualTo(Long value) {
            addCriterion("MAPPING_ATTR_ID <>", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdGreaterThan(Long value) {
            addCriterion("MAPPING_ATTR_ID >", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MAPPING_ATTR_ID >=", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdLessThan(Long value) {
            addCriterion("MAPPING_ATTR_ID <", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("MAPPING_ATTR_ID <=", value, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdIn(List<Long> values) {
            addCriterion("MAPPING_ATTR_ID in", values, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdNotIn(List<Long> values) {
            addCriterion("MAPPING_ATTR_ID not in", values, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdBetween(Long value1, Long value2) {
            addCriterion("MAPPING_ATTR_ID between", value1, value2, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andMappingAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("MAPPING_ATTR_ID not between", value1, value2, "mappingAttrId");
            return (Criteria) this;
        }

        public Criteria andValueIdIsNull() {
            addCriterion("VALUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andValueIdIsNotNull() {
            addCriterion("VALUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andValueIdEqualTo(Long value) {
            addCriterion("VALUE_ID =", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotEqualTo(Long value) {
            addCriterion("VALUE_ID <>", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThan(Long value) {
            addCriterion("VALUE_ID >", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VALUE_ID >=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThan(Long value) {
            addCriterion("VALUE_ID <", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThanOrEqualTo(Long value) {
            addCriterion("VALUE_ID <=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdIn(List<Long> values) {
            addCriterion("VALUE_ID in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotIn(List<Long> values) {
            addCriterion("VALUE_ID not in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdBetween(Long value1, Long value2) {
            addCriterion("VALUE_ID between", value1, value2, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotBetween(Long value1, Long value2) {
            addCriterion("VALUE_ID not between", value1, value2, "valueId");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("PROJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("PROJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(Integer value) {
            addCriterion("PROJECT_CODE =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(Integer value) {
            addCriterion("PROJECT_CODE <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(Integer value) {
            addCriterion("PROJECT_CODE >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_CODE >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(Integer value) {
            addCriterion("PROJECT_CODE <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_CODE <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<Integer> values) {
            addCriterion("PROJECT_CODE in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<Integer> values) {
            addCriterion("PROJECT_CODE not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_CODE between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_CODE not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("ATTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("ATTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("ATTR_NAME =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("ATTR_NAME <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("ATTR_NAME >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("ATTR_NAME <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("ATTR_NAME like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("ATTR_NAME not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("ATTR_NAME in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("ATTR_NAME not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("ATTR_NAME between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("ATTR_NAME not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNull() {
            addCriterion("ATTR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNotNull() {
            addCriterion("ATTR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeEqualTo(String value) {
            addCriterion("ATTR_CODE =", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotEqualTo(String value) {
            addCriterion("ATTR_CODE <>", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThan(String value) {
            addCriterion("ATTR_CODE >", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_CODE >=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThan(String value) {
            addCriterion("ATTR_CODE <", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("ATTR_CODE <=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLike(String value) {
            addCriterion("ATTR_CODE like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotLike(String value) {
            addCriterion("ATTR_CODE not like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIn(List<String> values) {
            addCriterion("ATTR_CODE in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotIn(List<String> values) {
            addCriterion("ATTR_CODE not in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeBetween(String value1, String value2) {
            addCriterion("ATTR_CODE between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotBetween(String value1, String value2) {
            addCriterion("ATTR_CODE not between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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