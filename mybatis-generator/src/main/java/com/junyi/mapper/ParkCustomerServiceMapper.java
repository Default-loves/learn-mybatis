package com.junyi.mapper;

import com.junyi.entity.ParkCustomerService;

public interface ParkCustomerServiceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ParkCustomerService record);

    int insertSelective(ParkCustomerService record);

    ParkCustomerService selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ParkCustomerService record);

    int updateByPrimaryKey(ParkCustomerService record);
}