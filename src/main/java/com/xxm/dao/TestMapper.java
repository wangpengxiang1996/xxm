package com.xxm.dao;


import com.xxm.entity.po.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * Description mybatis 测试dao
 * Date 2019/5/6 22:59
 * Author wangpengxiang
 **/
@Repository
public interface TestMapper {

    List<Test> findAll();
}
