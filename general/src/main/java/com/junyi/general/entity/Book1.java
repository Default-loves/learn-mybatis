package com.junyi.general.entity;

import java.util.Map;

/**
 * @time: 2020/9/3 15:12
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Book1 {
    private Integer id;
    private Map<String, String> mapMy;
    private Integer authorId;


    public Map<String, String> getMapMy() {
        return mapMy;
    }

    public void setMapMy(Map<String, String> mapMy) {
        this.mapMy = mapMy;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", mapMy=" + mapMy +
                ", authorId=" + authorId +
                '}';
    }
}
