package com.dj.lunch.controller;

import com.dj.lunch.mapper.UserMapper;
import com.dj.lunch.model.User;

import com.dj.lunch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MybitasPlusUse {

    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET,value = "getone/{id}")
    @ResponseBody
    public User getUserByID(@PathVariable("id")int id){
       return  userService.getonebyid(id);
    }

    @RequestMapping("/test")
    public String  testJsp(Model model){
        List<User> userList = userService.getAll();
        model.addAttribute("userList",userList);
        System.out.println(userList);
         return "jsptemp";
    }
    @RequestMapping("/fremtest")
    public  String testFremarkertemp(Model model){
        List<User> userList = userService.getAll();
        model.addAttribute("userList",userList);
        System.out.println(userList);
        return "fremarkertemp";
    }
}
