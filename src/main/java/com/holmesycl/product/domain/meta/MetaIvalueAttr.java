package com.holmesycl.product.domain.meta;

public class MetaIvalueAttr {
    private Long mappingAttrId;

    private Long valueId;

    private Integer projectCode;

    private String attrName;

    private String attrCode;

    private String state;

    public Long getMappingAttrId() {
        return mappingAttrId;
    }

    public void setMappingAttrId(Long mappingAttrId) {
        this.mappingAttrId = mappingAttrId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Integer getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(Integer projectCode) {
        this.projectCode = projectCode;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getAttrCode() {
        return attrCode;
    }

    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode == null ? null : attrCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}