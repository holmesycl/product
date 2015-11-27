package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.List;

public class MetaIvalueAttrRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaIvalueAttrRelExample() {
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

        public Criteria andMetaIvalueAttrRelIdIsNull() {
            addCriterion("META_IVALUE_ATTR_REL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdIsNotNull() {
            addCriterion("META_IVALUE_ATTR_REL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdEqualTo(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID =", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdNotEqualTo(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID <>", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdGreaterThan(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID >", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID >=", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdLessThan(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID <", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdLessThanOrEqualTo(Long value) {
            addCriterion("META_IVALUE_ATTR_REL_ID <=", value, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdIn(List<Long> values) {
            addCriterion("META_IVALUE_ATTR_REL_ID in", values, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdNotIn(List<Long> values) {
            addCriterion("META_IVALUE_ATTR_REL_ID not in", values, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdBetween(Long value1, Long value2) {
            addCriterion("META_IVALUE_ATTR_REL_ID between", value1, value2, "metaIvalueAttrRelId");
            return (Criteria) this;
        }

        public Criteria andMetaIvalueAttrRelIdNotBetween(Long value1, Long value2) {
            addCriterion("META_IVALUE_ATTR_REL_ID not between", value1, value2, "metaIvalueAttrRelId");
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