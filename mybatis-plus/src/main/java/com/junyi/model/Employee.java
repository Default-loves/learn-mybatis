package com.junyi.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @time: 2021/6/21 13:53
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Data
@TableName("tbl_employee")
public class Employee {

//    @TableId(type = IdType.AUTO)    // 主键策略默认是分布式ID，使用SnowFlake雪花算法
    private Long id;
    private String lastName;
    private String email;
    private Integer age;
    @TableField(value = "type")     // DB 字段 type 映射为 payType
    private Integer payType;

    @TableField(fill = FieldFill.INSERT)    // 插入的时候自动填充
    private LocalDateTime gmtCreate;        // 创建时间
    @TableField(fill = FieldFill.INSERT_UPDATE)     // 插入和更新的时候自动填充
    private LocalDateTime gmtModified;      // 修改时间


    @TableLogic                 // 逻辑删除，即删除操作是通过修改该值来实现
    @TableField("is_deleted")
    private Boolean deleted;    // 0 未删除， 1 删除


    @Version    // 版本号，对于读多写少的配合乐观锁插件使用
    private Integer version;
}
