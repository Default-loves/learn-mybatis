package com.junyi.mapper;

import com.junyi.Goods;
import com.junyi.Query;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @time: 2021/3/18 9:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface GoodsMapper {

    // 接口方法中的参数只要包含 pageSize 和 pageNum，那么会自动进行分页，查询的sql语句中会自动进行limit
    // 因此，这个方法和下面的方法都是可行的
    List<Goods> get(Query query);

//    List<Goods> get(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

}
