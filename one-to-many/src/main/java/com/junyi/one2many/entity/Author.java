package com.junyi.one2many.entity;

import java.util.List;

/**
 * @time: 2020/8/26 11:39
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Author {
    private Integer id;
    private String name;
    private List<Article> articles;


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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", articles=" + articles +
                '}';
    }
}
