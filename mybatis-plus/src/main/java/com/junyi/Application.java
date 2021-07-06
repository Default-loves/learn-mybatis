package com.junyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MyBatis Plus 的使用
 * 需要注意的是：需要将.pom中 mybatis-spring-boot-starter 的依赖去掉，使用 mybatis-plus-boot-starter
 *
 * @time: 2021/6/21 12:00
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
