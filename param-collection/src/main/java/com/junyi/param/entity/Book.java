package com.junyi.param.entity;

import lombok.Builder;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @time: 2020/8/26 11:40
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Builder
public class Book {
    private Integer id;
    private String name;
    private Date createDateTime;

    private List<Integer> authorIdList;
    private Integer[] authorIdArray;


    public Book() {
    }

    public Book(Integer id, String name, Date createDateTime, List<Integer> authorIdList, Integer[] authorIdArray) {
        this.id = id;
        this.name = name;
        this.createDateTime = createDateTime;
        this.authorIdList = authorIdList;
        this.authorIdArray = authorIdArray;
    }

    public List<Integer> getAuthorIdList() {
        return authorIdList;
    }

    public void setAuthorIdList(List<Integer> authorIdList) {
        this.authorIdList = authorIdList;
    }

    public Integer[] getAuthorIdArray() {
        return authorIdArray;
    }

    public void setAuthorIdArray(Integer[] authorIdArray) {
        this.authorIdArray = authorIdArray;
    }

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
