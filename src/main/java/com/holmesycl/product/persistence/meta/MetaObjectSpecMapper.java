package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.MetaObjectSpec;
import com.holmesycl.product.domain.meta.MetaObjectSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaObjectSpecMapper {
    int countByExample(MetaObjectSpecExample example);

    int deleteByExample(MetaObjectSpecExample example);

    int deleteByPrimaryKey(Long objectSpecId);

    int insert(MetaObjectSpec record);

    int insertSelective(MetaObjectSpec record);

    List<MetaObjectSpec> selectByExample(MetaObjectSpecExample example);

    MetaObjectSpec selectByPrimaryKey(Long objectSpecId);

    int updateByExampleSelective(@Param("record") MetaObjectSpec record, @Param("example") MetaObjectSpecExample example);

    int updateByExample(@Param("record") MetaObjectSpec record, @Param("example") MetaObjectSpecExample example);

    int updateByPrimaryKeySelective(MetaObjectSpec record);

    int updateByPrimaryKey(MetaObjectSpec record);
}