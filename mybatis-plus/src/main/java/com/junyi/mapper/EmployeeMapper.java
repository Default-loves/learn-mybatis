package com.junyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junyi.model.Employee;
import org.apache.ibatis.annotations.Mapper;

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
