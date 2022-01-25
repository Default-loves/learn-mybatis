package com.junyi.mapper;

import com.junyi.entity.SubParkChannel;
import com.junyi.entity.SubParkChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubParkChannelMapper {
    int countByExample(SubParkChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubParkChannel record);

    int insertSelective(SubParkChannel record);

    List<SubParkChannel> selectByExample(SubParkChannelExample example);

    SubParkChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubParkChannel record, @Param("example") SubParkChannelExample example);

    int updateByExample(@Param("record") SubParkChannel record, @Param("example") SubParkChannelExample example);

    int updateByPrimaryKeySelective(SubParkChannel record);

    int updateByPrimaryKey(SubParkChannel record);
}