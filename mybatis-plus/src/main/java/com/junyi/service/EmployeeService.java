package com.junyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junyi.model.Employee;

import java.util.List;

/**
 * @time: 2021/6/21 14:39
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> selectAllByLastName(String lastName);

}
