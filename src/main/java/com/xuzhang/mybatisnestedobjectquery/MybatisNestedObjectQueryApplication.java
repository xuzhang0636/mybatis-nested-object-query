package com.xuzhang.mybatisnestedobjectquery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuzhang.mybatisnestedobjectquery.mapper")
public class MybatisNestedObjectQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisNestedObjectQueryApplication.class, args);
    }

}
