package com.holmesycl.product.domain.meta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UiTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UiTemplateExample() {
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

        public Criteria andItemTypeIsNull() {
            addCriterion("ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("ITEM_TYPE =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("ITEM_TYPE <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("ITEM_TYPE >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("ITEM_TYPE <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("ITEM_TYPE like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("ITEM_TYPE not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("ITEM_TYPE in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("ITEM_TYPE not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeIsNull() {
            addCriterion("PCE_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeIsNotNull() {
            addCriterion("PCE_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeEqualTo(String value) {
            addCriterion("PCE_ITEM_TYPE =", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeNotEqualTo(String value) {
            addCriterion("PCE_ITEM_TYPE <>", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeGreaterThan(String value) {
            addCriterion("PCE_ITEM_TYPE >", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PCE_ITEM_TYPE >=", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeLessThan(String value) {
            addCriterion("PCE_ITEM_TYPE <", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeLessThanOrEqualTo(String value) {
            addCriterion("PCE_ITEM_TYPE <=", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeLike(String value) {
            addCriterion("PCE_ITEM_TYPE like", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeNotLike(String value) {
            addCriterion("PCE_ITEM_TYPE not like", value, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeIn(List<String> values) {
            addCriterion("PCE_ITEM_TYPE in", values, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeNotIn(List<String> values) {
            addCriterion("PCE_ITEM_TYPE not in", values, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeBetween(String value1, String value2) {
            addCriterion("PCE_ITEM_TYPE between", value1, value2, "pceItemType");
            return (Criteria) this;
        }

        public Criteria andPceItemTypeNotBetween(String value1, String value2) {
            addCriterion("PCE_ITEM_TYPE not between", value1, value2, "pceItemType");
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

        public Criteria andUiTempDescIsNull() {
            addCriterion("UI_TEMP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUiTempDescIsNotNull() {
            addCriterion("UI_TEMP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUiTempDescEqualTo(String value) {
            addCriterion("UI_TEMP_DESC =", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescNotEqualTo(String value) {
            addCriterion("UI_TEMP_DESC <>", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescGreaterThan(String value) {
            addCriterion("UI_TEMP_DESC >", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescGreaterThanOrEqualTo(String value) {
            addCriterion("UI_TEMP_DESC >=", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescLessThan(String value) {
            addCriterion("UI_TEMP_DESC <", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescLessThanOrEqualTo(String value) {
            addCriterion("UI_TEMP_DESC <=", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescLike(String value) {
            addCriterion("UI_TEMP_DESC like", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescNotLike(String value) {
            addCriterion("UI_TEMP_DESC not like", value, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescIn(List<String> values) {
            addCriterion("UI_TEMP_DESC in", values, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescNotIn(List<String> values) {
            addCriterion("UI_TEMP_DESC not in", values, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescBetween(String value1, String value2) {
            addCriterion("UI_TEMP_DESC between", value1, value2, "uiTempDesc");
            return (Criteria) this;
        }

        public Criteria andUiTempDescNotBetween(String value1, String value2) {
            addCriterion("UI_TEMP_DESC not between", value1, value2, "uiTempDesc");
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

        public Criteria andTemplateTypeIsNull() {
            addCriterion("TEMPLATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("TEMPLATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE =", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE <>", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThan(String value) {
            addCriterion("TEMPLATE_TYPE >", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE >=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThan(String value) {
            addCriterion("TEMPLATE_TYPE <", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE <=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLike(String value) {
            addCriterion("TEMPLATE_TYPE like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotLike(String value) {
            addCriterion("TEMPLATE_TYPE not like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIn(List<String> values) {
            addCriterion("TEMPLATE_TYPE in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotIn(List<String> values) {
            addCriterion("TEMPLATE_TYPE not in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TYPE between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TYPE not between", value1, value2, "templateType");
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

        public Criteria andWidthIsNull() {
            addCriterion("WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(String value) {
            addCriterion("WIDTH =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(String value) {
            addCriterion("WIDTH <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(String value) {
            addCriterion("WIDTH >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(String value) {
            addCriterion("WIDTH >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(String value) {
            addCriterion("WIDTH <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(String value) {
            addCriterion("WIDTH <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLike(String value) {
            addCriterion("WIDTH like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotLike(String value) {
            addCriterion("WIDTH not like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<String> values) {
            addCriterion("WIDTH in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<String> values) {
            addCriterion("WIDTH not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(String value1, String value2) {
            addCriterion("WIDTH between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(String value1, String value2) {
            addCriterion("WIDTH not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("HEIGHT like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("HEIGHT not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
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