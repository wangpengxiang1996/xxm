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
public class MybatisServiceImpl extends BaseService implements IMabatisService {

    /***
     * Description 查找Test表中的全部数据
     * Date 2019/5/7 21:20
     * Author wangpengxiang
     * Param void
     * return java.util.List<com.xxm.entity.po.Test>
     **/
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
