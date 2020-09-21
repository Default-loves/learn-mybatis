package com.junyi.param.dao;

import com.junyi.param.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
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

    Integer batchInsertList(ArrayList<Book> books);


    Integer batchInsertArray(Book[] books);

    List<Book> selectByMap(@Param("book") HashMap<String, String> map);

    List<Book> findPOJOList(Book book);

    List<Book> findPOJOArray(Book book);
}
