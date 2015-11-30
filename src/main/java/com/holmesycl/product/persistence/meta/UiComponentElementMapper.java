package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.UiComponentElement;
import com.holmesycl.product.domain.meta.UiComponentElementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiComponentElementMapper {
    int countByExample(UiComponentElementExample example);

    int deleteByExample(UiComponentElementExample example);

    int deleteByPrimaryKey(Long attrCompId);

    int insert(UiComponentElement record);

    int insertSelective(UiComponentElement record);

    List<UiComponentElement> selectByExample(UiComponentElementExample example);

    UiComponentElement selectByPrimaryKey(Long attrCompId);

    int updateByExampleSelective(@Param("record") UiComponentElement record, @Param("example") UiComponentElementExample example);

    int updateByExample(@Param("record") UiComponentElement record, @Param("example") UiComponentElementExample example);

    int updateByPrimaryKeySelective(UiComponentElement record);

    int updateByPrimaryKey(UiComponentElement record);
}