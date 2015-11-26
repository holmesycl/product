package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MetaAttrSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaAttrSpecExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdIsNull() {
            addCriterion("OBJECT_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdIsNotNull() {
            addCriterion("OBJECT_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdEqualTo(Long value) {
            addCriterion("OBJECT_SPEC_ID =", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdNotEqualTo(Long value) {
            addCriterion("OBJECT_SPEC_ID <>", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdGreaterThan(Long value) {
            addCriterion("OBJECT_SPEC_ID >", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_SPEC_ID >=", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdLessThan(Long value) {
            addCriterion("OBJECT_SPEC_ID <", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_SPEC_ID <=", value, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdIn(List<Long> values) {
            addCriterion("OBJECT_SPEC_ID in", values, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdNotIn(List<Long> values) {
            addCriterion("OBJECT_SPEC_ID not in", values, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_SPEC_ID between", value1, value2, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andObjectSpecIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_SPEC_ID not between", value1, value2, "objectSpecId");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdIsNull() {
            addCriterion("REF_OBJECT_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdIsNotNull() {
            addCriterion("REF_OBJECT_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdEqualTo(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID =", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdNotEqualTo(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID <>", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdGreaterThan(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID >", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID >=", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdLessThan(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID <", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdLessThanOrEqualTo(Long value) {
            addCriterion("REF_OBJECT_SPEC_ID <=", value, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdIn(List<Long> values) {
            addCriterion("REF_OBJECT_SPEC_ID in", values, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdNotIn(List<Long> values) {
            addCriterion("REF_OBJECT_SPEC_ID not in", values, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdBetween(Long value1, Long value2) {
            addCriterion("REF_OBJECT_SPEC_ID between", value1, value2, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andRefObjectSpecIdNotBetween(Long value1, Long value2) {
            addCriterion("REF_OBJECT_SPEC_ID not between", value1, value2, "refObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andIsNullIsNull() {
            addCriterion("IS_NULL is null");
            return (Criteria) this;
        }

        public Criteria andIsNullIsNotNull() {
            addCriterion("IS_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andIsNullEqualTo(String value) {
            addCriterion("IS_NULL =", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotEqualTo(String value) {
            addCriterion("IS_NULL <>", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullGreaterThan(String value) {
            addCriterion("IS_NULL >", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NULL >=", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLessThan(String value) {
            addCriterion("IS_NULL <", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLessThanOrEqualTo(String value) {
            addCriterion("IS_NULL <=", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullLike(String value) {
            addCriterion("IS_NULL like", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotLike(String value) {
            addCriterion("IS_NULL not like", value, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullIn(List<String> values) {
            addCriterion("IS_NULL in", values, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotIn(List<String> values) {
            addCriterion("IS_NULL not in", values, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullBetween(String value1, String value2) {
            addCriterion("IS_NULL between", value1, value2, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsNullNotBetween(String value1, String value2) {
            addCriterion("IS_NULL not between", value1, value2, "isNull");
            return (Criteria) this;
        }

        public Criteria andIsMemoryIsNull() {
            addCriterion("IS_MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andIsMemoryIsNotNull() {
            addCriterion("IS_MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemoryEqualTo(String value) {
            addCriterion("IS_MEMORY =", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryNotEqualTo(String value) {
            addCriterion("IS_MEMORY <>", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryGreaterThan(String value) {
            addCriterion("IS_MEMORY >", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MEMORY >=", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryLessThan(String value) {
            addCriterion("IS_MEMORY <", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryLessThanOrEqualTo(String value) {
            addCriterion("IS_MEMORY <=", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryLike(String value) {
            addCriterion("IS_MEMORY like", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryNotLike(String value) {
            addCriterion("IS_MEMORY not like", value, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryIn(List<String> values) {
            addCriterion("IS_MEMORY in", values, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryNotIn(List<String> values) {
            addCriterion("IS_MEMORY not in", values, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryBetween(String value1, String value2) {
            addCriterion("IS_MEMORY between", value1, value2, "isMemory");
            return (Criteria) this;
        }

        public Criteria andIsMemoryNotBetween(String value1, String value2) {
            addCriterion("IS_MEMORY not between", value1, value2, "isMemory");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfIsNull() {
            addCriterion("GET_VALUES_INTF is null");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfIsNotNull() {
            addCriterion("GET_VALUES_INTF is not null");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfEqualTo(String value) {
            addCriterion("GET_VALUES_INTF =", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfNotEqualTo(String value) {
            addCriterion("GET_VALUES_INTF <>", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfGreaterThan(String value) {
            addCriterion("GET_VALUES_INTF >", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfGreaterThanOrEqualTo(String value) {
            addCriterion("GET_VALUES_INTF >=", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfLessThan(String value) {
            addCriterion("GET_VALUES_INTF <", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfLessThanOrEqualTo(String value) {
            addCriterion("GET_VALUES_INTF <=", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfLike(String value) {
            addCriterion("GET_VALUES_INTF like", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfNotLike(String value) {
            addCriterion("GET_VALUES_INTF not like", value, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfIn(List<String> values) {
            addCriterion("GET_VALUES_INTF in", values, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfNotIn(List<String> values) {
            addCriterion("GET_VALUES_INTF not in", values, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfBetween(String value1, String value2) {
            addCriterion("GET_VALUES_INTF between", value1, value2, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andGetValuesIntfNotBetween(String value1, String value2) {
            addCriterion("GET_VALUES_INTF not between", value1, value2, "getValuesIntf");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("PARAMS =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("PARAMS <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("PARAMS >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("PARAMS <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("PARAMS <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("PARAMS like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("PARAMS not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("PARAMS in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("PARAMS not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("PARAMS between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("PARAMS not between", value1, value2, "params");
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

        public Criteria andAttrLengthIsNull() {
            addCriterion("ATTR_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andAttrLengthIsNotNull() {
            addCriterion("ATTR_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andAttrLengthEqualTo(Long value) {
            addCriterion("ATTR_LENGTH =", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthNotEqualTo(Long value) {
            addCriterion("ATTR_LENGTH <>", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthGreaterThan(Long value) {
            addCriterion("ATTR_LENGTH >", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTR_LENGTH >=", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthLessThan(Long value) {
            addCriterion("ATTR_LENGTH <", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthLessThanOrEqualTo(Long value) {
            addCriterion("ATTR_LENGTH <=", value, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthIn(List<Long> values) {
            addCriterion("ATTR_LENGTH in", values, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthNotIn(List<Long> values) {
            addCriterion("ATTR_LENGTH not in", values, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthBetween(Long value1, Long value2) {
            addCriterion("ATTR_LENGTH between", value1, value2, "attrLength");
            return (Criteria) this;
        }

        public Criteria andAttrLengthNotBetween(Long value1, Long value2) {
            addCriterion("ATTR_LENGTH not between", value1, value2, "attrLength");
            return (Criteria) this;
        }

        public Criteria andIsUniqueIsNull() {
            addCriterion("IS_UNIQUE is null");
            return (Criteria) this;
        }

        public Criteria andIsUniqueIsNotNull() {
            addCriterion("IS_UNIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUniqueEqualTo(String value) {
            addCriterion("IS_UNIQUE =", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueNotEqualTo(String value) {
            addCriterion("IS_UNIQUE <>", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueGreaterThan(String value) {
            addCriterion("IS_UNIQUE >", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UNIQUE >=", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueLessThan(String value) {
            addCriterion("IS_UNIQUE <", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueLessThanOrEqualTo(String value) {
            addCriterion("IS_UNIQUE <=", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueLike(String value) {
            addCriterion("IS_UNIQUE like", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueNotLike(String value) {
            addCriterion("IS_UNIQUE not like", value, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueIn(List<String> values) {
            addCriterion("IS_UNIQUE in", values, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueNotIn(List<String> values) {
            addCriterion("IS_UNIQUE not in", values, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueBetween(String value1, String value2) {
            addCriterion("IS_UNIQUE between", value1, value2, "isUnique");
            return (Criteria) this;
        }

        public Criteria andIsUniqueNotBetween(String value1, String value2) {
            addCriterion("IS_UNIQUE not between", value1, value2, "isUnique");
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

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Long value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Long value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Long value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Long value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Long value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Long> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Long> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Long value1, Long value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Long value1, Long value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Long value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Long value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Long value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Long value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Long value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Long> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Long> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Long value1, Long value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Long value1, Long value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andShowFormatIsNull() {
            addCriterion("SHOW_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andShowFormatIsNotNull() {
            addCriterion("SHOW_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andShowFormatEqualTo(String value) {
            addCriterion("SHOW_FORMAT =", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatNotEqualTo(String value) {
            addCriterion("SHOW_FORMAT <>", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatGreaterThan(String value) {
            addCriterion("SHOW_FORMAT >", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_FORMAT >=", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatLessThan(String value) {
            addCriterion("SHOW_FORMAT <", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatLessThanOrEqualTo(String value) {
            addCriterion("SHOW_FORMAT <=", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatLike(String value) {
            addCriterion("SHOW_FORMAT like", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatNotLike(String value) {
            addCriterion("SHOW_FORMAT not like", value, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatIn(List<String> values) {
            addCriterion("SHOW_FORMAT in", values, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatNotIn(List<String> values) {
            addCriterion("SHOW_FORMAT not in", values, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatBetween(String value1, String value2) {
            addCriterion("SHOW_FORMAT between", value1, value2, "showFormat");
            return (Criteria) this;
        }

        public Criteria andShowFormatNotBetween(String value1, String value2) {
            addCriterion("SHOW_FORMAT not between", value1, value2, "showFormat");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrIsNull() {
            addCriterion("DISPLAY_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrIsNotNull() {
            addCriterion("DISPLAY_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrEqualTo(String value) {
            addCriterion("DISPLAY_ATTR =", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrNotEqualTo(String value) {
            addCriterion("DISPLAY_ATTR <>", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrGreaterThan(String value) {
            addCriterion("DISPLAY_ATTR >", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_ATTR >=", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrLessThan(String value) {
            addCriterion("DISPLAY_ATTR <", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_ATTR <=", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrLike(String value) {
            addCriterion("DISPLAY_ATTR like", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrNotLike(String value) {
            addCriterion("DISPLAY_ATTR not like", value, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrIn(List<String> values) {
            addCriterion("DISPLAY_ATTR in", values, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrNotIn(List<String> values) {
            addCriterion("DISPLAY_ATTR not in", values, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrBetween(String value1, String value2) {
            addCriterion("DISPLAY_ATTR between", value1, value2, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andDisplayAttrNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_ATTR not between", value1, value2, "displayAttr");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNull() {
            addCriterion("ORDER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNotNull() {
            addCriterion("ORDER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqEqualTo(Integer value) {
            addCriterion("ORDER_SEQ =", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotEqualTo(Integer value) {
            addCriterion("ORDER_SEQ <>", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThan(Integer value) {
            addCriterion("ORDER_SEQ >", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_SEQ >=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThan(Integer value) {
            addCriterion("ORDER_SEQ <", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_SEQ <=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIn(List<Integer> values) {
            addCriterion("ORDER_SEQ in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotIn(List<Integer> values) {
            addCriterion("ORDER_SEQ not in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_SEQ between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_SEQ not between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeIsNull() {
            addCriterion("DEF_COMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeIsNotNull() {
            addCriterion("DEF_COMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeEqualTo(String value) {
            addCriterion("DEF_COMP_TYPE =", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeNotEqualTo(String value) {
            addCriterion("DEF_COMP_TYPE <>", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeGreaterThan(String value) {
            addCriterion("DEF_COMP_TYPE >", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_COMP_TYPE >=", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeLessThan(String value) {
            addCriterion("DEF_COMP_TYPE <", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeLessThanOrEqualTo(String value) {
            addCriterion("DEF_COMP_TYPE <=", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeLike(String value) {
            addCriterion("DEF_COMP_TYPE like", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeNotLike(String value) {
            addCriterion("DEF_COMP_TYPE not like", value, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeIn(List<String> values) {
            addCriterion("DEF_COMP_TYPE in", values, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeNotIn(List<String> values) {
            addCriterion("DEF_COMP_TYPE not in", values, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeBetween(String value1, String value2) {
            addCriterion("DEF_COMP_TYPE between", value1, value2, "defCompType");
            return (Criteria) this;
        }

        public Criteria andDefCompTypeNotBetween(String value1, String value2) {
            addCriterion("DEF_COMP_TYPE not between", value1, value2, "defCompType");
            return (Criteria) this;
        }

        public Criteria andRegexpIsNull() {
            addCriterion("REGEXP is null");
            return (Criteria) this;
        }

        public Criteria andRegexpIsNotNull() {
            addCriterion("REGEXP is not null");
            return (Criteria) this;
        }

        public Criteria andRegexpEqualTo(String value) {
            addCriterion("REGEXP =", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpNotEqualTo(String value) {
            addCriterion("REGEXP <>", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpGreaterThan(String value) {
            addCriterion("REGEXP >", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpGreaterThanOrEqualTo(String value) {
            addCriterion("REGEXP >=", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpLessThan(String value) {
            addCriterion("REGEXP <", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpLessThanOrEqualTo(String value) {
            addCriterion("REGEXP <=", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpLike(String value) {
            addCriterion("REGEXP like", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpNotLike(String value) {
            addCriterion("REGEXP not like", value, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpIn(List<String> values) {
            addCriterion("REGEXP in", values, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpNotIn(List<String> values) {
            addCriterion("REGEXP not in", values, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpBetween(String value1, String value2) {
            addCriterion("REGEXP between", value1, value2, "regexp");
            return (Criteria) this;
        }

        public Criteria andRegexpNotBetween(String value1, String value2) {
            addCriterion("REGEXP not between", value1, value2, "regexp");
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