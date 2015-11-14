package com.holmesycl.product.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaObjectSpec;

public interface MetaObjectSpecService {

	public void save(MetaObjectSpec record);

	public PageInfo<MetaObjectSpec> page(Page<MetaObjectSpec> page);

}
