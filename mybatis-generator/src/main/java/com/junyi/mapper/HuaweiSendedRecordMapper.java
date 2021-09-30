package com.junyi.mapper;

import com.junyi.entity.HuaweiSendedRecord;
import java.util.List;

public interface HuaweiSendedRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HuaweiSendedRecord record);

    HuaweiSendedRecord selectByPrimaryKey(Integer id);

    List<HuaweiSendedRecord> selectAll();

    int updateByPrimaryKey(HuaweiSendedRecord record);
}