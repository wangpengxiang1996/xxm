package com.xxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 //开启swagger2
@SpringBootApplication
public class XxmApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxmApplication.class, args);
    }

}
