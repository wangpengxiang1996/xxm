package com.xxm.service;

import com.xxm.entity.po.Test;

import java.util.List;
/***
 * Description 整合mybatis测试service
 * Date 2019/5/7 21:20
 * Author wangpengxiang
 **/
public interface IMabatisService {

    /***
     * Description 查找Test表中的全部数据
     * Date 2019/5/7 21:20
     * Author wangpengxiang
     * Param void
     * return java.util.List<com.xxm.entity.po.Test>
     **/
    List<Test> findAll();
}
