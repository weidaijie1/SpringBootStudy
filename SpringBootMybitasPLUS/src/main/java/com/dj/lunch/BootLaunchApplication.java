package com.dj.lunch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dj.lunch.mapper")
public class BootLaunchApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootLaunchApplication.class, args);
    }
}