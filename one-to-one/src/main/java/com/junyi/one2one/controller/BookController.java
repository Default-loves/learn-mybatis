package com.junyi.one2one.controller;

import com.junyi.one2one.dao.BookDao;
import com.junyi.one2one.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @time: 2020/8/26 14:53
 * @version: 1.0
 * @book: junyi Xu
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {
    @Autowired
    public BookDao bookDao;


    @GetMapping("/{book_id}")
    public Book book(@PathVariable("book_id") Integer id) {
        Book book = bookDao.findById(id);
        log.info(book.toString());
        return book;
    }

    @GetMapping("")
    public List<Book> findBookAuthor() {
        List<Book> book = bookDao.findBookAuthor();
        log.info(book.toString());
        return book;
    }
}
