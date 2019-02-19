package com.xxm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Description: 测试项目是否搭建成功
 * Author: wangpengxiang
 * data： 2019/2/19 16:34
 * Version: 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}
