package com.junyi.param.controller;

import com.junyi.param.dao.BookDao;
import com.junyi.param.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    /**
     * 参数类型为列表 ArrayList
     * @return
     */
    @PostMapping("/insertList")
    public Integer insertList() {
        Book book1 = Book.builder().createDateTime(new Date()).name("1451").build();
        Book book2 = Book.builder().createDateTime(new Date()).name("1452").build();
        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        return bookDao.batchInsertList(list);
    }

    /**
     * 参数类型为数组 Array
     * @return
     */
    @PostMapping("/insertArray")
    public Integer insertArray() {
        Book book1 = Book.builder().createDateTime(new Date()).name("1451").build();
        Book book2 = Book.builder().createDateTime(new Date()).name("1452").build();
        Book[] list = new Book[2];
        list[0] = (book1);
        list[1] = (book2);
        return bookDao.batchInsertArray(list);
    }

    /**
     * 参数类型为字典 Map
     * @return
     */
    @PostMapping("/find")
    public List<Book> updateMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", String.valueOf(18));
        map.put("name", String.valueOf(1451));
        return bookDao.selectByMap(map);
    }

    /**
     * 参数类型为 POJO，里面有 List
     * @return
     */
    @PostMapping("/find-list")
    public List<Book> findList() {
        Book book = Book.builder().name("1451").build();
        List<Integer> authorId = Arrays.asList(1, 2);
        book.setAuthorIdList(authorId);
        return bookDao.findPOJOList(book);
    }

    /**
     * 参数类型为 POJO，里面有 数组
     * @return
     */
    @PostMapping("/find-Array")
    public List<Book> findArray() {
        Book book = Book.builder().name("1451").build();
        Integer[] authorId = new Integer[]{1, 2};
        book.setAuthorIdArray(authorId);
        return bookDao.findPOJOArray(book);
    }

}
