package com.example.redisconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.redisconfig.mapper"})
public class RedisconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisconfigApplication.class, args);
    }

}
