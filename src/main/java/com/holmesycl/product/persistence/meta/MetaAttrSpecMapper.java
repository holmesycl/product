package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.MetaAttrSpec;
import com.holmesycl.product.domain.meta.MetaAttrSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaAttrSpecMapper {
    int countByExample(MetaAttrSpecExample example);

    int deleteByExample(MetaAttrSpecExample example);

    int deleteByPrimaryKey(Long attrId);

    int insert(MetaAttrSpec record);

    int insertSelective(MetaAttrSpec record);

    List<MetaAttrSpec> selectByExample(MetaAttrSpecExample example);

    MetaAttrSpec selectByPrimaryKey(Long attrId);

    int updateByExampleSelective(@Param("record") MetaAttrSpec record, @Param("example") MetaAttrSpecExample example);

    int updateByExample(@Param("record") MetaAttrSpec record, @Param("example") MetaAttrSpecExample example);

    int updateByPrimaryKeySelective(MetaAttrSpec record);

    int updateByPrimaryKey(MetaAttrSpec record);
}