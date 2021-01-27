package it.com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("hello")
@Controller
@ResponseBody
public class FirstSpring {
    @RequestMapping("show")
    public  String show(){
        return "test  springboot1";
    }
}
