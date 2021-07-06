package com.junyi;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @time: 2021/6/21 14:39
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>  implements EmployeeService{

    @Override
    public List<Employee> selectAllByLastName(String lastName) {
        return baseMapper.selectAllByLastName(lastName);
    }
}
