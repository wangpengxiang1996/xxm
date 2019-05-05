package com.xxm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: SwaggerController
 * Description: 集成swagger2的测试contoller 访问地址http://127.0.0.1:8080/xxm/swagger-ui.html
 * Author: wangpengxiang
 * data： 2019/05/05 22点37分
 * Version: 1.0
 **/
@Api("集成swagger2的测试contoller")
@RequestMapping("swagger2")
@RestController
public class SwaggerController {

    //@Api：修饰整个类，描述Controller的作用
    //@ApiOperation：描述一个类的一个方法，或者说一个接口
    //@ApiParam：单个参数描述
    //@ApiModel：用对象来接收参数
    //@ApiProperty：用对象接收参数时，描述对象的一个字段
    //@ApiResponse：HTTP响应其中1个描述
    //@ApiResponses：HTTP响应整体描述
    //@ApiIgnore：使用该注解忽略这个API
    //@ApiError ：发生错误返回的信息
    //@ApiImplicitParam：一个请求参数
    //@ApiImplicitParams：多个请求参数
    @ApiOperation(value="Hello World!", notes="测试swagger是否集成成功")
    //@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    // name为参数，value为解释，require为是否必填，dataType为字段类型，paramType为传参方式
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String Hello(){
        return "Hello World!";
    }
}
