package com.example.logback.service;

import com.example.logback.pojo.User;

/**
 * TODO
 *
 * @author liuzebiao
 * @Date 2020-4-10 13:45
 */
public interface UserService {

    //根据用户ID获取用户信息
    User getUserById(int id);
}
