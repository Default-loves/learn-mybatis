package com.junyi.one2many.controller;

import com.junyi.one2many.dao.AuthoreDao;
import com.junyi.one2many.entity.Author;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @time: 2020/8/26 14:53
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@Slf4j
public class AuthorController {
    @Autowired
    public AuthoreDao authoreDao;

    @GetMapping("/author")
    public List<Author> author() {
        List<Author> authors = authoreDao.findAll();
        log.info(authors.toString());
        return authors;
    }
    @GetMapping("/authorAll")
    public List<Author> all() {
        List<Author> authors = authoreDao.findAuthorAndArticle();
        log.info(authors.toString());
        return authors;
    }


    @GetMapping("/author/{author_id}")
    public Author author(@PathVariable("author_id") Integer id) {
        Author author = authoreDao.findById(id);
        log.info(author.toString());
        return author;
    }
}
