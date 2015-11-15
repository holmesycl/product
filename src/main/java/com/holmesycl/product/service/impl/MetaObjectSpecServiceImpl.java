package com.holmesycl.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.domain.meta.MetaObjectSpecExample;
import com.holmesycl.product.persistence.meta.MetaObjectSpecMapper;
import com.holmesycl.product.service.MetaObjectSpecService;
import com.holmesycl.product.util.PageParam;

@Service("metaObjectSpecService")
@Transactional
public class MetaObjectSpecServiceImpl implements MetaObjectSpecService {

	@Autowired
	private MetaObjectSpecMapper metaObjectSpecMapper;

	public void save(MetaObjectSpec record) {
		metaObjectSpecMapper.insert(record);
	}

	@Transactional(readOnly = true)
	public PageInfo<MetaObjectSpec> page(PageParam pageParam, String query) {
		PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize());
		MetaObjectSpecExample metaObjectSpecExample = new MetaObjectSpecExample();
		if(!StringUtils.isEmpty(query)){
			metaObjectSpecExample.createCriteria().andObjectSpecNameLike(query);
		}
		List<MetaObjectSpec> objects = metaObjectSpecMapper.selectByExample(metaObjectSpecExample);
		return new PageInfo<MetaObjectSpec>(objects);
	}

}
