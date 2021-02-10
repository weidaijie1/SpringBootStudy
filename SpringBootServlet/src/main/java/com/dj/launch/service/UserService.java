package com.dj.launch.service;

import com.dj.launch.model.User;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    //    查询所有
    public List<User> findall();
    /** 删除 */
    public void delete(int id);
    /** 增加*/
    public void insert(User user);
    /** 更新*/
    public int update(User user);
    /** 查询单个*/
    public User selectById(int id);
    /** 查询全部列表*/
    public Iterator<User> selectAll(int pageNum, int pageSize);
}