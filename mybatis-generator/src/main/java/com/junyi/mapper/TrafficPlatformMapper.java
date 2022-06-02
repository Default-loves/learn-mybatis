package com.junyi.mapper;

import com.junyi.entity.TrafficPlatform;

public interface TrafficPlatformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrafficPlatform record);

    int insertSelective(TrafficPlatform record);

    TrafficPlatform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrafficPlatform record);

    int updateByPrimaryKey(TrafficPlatform record);
}