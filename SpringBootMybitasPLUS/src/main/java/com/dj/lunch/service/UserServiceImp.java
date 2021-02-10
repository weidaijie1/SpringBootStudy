package com.dj.lunch.service;

import com.dj.lunch.AjaxResponse;
import com.dj.lunch.mapper.UserMapper;
import com.dj.lunch.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements   UserService {
    @Resource
    private UserMapper userMapper;
    public AjaxResponse getonebyid(int id){
        return AjaxResponse.success(userMapper.selectById(id));
    }
    public  int inset_user(User user){
        return userMapper.insert(user);
    }
    public List<User> getAll(){
        return userMapper.selectByMap(null);
    }
}
