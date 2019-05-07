package com.xxm.service.impl;

import com.xxm.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName BaseService
 * Deseription service基础公共代码
 * Autor wangpengxiang
 * Date 2019/5/7 21:21
 */
public class BaseService {

    @Autowired
    TestMapper testMapper;//test表操作Mapper
}
