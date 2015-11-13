package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.List;

public class MetaObjectSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaObjectSpecExample() {
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

        public Criteria andObjectSpecCodeIsNull() {
            addCriterion("OBJECT_SPEC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeIsNotNull() {
            addCriterion("OBJECT_SPEC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeEqualTo(String value) {
            addCriterion("OBJECT_SPEC_CODE =", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeNotEqualTo(String value) {
            addCriterion("OBJECT_SPEC_CODE <>", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeGreaterThan(String value) {
            addCriterion("OBJECT_SPEC_CODE >", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_SPEC_CODE >=", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeLessThan(String value) {
            addCriterion("OBJECT_SPEC_CODE <", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_SPEC_CODE <=", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeLike(String value) {
            addCriterion("OBJECT_SPEC_CODE like", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeNotLike(String value) {
            addCriterion("OBJECT_SPEC_CODE not like", value, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeIn(List<String> values) {
            addCriterion("OBJECT_SPEC_CODE in", values, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeNotIn(List<String> values) {
            addCriterion("OBJECT_SPEC_CODE not in", values, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeBetween(String value1, String value2) {
            addCriterion("OBJECT_SPEC_CODE between", value1, value2, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecCodeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_SPEC_CODE not between", value1, value2, "objectSpecCode");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameIsNull() {
            addCriterion("OBJECT_SPEC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameIsNotNull() {
            addCriterion("OBJECT_SPEC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameEqualTo(String value) {
            addCriterion("OBJECT_SPEC_NAME =", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameNotEqualTo(String value) {
            addCriterion("OBJECT_SPEC_NAME <>", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameGreaterThan(String value) {
            addCriterion("OBJECT_SPEC_NAME >", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_SPEC_NAME >=", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameLessThan(String value) {
            addCriterion("OBJECT_SPEC_NAME <", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_SPEC_NAME <=", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameLike(String value) {
            addCriterion("OBJECT_SPEC_NAME like", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameNotLike(String value) {
            addCriterion("OBJECT_SPEC_NAME not like", value, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameIn(List<String> values) {
            addCriterion("OBJECT_SPEC_NAME in", values, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameNotIn(List<String> values) {
            addCriterion("OBJECT_SPEC_NAME not in", values, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameBetween(String value1, String value2) {
            addCriterion("OBJECT_SPEC_NAME between", value1, value2, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andObjectSpecNameNotBetween(String value1, String value2) {
            addCriterion("OBJECT_SPEC_NAME not between", value1, value2, "objectSpecName");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdIsNull() {
            addCriterion("PARENT_OBJECT_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdIsNotNull() {
            addCriterion("PARENT_OBJECT_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdEqualTo(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID =", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdNotEqualTo(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID <>", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdGreaterThan(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID >", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID >=", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdLessThan(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID <", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_OBJECT_SPEC_ID <=", value, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdIn(List<Long> values) {
            addCriterion("PARENT_OBJECT_SPEC_ID in", values, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdNotIn(List<Long> values) {
            addCriterion("PARENT_OBJECT_SPEC_ID not in", values, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_OBJECT_SPEC_ID between", value1, value2, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andParentObjectSpecIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_OBJECT_SPEC_ID not between", value1, value2, "parentObjectSpecId");
            return (Criteria) this;
        }

        public Criteria andJavaClassIsNull() {
            addCriterion("JAVA_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andJavaClassIsNotNull() {
            addCriterion("JAVA_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andJavaClassEqualTo(String value) {
            addCriterion("JAVA_CLASS =", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotEqualTo(String value) {
            addCriterion("JAVA_CLASS <>", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassGreaterThan(String value) {
            addCriterion("JAVA_CLASS >", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassGreaterThanOrEqualTo(String value) {
            addCriterion("JAVA_CLASS >=", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLessThan(String value) {
            addCriterion("JAVA_CLASS <", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLessThanOrEqualTo(String value) {
            addCriterion("JAVA_CLASS <=", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLike(String value) {
            addCriterion("JAVA_CLASS like", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotLike(String value) {
            addCriterion("JAVA_CLASS not like", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassIn(List<String> values) {
            addCriterion("JAVA_CLASS in", values, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotIn(List<String> values) {
            addCriterion("JAVA_CLASS not in", values, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassBetween(String value1, String value2) {
            addCriterion("JAVA_CLASS between", value1, value2, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotBetween(String value1, String value2) {
            addCriterion("JAVA_CLASS not between", value1, value2, "javaClass");
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