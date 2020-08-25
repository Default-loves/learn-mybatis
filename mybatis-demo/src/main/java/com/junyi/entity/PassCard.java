package com.junyi.entity;

/**
 * @time: 2020/8/25 15:55
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */

public class PassCard {
    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PassCard{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
