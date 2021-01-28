package com.dj.lunch.controller;

import com.dj.lunch.dao.TtUserDao;
import com.dj.lunch.model.TtUser;
import com.dj.lunch.service.TtUserResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDaojdbcTest {

    @Autowired
    private TtUserResService ttUserResService;
    @RequestMapping(method = RequestMethod.GET,value = "select/{id}")
    public TtUser findone(@PathVariable("id") int id){
        TtUser tuser =  ttUserResService.selectById(id);
        return tuser;
    }
}
