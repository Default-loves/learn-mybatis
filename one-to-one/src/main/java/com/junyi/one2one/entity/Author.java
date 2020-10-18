package com.junyi.one2one.entity;

/**
 * @time: 2020/8/27 10:19
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Author {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
