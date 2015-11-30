package com.holmesycl.product.domain.meta;

import java.io.Serializable;

public class MetaIvalueAttrRel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 572697260088315398L;

	private Long metaIvalueAttrRelId;

    private Long attrId;

    private Long mappingAttrId;

    public Long getMetaIvalueAttrRelId() {
        return metaIvalueAttrRelId;
    }

    public void setMetaIvalueAttrRelId(Long metaIvalueAttrRelId) {
        this.metaIvalueAttrRelId = metaIvalueAttrRelId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getMappingAttrId() {
        return mappingAttrId;
    }

    public void setMappingAttrId(Long mappingAttrId) {
        this.mappingAttrId = mappingAttrId;
    }
}