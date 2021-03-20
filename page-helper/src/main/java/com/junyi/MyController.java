package com.junyi;

import com.github.pagehelper.PageInfo;
import com.junyi.mapper.GoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @time: 2021/3/18 9:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@RequestMapping("goods")
@Slf4j
public class MyController {

    @Autowired
    GoodsMapper goodsMapper;

    @GetMapping("get")
    public PageInfo<Goods> get(@RequestBody Query query) {
        List<Goods> result = goodsMapper.get(query);
//        List<Goods> result = goodsMapper.get(query.getPageNum(), query.getPageSize());
        log.info("count: {}", result.size());
        PageInfo<Goods> pageinfo = new PageInfo<>(result);
        return pageinfo;
    }
}
