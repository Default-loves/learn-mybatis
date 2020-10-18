package com.junyi.one2one.entity;

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
    private Author author;  // 一本书对应一个作者


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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDateTime=" + createDateTime +
                ", author=" + author +
                '}';
    }
}
