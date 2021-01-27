package com.dj.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
    @RequestMapping("hello")
    public  String test(){
        System.out.println("断点测试1");
        System.out.println("断点测试2");
        System.out.println("断点测试3");
        System.out.println("断点测试4");
        return "hello";
    }
}
