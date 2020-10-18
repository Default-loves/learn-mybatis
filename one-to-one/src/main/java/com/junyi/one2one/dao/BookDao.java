package com.junyi.one2one.dao;

import com.junyi.one2one.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @time: 2020/8/25 16:22
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface BookDao {


    Book findById(Integer id);

    List<Book> findBookAuthor();
}
