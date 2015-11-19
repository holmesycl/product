package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.UiComponent;
import com.holmesycl.product.domain.meta.UiComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiComponentMapper {
    int countByExample(UiComponentExample example);

    int deleteByExample(UiComponentExample example);

    int deleteByPrimaryKey(Long uiComponentId);

    int insert(UiComponent record);

    int insertSelective(UiComponent record);

    List<UiComponent> selectByExample(UiComponentExample example);

    UiComponent selectByPrimaryKey(Long uiComponentId);

    int updateByExampleSelective(@Param("record") UiComponent record, @Param("example") UiComponentExample example);

    int updateByExample(@Param("record") UiComponent record, @Param("example") UiComponentExample example);

    int updateByPrimaryKeySelective(UiComponent record);

    int updateByPrimaryKey(UiComponent record);
}