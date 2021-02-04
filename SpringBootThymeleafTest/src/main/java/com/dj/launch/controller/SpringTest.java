package com.dj.launch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpringTest {
    @RequestMapping("test")
    public  String freemarkerTest(Model model){
        System.out.println("ceshi");
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("张三",19,"篮球"));
        peopleList.add(new People("李四",22,"足球"));
        peopleList.add(new People("王五",25,"乒乓球"));
        model.addAttribute("peopleList",peopleList);
        return "thymeleaftemp";
    }
}
