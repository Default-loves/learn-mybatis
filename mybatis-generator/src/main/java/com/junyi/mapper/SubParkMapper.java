package com.junyi.mapper;

import com.junyi.entity.SubPark;
import com.junyi.entity.SubParkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubParkMapper {
    int countByExample(SubParkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubPark record);

    int insertSelective(SubPark record);

    List<SubPark> selectByExample(SubParkExample example);

    SubPark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubPark record, @Param("example") SubParkExample example);

    int updateByExample(@Param("record") SubPark record, @Param("example") SubParkExample example);

    int updateByPrimaryKeySelective(SubPark record);

    int updateByPrimaryKey(SubPark record);
}