package com.xxm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Description swagger2 配置类
 * Date 22:31 2019/5/5
 * Author wangpengxiang
 **/
@Configuration //用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean。
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xxm.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("欢迎来到我的小项目")
                .description("github https://github.com/wangpengxiang1996/xxm.git")
                .termsOfServiceUrl("https://github.com/wangpengxiang1996/xxm.git")
                .version("1.0")
                .build();
    }
}