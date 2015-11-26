package com.holmesycl.product.domain.meta;

import java.util.Date;

public class MetaAttrSpec {
    private Long attrId;

    private String code;

    private String name;

    private Long objectSpecId;

    private String dataType;

    private Long refObjectSpecId;

    private String isNull;

    private String isMemory;

    private String getValuesIntf;

    private String params;

    private String defaultValue;

    private Long attrLength;

    private String isUnique;

    private String state;

    private Long creater;

    private Date createDate;

    private Long modifier;

    private Date modifyDate;

    private String delFlag;

    private String showFormat;

    private String remark;

    private String displayAttr;

    private Integer orderSeq;

    private String defCompType;

    private String regexp;

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getObjectSpecId() {
        return objectSpecId;
    }

    public void setObjectSpecId(Long objectSpecId) {
        this.objectSpecId = objectSpecId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public Long getRefObjectSpecId() {
        return refObjectSpecId;
    }

    public void setRefObjectSpecId(Long refObjectSpecId) {
        this.refObjectSpecId = refObjectSpecId;
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull == null ? null : isNull.trim();
    }

    public String getIsMemory() {
        return isMemory;
    }

    public void setIsMemory(String isMemory) {
        this.isMemory = isMemory == null ? null : isMemory.trim();
    }

    public String getGetValuesIntf() {
        return getValuesIntf;
    }

    public void setGetValuesIntf(String getValuesIntf) {
        this.getValuesIntf = getValuesIntf == null ? null : getValuesIntf.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public Long getAttrLength() {
        return attrLength;
    }

    public void setAttrLength(Long attrLength) {
        this.attrLength = attrLength;
    }

    public String getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(String isUnique) {
        this.isUnique = isUnique == null ? null : isUnique.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getShowFormat() {
        return showFormat;
    }

    public void setShowFormat(String showFormat) {
        this.showFormat = showFormat == null ? null : showFormat.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDisplayAttr() {
        return displayAttr;
    }

    public void setDisplayAttr(String displayAttr) {
        this.displayAttr = displayAttr == null ? null : displayAttr.trim();
    }

    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getDefCompType() {
        return defCompType;
    }

    public void setDefCompType(String defCompType) {
        this.defCompType = defCompType == null ? null : defCompType.trim();
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp == null ? null : regexp.trim();
    }
}