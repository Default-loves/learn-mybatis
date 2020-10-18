package com.junyi.general.entity;

import java.util.Date;

/**
 * @time: 2020/8/26 11:40
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Book {
    private Integer id;
    private String name;
    private Date createDateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDateTime=" + createDateTime +
                '}';
    }
}
