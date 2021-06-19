package com.junyi.mapper;

import com.junyi.entity.ParkVisit;
import java.util.List;

public interface ParkVisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ParkVisit record);

    ParkVisit selectByPrimaryKey(Integer id);

    List<ParkVisit> selectAll();

    int updateByPrimaryKey(ParkVisit record);
}