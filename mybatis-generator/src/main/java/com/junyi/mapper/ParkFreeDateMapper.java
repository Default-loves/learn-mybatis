package com.junyi.mapper;

import com.junyi.entity.ParkFreeDate;

public interface ParkFreeDateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ParkFreeDate record);

    int insertSelective(ParkFreeDate record);

    ParkFreeDate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ParkFreeDate record);

    int updateByPrimaryKey(ParkFreeDate record);
}