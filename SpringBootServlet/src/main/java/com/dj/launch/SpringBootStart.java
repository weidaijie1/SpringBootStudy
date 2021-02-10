package com.dj.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class,args);
    }
}
