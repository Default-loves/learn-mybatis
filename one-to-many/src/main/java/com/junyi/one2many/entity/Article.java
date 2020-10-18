package com.junyi.one2many.entity;

/**
 * @time: 2020/8/26 11:40
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Article {
    private Integer id;
    private String name;
    private Integer authorId;
    private Author author;


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

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                ", author=" + author +
                '}';
    }
}
