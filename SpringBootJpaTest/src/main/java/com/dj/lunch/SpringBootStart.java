package com.dj.lunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"com.*"})
public class SpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class,args);
    }
}
