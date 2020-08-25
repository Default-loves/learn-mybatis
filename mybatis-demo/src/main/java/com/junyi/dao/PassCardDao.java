package com.junyi.dao;

import com.junyi.entity.PassCard;
import org.apache.ibatis.annotations.Mapper;

/**
 * @time: 2020/8/25 16:22
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface PassCardDao {

    public PassCard findByStudentId(Integer studentId);

}
