package com.junyi.mapper;

import com.junyi.entity.ParkMonthSetTemplate;
import com.junyi.entity.ParkMonthSetTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkMonthSetTemplateMapper {
    int countByExample(ParkMonthSetTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkMonthSetTemplate record);

    int insertSelective(ParkMonthSetTemplate record);

    List<ParkMonthSetTemplate> selectByExample(ParkMonthSetTemplateExample example);

    ParkMonthSetTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkMonthSetTemplate record, @Param("example") ParkMonthSetTemplateExample example);

    int updateByExample(@Param("record") ParkMonthSetTemplate record, @Param("example") ParkMonthSetTemplateExample example);

    int updateByPrimaryKeySelective(ParkMonthSetTemplate record);

    int updateByPrimaryKey(ParkMonthSetTemplate record);
}