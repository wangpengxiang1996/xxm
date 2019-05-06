package com.xxm.service.impl;

import com.xxm.dao.TestMapper;
import com.xxm.entity.po.Test;
import com.xxm.service.IMabatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName MybatisServiceImpl
 * Deseription mybatis 测试
 * Autor wangpengxiang
 * Date 2019/5/6 23:23
 */
@Service
public class MybatisServiceImpl implements IMabatisService {

    @Autowired
    TestMapper testMapper;

    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
