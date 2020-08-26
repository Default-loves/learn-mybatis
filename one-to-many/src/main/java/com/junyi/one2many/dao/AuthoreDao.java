package com.junyi.one2many.dao;

import com.junyi.one2many.entity.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @time: 2020/8/25 16:22
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface AuthoreDao {

    List<Author> findAll();

    Author findById(Integer id);

    List<Author> findAuthorAndArticle();

}
