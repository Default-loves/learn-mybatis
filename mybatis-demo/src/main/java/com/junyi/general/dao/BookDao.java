package com.junyi.general.dao;

import com.junyi.general.entity.Book;
import com.junyi.general.entity.Book1;
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

    List<Book> findAll();

    Book findById(Integer id);


    Integer insert(Book book);

    Integer insertBySelectKey(Book book);

    Integer batchUpdate(Book1 book1);
}
