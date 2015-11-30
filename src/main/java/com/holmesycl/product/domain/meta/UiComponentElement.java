package com.holmesycl.product.domain.meta;

public class UiComponentElement {
    private Long attrCompId;

    private Long attrId;

    private Long uiComponentId;

    private String isReadOnly;

    private String isNotNull;

    private String defaultValue;

    private String isHide;

    private Short beginRow;

    private Short beginCol;

    private Short rowNum;

    private Short colNum;

    private String parameter1;

    private String parameter2;

    public Long getAttrCompId() {
        return attrCompId;
    }

    public void setAttrCompId(Long attrCompId) {
        this.attrCompId = attrCompId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getUiComponentId() {
        return uiComponentId;
    }

    public void setUiComponentId(Long uiComponentId) {
        this.uiComponentId = uiComponentId;
    }

    public String getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(String isReadOnly) {
        this.isReadOnly = isReadOnly == null ? null : isReadOnly.trim();
    }

    public String getIsNotNull() {
        return isNotNull;
    }

    public void setIsNotNull(String isNotNull) {
        this.isNotNull = isNotNull == null ? null : isNotNull.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public String getIsHide() {
        return isHide;
    }

    public void setIsHide(String isHide) {
        this.isHide = isHide == null ? null : isHide.trim();
    }

    public Short getBeginRow() {
        return beginRow;
    }

    public void setBeginRow(Short beginRow) {
        this.beginRow = beginRow;
    }

    public Short getBeginCol() {
        return beginCol;
    }

    public void setBeginCol(Short beginCol) {
        this.beginCol = beginCol;
    }

    public Short getRowNum() {
        return rowNum;
    }

    public void setRowNum(Short rowNum) {
        this.rowNum = rowNum;
    }

    public Short getColNum() {
        return colNum;
    }

    public void setColNum(Short colNum) {
        this.colNum = colNum;
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
}