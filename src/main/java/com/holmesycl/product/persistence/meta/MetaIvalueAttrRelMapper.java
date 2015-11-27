package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.MetaIvalueAttrRel;
import com.holmesycl.product.domain.meta.MetaIvalueAttrRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaIvalueAttrRelMapper {
    int countByExample(MetaIvalueAttrRelExample example);

    int deleteByExample(MetaIvalueAttrRelExample example);

    int deleteByPrimaryKey(Long metaIvalueAttrRelId);

    int insert(MetaIvalueAttrRel record);

    int insertSelective(MetaIvalueAttrRel record);

    List<MetaIvalueAttrRel> selectByExample(MetaIvalueAttrRelExample example);

    MetaIvalueAttrRel selectByPrimaryKey(Long metaIvalueAttrRelId);

    int updateByExampleSelective(@Param("record") MetaIvalueAttrRel record, @Param("example") MetaIvalueAttrRelExample example);

    int updateByExample(@Param("record") MetaIvalueAttrRel record, @Param("example") MetaIvalueAttrRelExample example);

    int updateByPrimaryKeySelective(MetaIvalueAttrRel record);

    int updateByPrimaryKey(MetaIvalueAttrRel record);
}