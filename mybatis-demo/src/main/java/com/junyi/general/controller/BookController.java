package com.junyi.general.controller;

import com.junyi.general.dao.BookDao;
import com.junyi.general.entity.Book;
import com.junyi.general.entity.Book1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping()
    public List<Book> book() {
        List<Book> books = bookDao.findAll();
        log.info(books.toString());
        return books;
    }


    @GetMapping("/{book_id}")
    public Book book(@PathVariable("book_id") Integer id) {
        Book book = bookDao.findById(id);
        log.info(book.toString());
        return book;
    }

    @PostMapping("/insert")
    public Book insertOne(@RequestBody Book book) {
        book.setCreateDateTime(new Date());
        Integer res = bookDao.insert(book);
        if (res == 1) {
            log.info("Insert succeed!");
        }
        return book;
    }

    @PostMapping("/insertBySelectKey")
    public Book insertBySelectKey(@RequestBody Book book) {
        book.setCreateDateTime(new Date());
        Integer res = bookDao.insertBySelectKey(book);
        if (res == 1) {
            log.info("Insert succeed!");
        }
        return book;
    }

    @PostMapping("/batchupdate")
    public Book1 batchUpdate(@RequestBody Book1 book) {
        System.out.println(book.toString());
        Integer res = bookDao.batchUpdate(book);
        if (res == 1) {
            log.info("Insert succeed!");
        }
        return book;
    }
}
