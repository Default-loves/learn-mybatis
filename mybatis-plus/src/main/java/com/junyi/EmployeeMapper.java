package com.junyi;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @time: 2021/6/21 13:54
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


    List<Employee> selectAllByLastName(String lastName);
}
