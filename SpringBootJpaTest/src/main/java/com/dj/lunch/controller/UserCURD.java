package com.dj.lunch.controller;

import com.dj.lunch.dao.UserRepository;
import com.dj.lunch.model.UserDO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCURD {
    private UserRepository   userrepository;
    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public UserDO getUserById(@PathVariable("id") Integer id){
        UserDo u = userrepository.findById(id);
        return u;
    }
}
