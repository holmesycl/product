package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.List;

public class MetaIvalueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaIvalueExample() {
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

        public Criteria andClassPathIsNull() {
            addCriterion("CLASS_PATH is null");
            return (Criteria) this;
        }

        public Criteria andClassPathIsNotNull() {
            addCriterion("CLASS_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andClassPathEqualTo(String value) {
            addCriterion("CLASS_PATH =", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotEqualTo(String value) {
            addCriterion("CLASS_PATH <>", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathGreaterThan(String value) {
            addCriterion("CLASS_PATH >", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_PATH >=", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLessThan(String value) {
            addCriterion("CLASS_PATH <", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLessThanOrEqualTo(String value) {
            addCriterion("CLASS_PATH <=", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLike(String value) {
            addCriterion("CLASS_PATH like", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotLike(String value) {
            addCriterion("CLASS_PATH not like", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathIn(List<String> values) {
            addCriterion("CLASS_PATH in", values, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotIn(List<String> values) {
            addCriterion("CLASS_PATH not in", values, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathBetween(String value1, String value2) {
            addCriterion("CLASS_PATH between", value1, value2, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotBetween(String value1, String value2) {
            addCriterion("CLASS_PATH not between", value1, value2, "classPath");
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

        public Criteria andSortByIsNull() {
            addCriterion("SORT_BY is null");
            return (Criteria) this;
        }

        public Criteria andSortByIsNotNull() {
            addCriterion("SORT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andSortByEqualTo(Integer value) {
            addCriterion("SORT_BY =", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotEqualTo(Integer value) {
            addCriterion("SORT_BY <>", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByGreaterThan(Integer value) {
            addCriterion("SORT_BY >", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_BY >=", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByLessThan(Integer value) {
            addCriterion("SORT_BY <", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_BY <=", value, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByIn(List<Integer> values) {
            addCriterion("SORT_BY in", values, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotIn(List<Integer> values) {
            addCriterion("SORT_BY not in", values, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByBetween(Integer value1, Integer value2) {
            addCriterion("SORT_BY between", value1, value2, "sortBy");
            return (Criteria) this;
        }

        public Criteria andSortByNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_BY not between", value1, value2, "sortBy");
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