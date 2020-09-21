package com.junyi.param;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @time: 2020/8/25 15:42
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 * 1、MyBatis 输入参数为 ArrayList、数组、Map的处理
 * 2、MyBatis 输入参数为 POJO，里面有 ArrayList、数组、Map的处理
 */
@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
