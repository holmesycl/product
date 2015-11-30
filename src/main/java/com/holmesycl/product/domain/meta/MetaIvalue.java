package com.holmesycl.product.domain.meta;

import java.io.Serializable;

public class MetaIvalue implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5196844769140894499L;

	private Long valueId;

    private String classPath;

    private String remark;

    private Integer sortBy;

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath == null ? null : classPath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSortBy() {
        return sortBy;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }
}