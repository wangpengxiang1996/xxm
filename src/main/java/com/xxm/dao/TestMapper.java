package com.xxm.dao;


import com.xxm.entity.po.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/***
 * Description mybatis 测试dao
 * Date 2019/5/6 22:59
 * Author wangpengxiang
 **/
@Mapper
public interface TestMapper {

    List<Test> findAll();
}
