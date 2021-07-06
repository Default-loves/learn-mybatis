package com.junyi.mapper;

import com.junyi.entity.UploadEvent;
import java.util.List;

public interface UploadEventMapper {
    int deleteByPrimaryKey(String carNo);

    int insert(UploadEvent record);

    UploadEvent selectByPrimaryKey(String carNo);

    List<UploadEvent> selectAll();

    int updateByPrimaryKey(UploadEvent record);
}