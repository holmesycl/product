package com.holmesycl.product.domain.meta;

public class MetaObjectSpec {
    private Long objectSpecId;

    private String objectSpecCode;

    private String objectSpecName;

    private Long parentObjectSpecId;

    private String javaClass;

    private String remark;

    public Long getObjectSpecId() {
        return objectSpecId;
    }

    public void setObjectSpecId(Long objectSpecId) {
        this.objectSpecId = objectSpecId;
    }

    public String getObjectSpecCode() {
        return objectSpecCode;
    }

    public void setObjectSpecCode(String objectSpecCode) {
        this.objectSpecCode = objectSpecCode == null ? null : objectSpecCode.trim();
    }

    public String getObjectSpecName() {
        return objectSpecName;
    }

    public void setObjectSpecName(String objectSpecName) {
        this.objectSpecName = objectSpecName == null ? null : objectSpecName.trim();
    }

    public Long getParentObjectSpecId() {
        return parentObjectSpecId;
    }

    public void setParentObjectSpecId(Long parentObjectSpecId) {
        this.parentObjectSpecId = parentObjectSpecId;
    }

    public String getJavaClass() {
        return javaClass;
    }

    public void setJavaClass(String javaClass) {
        this.javaClass = javaClass == null ? null : javaClass.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}