package com.junyi;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @time: 2021/6/21 13:55
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAll")
    public List<Employee> test() {
        List<Employee> result = employeeMapper.selectList(null);
        return result;
    }


    @GetMapping("getAll2")
    public List<Employee> test2() {
        return employeeService.list();
    }

    @GetMapping("getAll3")
    public List<Employee> test3() {
        return employeeService.selectAllByLastName("tom");
    }

    @GetMapping("save")
    public Employee save() {
        Employee employee = new Employee();
        employee.setLastName("xiaobai");
        employee.setEmail("xiaobai@qq.com");
        employee.setAge(18);
        employeeService.save(employee);
        return employee;
    }

    @GetMapping("update")
    public Employee update() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setEmail("123@qq.com");
        employee.setAge(99);
        employeeService.updateById(employee);
        return employee;
    }

    @GetMapping("delete")
    public String delete() {
        employeeService.removeById(1L);
        return "OK";
    }

    @GetMapping("page")
    public Page<Employee> page() {
        Page<Employee> page = new Page<>(1, 2);
        employeeService.page(page, null);
        List<Employee> employeeList = page.getRecords();
        employeeList.forEach(System.out::println);
        System.out.println("获取总条数:" + page.getTotal());
        System.out.println("获取当前页码:" + page.getCurrent());
        System.out.println("获取总页码:" + page.getPages());
        System.out.println("获取每页显示的数据条数:" + page.getSize());
        System.out.println("是否有上一页:" + page.hasPrevious());
        System.out.println("是否有下一页:" + page.hasNext());
        return page;
    }


    @GetMapping("testVersion")
    public void testVersion() {
        Employee employee = employeeService.getById(2L);
        Employee employee2 = employeeService.getById(2L);

        employee.setPayType(2);
        boolean updated = employeeService.updateById(employee);
        if (updated) {
            log.info("【user 1 update success】");
        }

        updated = employeeService.updateById(employee2);
        if (updated) {
            log.info("【user 2 update success】");
        } else {
            log.info("【user 2 update fail, the main reason may be the data is out of version】");
        }
    }


    @GetMapping("queryWrapper")
    public List<Employee> queryWrapper() {
        // 查询名字中包含'j'，年龄大于20岁，邮箱不为空的员工信息
        QueryWrapper<Employee> wrapper = new QueryWrapper<Employee>()
            .likeLeft("last_name", "m")
            .gt("age", 20)
            .isNotNull("email");
        List<Employee> list = employeeMapper.selectList(wrapper);
        list.forEach(System.out::println);
        return list;
    }

    // 优先使用
    @GetMapping("queryWrapperLambda")
    public List<Employee> queryWrapperLambda() {
        // 查询名字中包含'j'，年龄大于20岁，邮箱不为空的员工信息
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<Employee>()
            .like(Employee::getLastName,"m")
            .gt(Employee::getAge,20)
            .isNotNull(Employee::getEmail);
        List<Employee> list = employeeMapper.selectList(wrapper);
        list.forEach(System.out::println);
        return list;
    }

    @GetMapping("updateWrapperLambda")
    public String updateWrapperLambda() {
        LambdaUpdateWrapper<Employee> wrapper = new LambdaUpdateWrapper<Employee>()
            .set(Employee::getAge, 50)
            .set(Employee::getEmail, "321@163.com")
            .like(Employee::getLastName, "m")
            .gt(Employee::getAge, 20);
        employeeMapper.update(null, wrapper);
        return "OK";
    }
}
