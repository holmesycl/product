package com.holmesycl.product.domain.meta;

import java.util.Date;

public class UiTemplate {
    private Long uiTempId;

    private Long objectSpecId;

    private String itemType;

    private String pceItemType;

    private String internationalName;

    private String nativeName;

    private String uiTempDesc;

    private Long creater;

    private Date createDate;

    private Long modifier;

    private Date modifyDate;

    private String delFlag;

    private String state;

    private String templateType;

    private Long reuseUiTempId;

    private String width;

    private String height;

    public Long getUiTempId() {
        return uiTempId;
    }

    public void setUiTempId(Long uiTempId) {
        this.uiTempId = uiTempId;
    }

    public Long getObjectSpecId() {
        return objectSpecId;
    }

    public void setObjectSpecId(Long objectSpecId) {
        this.objectSpecId = objectSpecId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getPceItemType() {
        return pceItemType;
    }

    public void setPceItemType(String pceItemType) {
        this.pceItemType = pceItemType == null ? null : pceItemType.trim();
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

    public String getUiTempDesc() {
        return uiTempDesc;
    }

    public void setUiTempDesc(String uiTempDesc) {
        this.uiTempDesc = uiTempDesc == null ? null : uiTempDesc.trim();
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    public Long getReuseUiTempId() {
        return reuseUiTempId;
    }

    public void setReuseUiTempId(Long reuseUiTempId) {
        this.reuseUiTempId = reuseUiTempId;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }
}