package com.dj.launch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringTest {
    @RequestMapping("test")
    public  String freemarkerTest(){
        System.out.println("ceshi");
        return "freemarker";
    }
}
