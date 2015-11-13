package com.holmesycl.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.persistence.meta.MetaObjectSpecMapper;
import com.holmesycl.product.service.MetaObjectSpecService;

@Service("metaObjectSpecService")
@Transactional
public class MetaObjectSpecServiceImpl implements MetaObjectSpecService {

	@Autowired
	private MetaObjectSpecMapper metaObjectSpecMapper;

	public void save(MetaObjectSpec record) {
		metaObjectSpecMapper.insert(record);
	}

}
