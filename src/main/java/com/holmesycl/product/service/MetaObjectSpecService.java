package com.holmesycl.product.service;

import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.util.PageParam;

public interface MetaObjectSpecService {

	public void save(MetaObjectSpec record);

	public PageInfo<MetaObjectSpec> page(PageParam pageParam, String query);

}
