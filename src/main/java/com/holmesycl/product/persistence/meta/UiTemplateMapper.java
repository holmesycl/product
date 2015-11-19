package com.holmesycl.product.persistence.meta;

import com.holmesycl.product.domain.meta.UiTemplate;
import com.holmesycl.product.domain.meta.UiTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiTemplateMapper {
    int countByExample(UiTemplateExample example);

    int deleteByExample(UiTemplateExample example);

    int deleteByPrimaryKey(Long uiTempId);

    int insert(UiTemplate record);

    int insertSelective(UiTemplate record);

    List<UiTemplate> selectByExample(UiTemplateExample example);

    UiTemplate selectByPrimaryKey(Long uiTempId);

    int updateByExampleSelective(@Param("record") UiTemplate record, @Param("example") UiTemplateExample example);

    int updateByExample(@Param("record") UiTemplate record, @Param("example") UiTemplateExample example);

    int updateByPrimaryKeySelective(UiTemplate record);

    int updateByPrimaryKey(UiTemplate record);
}