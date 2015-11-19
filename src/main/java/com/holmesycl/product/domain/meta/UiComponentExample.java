package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UiComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UiComponentExample() {
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

        public Criteria andInternationalNameIsNull() {
            addCriterion("INTERNATIONAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInternationalNameIsNotNull() {
            addCriterion("INTERNATIONAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalNameEqualTo(String value) {
            addCriterion("INTERNATIONAL_NAME =", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameNotEqualTo(String value) {
            addCriterion("INTERNATIONAL_NAME <>", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameGreaterThan(String value) {
            addCriterion("INTERNATIONAL_NAME >", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_NAME >=", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameLessThan(String value) {
            addCriterion("INTERNATIONAL_NAME <", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameLessThanOrEqualTo(String value) {
            addCriterion("INTERNATIONAL_NAME <=", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameLike(String value) {
            addCriterion("INTERNATIONAL_NAME like", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameNotLike(String value) {
            addCriterion("INTERNATIONAL_NAME not like", value, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameIn(List<String> values) {
            addCriterion("INTERNATIONAL_NAME in", values, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameNotIn(List<String> values) {
            addCriterion("INTERNATIONAL_NAME not in", values, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_NAME between", value1, value2, "internationalName");
            return (Criteria) this;
        }

        public Criteria andInternationalNameNotBetween(String value1, String value2) {
            addCriterion("INTERNATIONAL_NAME not between", value1, value2, "internationalName");
            return (Criteria) this;
        }

        public Criteria andNativeNameIsNull() {
            addCriterion("NATIVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNativeNameIsNotNull() {
            addCriterion("NATIVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNativeNameEqualTo(String value) {
            addCriterion("NATIVE_NAME =", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotEqualTo(String value) {
            addCriterion("NATIVE_NAME <>", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameGreaterThan(String value) {
            addCriterion("NATIVE_NAME >", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_NAME >=", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLessThan(String value) {
            addCriterion("NATIVE_NAME <", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_NAME <=", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameLike(String value) {
            addCriterion("NATIVE_NAME like", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotLike(String value) {
            addCriterion("NATIVE_NAME not like", value, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameIn(List<String> values) {
            addCriterion("NATIVE_NAME in", values, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotIn(List<String> values) {
            addCriterion("NATIVE_NAME not in", values, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameBetween(String value1, String value2) {
            addCriterion("NATIVE_NAME between", value1, value2, "nativeName");
            return (Criteria) this;
        }

        public Criteria andNativeNameNotBetween(String value1, String value2) {
            addCriterion("NATIVE_NAME not between", value1, value2, "nativeName");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescIsNull() {
            addCriterion("UI_COMPONENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescIsNotNull() {
            addCriterion("UI_COMPONENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescEqualTo(String value) {
            addCriterion("UI_COMPONENT_DESC =", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescNotEqualTo(String value) {
            addCriterion("UI_COMPONENT_DESC <>", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescGreaterThan(String value) {
            addCriterion("UI_COMPONENT_DESC >", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescGreaterThanOrEqualTo(String value) {
            addCriterion("UI_COMPONENT_DESC >=", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescLessThan(String value) {
            addCriterion("UI_COMPONENT_DESC <", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescLessThanOrEqualTo(String value) {
            addCriterion("UI_COMPONENT_DESC <=", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescLike(String value) {
            addCriterion("UI_COMPONENT_DESC like", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescNotLike(String value) {
            addCriterion("UI_COMPONENT_DESC not like", value, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescIn(List<String> values) {
            addCriterion("UI_COMPONENT_DESC in", values, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescNotIn(List<String> values) {
            addCriterion("UI_COMPONENT_DESC not in", values, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescBetween(String value1, String value2) {
            addCriterion("UI_COMPONENT_DESC between", value1, value2, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiComponentDescNotBetween(String value1, String value2) {
            addCriterion("UI_COMPONENT_DESC not between", value1, value2, "uiComponentDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempIdIsNull() {
            addCriterion("UI_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andUiTempIdIsNotNull() {
            addCriterion("UI_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUiTempIdEqualTo(Long value) {
            addCriterion("UI_TEMP_ID =", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdNotEqualTo(Long value) {
            addCriterion("UI_TEMP_ID <>", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdGreaterThan(Long value) {
            addCriterion("UI_TEMP_ID >", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_TEMP_ID >=", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdLessThan(Long value) {
            addCriterion("UI_TEMP_ID <", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdLessThanOrEqualTo(Long value) {
            addCriterion("UI_TEMP_ID <=", value, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdIn(List<Long> values) {
            addCriterion("UI_TEMP_ID in", values, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdNotIn(List<Long> values) {
            addCriterion("UI_TEMP_ID not in", values, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdBetween(Long value1, Long value2) {
            addCriterion("UI_TEMP_ID between", value1, value2, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andUiTempIdNotBetween(Long value1, Long value2) {
            addCriterion("UI_TEMP_ID not between", value1, value2, "uiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdIsNull() {
            addCriterion("REF_UI_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdIsNotNull() {
            addCriterion("REF_UI_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdEqualTo(Long value) {
            addCriterion("REF_UI_TEMP_ID =", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdNotEqualTo(Long value) {
            addCriterion("REF_UI_TEMP_ID <>", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdGreaterThan(Long value) {
            addCriterion("REF_UI_TEMP_ID >", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REF_UI_TEMP_ID >=", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdLessThan(Long value) {
            addCriterion("REF_UI_TEMP_ID <", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdLessThanOrEqualTo(Long value) {
            addCriterion("REF_UI_TEMP_ID <=", value, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdIn(List<Long> values) {
            addCriterion("REF_UI_TEMP_ID in", values, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdNotIn(List<Long> values) {
            addCriterion("REF_UI_TEMP_ID not in", values, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdBetween(Long value1, Long value2) {
            addCriterion("REF_UI_TEMP_ID between", value1, value2, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andRefUiTempIdNotBetween(Long value1, Long value2) {
            addCriterion("REF_UI_TEMP_ID not between", value1, value2, "refUiTempId");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNull() {
            addCriterion("COMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompTypeIsNotNull() {
            addCriterion("COMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompTypeEqualTo(String value) {
            addCriterion("COMP_TYPE =", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotEqualTo(String value) {
            addCriterion("COMP_TYPE <>", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThan(String value) {
            addCriterion("COMP_TYPE >", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_TYPE >=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThan(String value) {
            addCriterion("COMP_TYPE <", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLessThanOrEqualTo(String value) {
            addCriterion("COMP_TYPE <=", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeLike(String value) {
            addCriterion("COMP_TYPE like", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotLike(String value) {
            addCriterion("COMP_TYPE not like", value, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeIn(List<String> values) {
            addCriterion("COMP_TYPE in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotIn(List<String> values) {
            addCriterion("COMP_TYPE not in", values, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeBetween(String value1, String value2) {
            addCriterion("COMP_TYPE between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andCompTypeNotBetween(String value1, String value2) {
            addCriterion("COMP_TYPE not between", value1, value2, "compType");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdIsNull() {
            addCriterion("UP_UI_COMPONENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdIsNotNull() {
            addCriterion("UP_UI_COMPONENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdEqualTo(Long value) {
            addCriterion("UP_UI_COMPONENT_ID =", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdNotEqualTo(Long value) {
            addCriterion("UP_UI_COMPONENT_ID <>", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdGreaterThan(Long value) {
            addCriterion("UP_UI_COMPONENT_ID >", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UP_UI_COMPONENT_ID >=", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdLessThan(Long value) {
            addCriterion("UP_UI_COMPONENT_ID <", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdLessThanOrEqualTo(Long value) {
            addCriterion("UP_UI_COMPONENT_ID <=", value, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdIn(List<Long> values) {
            addCriterion("UP_UI_COMPONENT_ID in", values, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdNotIn(List<Long> values) {
            addCriterion("UP_UI_COMPONENT_ID not in", values, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdBetween(Long value1, Long value2) {
            addCriterion("UP_UI_COMPONENT_ID between", value1, value2, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUpUiComponentIdNotBetween(Long value1, Long value2) {
            addCriterion("UP_UI_COMPONENT_ID not between", value1, value2, "upUiComponentId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdIsNull() {
            addCriterion("UI_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUiModelIdIsNotNull() {
            addCriterion("UI_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUiModelIdEqualTo(Long value) {
            addCriterion("UI_MODEL_ID =", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdNotEqualTo(Long value) {
            addCriterion("UI_MODEL_ID <>", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdGreaterThan(Long value) {
            addCriterion("UI_MODEL_ID >", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UI_MODEL_ID >=", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdLessThan(Long value) {
            addCriterion("UI_MODEL_ID <", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdLessThanOrEqualTo(Long value) {
            addCriterion("UI_MODEL_ID <=", value, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdIn(List<Long> values) {
            addCriterion("UI_MODEL_ID in", values, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdNotIn(List<Long> values) {
            addCriterion("UI_MODEL_ID not in", values, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdBetween(Long value1, Long value2) {
            addCriterion("UI_MODEL_ID between", value1, value2, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andUiModelIdNotBetween(Long value1, Long value2) {
            addCriterion("UI_MODEL_ID not between", value1, value2, "uiModelId");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNull() {
            addCriterion("IS_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNotNull() {
            addCriterion("IS_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsEditEqualTo(String value) {
            addCriterion("IS_EDIT =", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotEqualTo(String value) {
            addCriterion("IS_EDIT <>", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThan(String value) {
            addCriterion("IS_EDIT >", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EDIT >=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThan(String value) {
            addCriterion("IS_EDIT <", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThanOrEqualTo(String value) {
            addCriterion("IS_EDIT <=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLike(String value) {
            addCriterion("IS_EDIT like", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotLike(String value) {
            addCriterion("IS_EDIT not like", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditIn(List<String> values) {
            addCriterion("IS_EDIT in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotIn(List<String> values) {
            addCriterion("IS_EDIT not in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditBetween(String value1, String value2) {
            addCriterion("IS_EDIT between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotBetween(String value1, String value2) {
            addCriterion("IS_EDIT not between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andHelpInfoIsNull() {
            addCriterion("HELP_INFO is null");
            return (Criteria) this;
        }

        public Criteria andHelpInfoIsNotNull() {
            addCriterion("HELP_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andHelpInfoEqualTo(String value) {
            addCriterion("HELP_INFO =", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoNotEqualTo(String value) {
            addCriterion("HELP_INFO <>", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoGreaterThan(String value) {
            addCriterion("HELP_INFO >", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoGreaterThanOrEqualTo(String value) {
            addCriterion("HELP_INFO >=", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoLessThan(String value) {
            addCriterion("HELP_INFO <", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoLessThanOrEqualTo(String value) {
            addCriterion("HELP_INFO <=", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoLike(String value) {
            addCriterion("HELP_INFO like", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoNotLike(String value) {
            addCriterion("HELP_INFO not like", value, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoIn(List<String> values) {
            addCriterion("HELP_INFO in", values, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoNotIn(List<String> values) {
            addCriterion("HELP_INFO not in", values, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoBetween(String value1, String value2) {
            addCriterion("HELP_INFO between", value1, value2, "helpInfo");
            return (Criteria) this;
        }

        public Criteria andHelpInfoNotBetween(String value1, String value2) {
            addCriterion("HELP_INFO not between", value1, value2, "helpInfo");
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

        public Criteria andImagePatternIsNull() {
            addCriterion("IMAGE_PATTERN is null");
            return (Criteria) this;
        }

        public Criteria andImagePatternIsNotNull() {
            addCriterion("IMAGE_PATTERN is not null");
            return (Criteria) this;
        }

        public Criteria andImagePatternEqualTo(String value) {
            addCriterion("IMAGE_PATTERN =", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternNotEqualTo(String value) {
            addCriterion("IMAGE_PATTERN <>", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternGreaterThan(String value) {
            addCriterion("IMAGE_PATTERN >", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATTERN >=", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternLessThan(String value) {
            addCriterion("IMAGE_PATTERN <", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATTERN <=", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternLike(String value) {
            addCriterion("IMAGE_PATTERN like", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternNotLike(String value) {
            addCriterion("IMAGE_PATTERN not like", value, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternIn(List<String> values) {
            addCriterion("IMAGE_PATTERN in", values, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternNotIn(List<String> values) {
            addCriterion("IMAGE_PATTERN not in", values, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternBetween(String value1, String value2) {
            addCriterion("IMAGE_PATTERN between", value1, value2, "imagePattern");
            return (Criteria) this;
        }

        public Criteria andImagePatternNotBetween(String value1, String value2) {
            addCriterion("IMAGE_PATTERN not between", value1, value2, "imagePattern");
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

        public Criteria andOrderSeqIsNull() {
            addCriterion("ORDER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNotNull() {
            addCriterion("ORDER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqEqualTo(Short value) {
            addCriterion("ORDER_SEQ =", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotEqualTo(Short value) {
            addCriterion("ORDER_SEQ <>", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThan(Short value) {
            addCriterion("ORDER_SEQ >", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_SEQ >=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThan(Short value) {
            addCriterion("ORDER_SEQ <", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_SEQ <=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIn(List<Short> values) {
            addCriterion("ORDER_SEQ in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotIn(List<Short> values) {
            addCriterion("ORDER_SEQ not in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqBetween(Short value1, Short value2) {
            addCriterion("ORDER_SEQ between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_SEQ not between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdIsNull() {
            addCriterion("REUSE_UI_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdIsNotNull() {
            addCriterion("REUSE_UI_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdEqualTo(Long value) {
            addCriterion("REUSE_UI_TEMP_ID =", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdNotEqualTo(Long value) {
            addCriterion("REUSE_UI_TEMP_ID <>", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdGreaterThan(Long value) {
            addCriterion("REUSE_UI_TEMP_ID >", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REUSE_UI_TEMP_ID >=", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdLessThan(Long value) {
            addCriterion("REUSE_UI_TEMP_ID <", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdLessThanOrEqualTo(Long value) {
            addCriterion("REUSE_UI_TEMP_ID <=", value, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdIn(List<Long> values) {
            addCriterion("REUSE_UI_TEMP_ID in", values, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdNotIn(List<Long> values) {
            addCriterion("REUSE_UI_TEMP_ID not in", values, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdBetween(Long value1, Long value2) {
            addCriterion("REUSE_UI_TEMP_ID between", value1, value2, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andReuseUiTempIdNotBetween(Long value1, Long value2) {
            addCriterion("REUSE_UI_TEMP_ID not between", value1, value2, "reuseUiTempId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
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