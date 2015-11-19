package com.holmesycl.product.domain.meta;

import java.util.Date;

public class UiComponent {
    private Long uiComponentId;

    private String internationalName;

    private String nativeName;

    private String uiComponentDesc;

    private Long uiTempId;

    private Long refUiTempId;

    private String compType;

    private Long upUiComponentId;

    private Long uiModelId;

    private String isEdit;

    private String helpInfo;

    private Date createDate;

    private String imagePattern;

    private Long creater;

    private Long modifier;

    private Date modifyDate;

    private String delFlag;

    private String state;

    private String parameter1;

    private String parameter2;

    private Short orderSeq;

    private Long reuseUiTempId;

    private String groupName;

    public Long getUiComponentId() {
        return uiComponentId;
    }

    public void setUiComponentId(Long uiComponentId) {
        this.uiComponentId = uiComponentId;
    }

    public String getInternationalName() {
        return internationalName;
    }

    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName == null ? null : internationalName.trim();
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName == null ? null : nativeName.trim();
    }

    public String getUiComponentDesc() {
        return uiComponentDesc;
    }

    public void setUiComponentDesc(String uiComponentDesc) {
        this.uiComponentDesc = uiComponentDesc == null ? null : uiComponentDesc.trim();
    }

    public Long getUiTempId() {
        return uiTempId;
    }

    public void setUiTempId(Long uiTempId) {
        this.uiTempId = uiTempId;
    }

    public Long getRefUiTempId() {
        return refUiTempId;
    }

    public void setRefUiTempId(Long refUiTempId) {
        this.refUiTempId = refUiTempId;
    }

    public String getCompType() {
        return compType;
    }

    public void setCompType(String compType) {
        this.compType = compType == null ? null : compType.trim();
    }

    public Long getUpUiComponentId() {
        return upUiComponentId;
    }

    public void setUpUiComponentId(Long upUiComponentId) {
        this.upUiComponentId = upUiComponentId;
    }

    public Long getUiModelId() {
        return uiModelId;
    }

    public void setUiModelId(Long uiModelId) {
        this.uiModelId = uiModelId;
    }

    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit == null ? null : isEdit.trim();
    }

    public String getHelpInfo() {
        return helpInfo;
    }

    public void setHelpInfo(String helpInfo) {
        this.helpInfo = helpInfo == null ? null : helpInfo.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getImagePattern() {
        return imagePattern;
    }

    public void setImagePattern(String imagePattern) {
        this.imagePattern = imagePattern == null ? null : imagePattern.trim();
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1 == null ? null : parameter1.trim();
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2 == null ? null : parameter2.trim();
    }

    public Short getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Short orderSeq) {
        this.orderSeq = orderSeq;
    }

    public Long getReuseUiTempId() {
        return reuseUiTempId;
    }

    public void setReuseUiTempId(Long reuseUiTempId) {
        this.reuseUiTempId = reuseUiTempId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }
}