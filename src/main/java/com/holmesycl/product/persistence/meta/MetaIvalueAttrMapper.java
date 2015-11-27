package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.MetaIvalueAttr;
import com.holmesycl.product.domain.meta.MetaIvalueAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaIvalueAttrMapper {
    int countByExample(MetaIvalueAttrExample example);

    int deleteByExample(MetaIvalueAttrExample example);

    int deleteByPrimaryKey(Long mappingAttrId);

    int insert(MetaIvalueAttr record);

    int insertSelective(MetaIvalueAttr record);

    List<MetaIvalueAttr> selectByExample(MetaIvalueAttrExample example);

    MetaIvalueAttr selectByPrimaryKey(Long mappingAttrId);

    int updateByExampleSelective(@Param("record") MetaIvalueAttr record, @Param("example") MetaIvalueAttrExample example);

    int updateByExample(@Param("record") MetaIvalueAttr record, @Param("example") MetaIvalueAttrExample example);

    int updateByPrimaryKeySelective(MetaIvalueAttr record);

    int updateByPrimaryKey(MetaIvalueAttr record);
}