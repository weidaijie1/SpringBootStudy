package com.dj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.dj.model")
public class MySpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootStart.class,args);
    }
}
