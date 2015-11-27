package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.MetaIvalue;
import com.holmesycl.product.domain.meta.MetaIvalueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MetaIvalueMapper {
    int countByExample(MetaIvalueExample example);

    int deleteByExample(MetaIvalueExample example);

    int deleteByPrimaryKey(Long valueId);

    int insert(MetaIvalue record);

    int insertSelective(MetaIvalue record);

    List<MetaIvalue> selectByExample(MetaIvalueExample example);

    MetaIvalue selectByPrimaryKey(Long valueId);

    int updateByExampleSelective(@Param("record") MetaIvalue record, @Param("example") MetaIvalueExample example);

    int updateByExample(@Param("record") MetaIvalue record, @Param("example") MetaIvalueExample example);

    int updateByPrimaryKeySelective(MetaIvalue record);

    int updateByPrimaryKey(MetaIvalue record);
}