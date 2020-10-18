package com.junyi.one2many.controller;

import com.junyi.one2many.dao.ArticleDao;
import com.junyi.one2many.entity.Article;
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
public class ArticleController {
    @Autowired
    public ArticleDao articleDao;

    @GetMapping("article")
    public List<Article> article() {
        List<Article> articles = articleDao.findAll();
        log.info(articles.toString());
        return articles;
    }


    @GetMapping("article/{article_id}")
    public List<Article> article(@PathVariable("article_id") Integer id) {
        List<Article> articles = articleDao.findById(id);
        log.info(articles.toString());
        return articles;
    }
}
