package com.example.logback.controller;

import com.example.logback.pojo.User;
import com.example.logback.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO UserController类
 *
 * @author liuzebiao
 * @Date 2020-4-10 13:43
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        User user = userService.getUserById(id);
        return user;
    }

}
