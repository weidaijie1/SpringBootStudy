package it.com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("hello")
@Controller
@ResponseBody
public class FirstSpring1 {
    @RequestMapping("show1")
    public  String show(){
        return "test1111  springboot1";
    }
}
