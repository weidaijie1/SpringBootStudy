package com.example.logback.service.impl;

import com.example.logback.mapper.UserMapper;
import com.example.logback.pojo.User;
import com.example.logback.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author liuzebiao
 * @Date 2020-4-10 13:45
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        User user = null;
        try {
             userMapper.getUserById(id);
            System.out.println(1 / 0);
        } catch (Exception e) {
            log.error("出错了",e);
        }
        return user;
    }
}