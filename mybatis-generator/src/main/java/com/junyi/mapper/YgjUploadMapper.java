package com.junyi.mapper;

import com.junyi.entity.YgjUpload;
import java.util.List;

public interface YgjUploadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YgjUpload record);

    YgjUpload selectByPrimaryKey(Integer id);

    List<YgjUpload> selectAll();

    int updateByPrimaryKey(YgjUpload record);
}