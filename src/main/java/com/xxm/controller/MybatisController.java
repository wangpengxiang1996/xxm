package com.xxm.controller;

import com.xxm.entity.po.Test;
import com.xxm.service.IMabatisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName MybatisController
 * Deseription mybatis测试controller
 * Autor wangpengxiang
 * Date 2019/5/6 23:05
 */
@Api("集成mybatis测试controller，作者：wangpengxiang")
@RequestMapping("mybatis")
@RestController
public class MybatisController extends BaseController{


    @ApiOperation(value="查找test表所有数据，作者：wangpengxiang", notes="测试swagger是否集成成功")
    @RequestMapping(value="/findTestAll",method = RequestMethod.POST)
    public List<Test> findTestAll(){
        return mybatisServiceImpl.findAll();
    }

}
