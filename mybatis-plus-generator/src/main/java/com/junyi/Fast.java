package com.junyi;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 快速生成
 * @time: 2022/7/12 18:05
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Fast {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://172.16.60.211/ykt", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("jy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("G:\\GithubMy\\my\\learn-mybatis\\mybatis-plus-generator\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.junyi") // 设置父包名
                            .moduleName("test") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "G:\\GithubMy\\my\\learn-mybatis\\mybatis-plus-generator\\src\\main\\java")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("park_customer_service") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
