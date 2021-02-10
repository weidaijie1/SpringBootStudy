package com.dj.launch.service;


import com.dj.launch.dao.UserRepository;
import com.dj.launch.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public  List<User> findall(){
        List<User> u = userRepository.findAll();
        return u;
    }

    /**
     * 增加
     *
     * @param user
     */
    @Override
    public void insert(User user) {
        userRepository.save(user);
    }

    /**
     * 更新
     *
     * @param user
     */
    @Override
    public int update(User user) {
        userRepository.save(user);
        return 1;
    }

    /**
     * 查询单个
     *
     * @param id
     */
    @Override
    public User selectById(int id) {
        Optional<User> optional = userRepository.findById(id);
        User user = optional.get();
        return user;
    }

//    @Override
//    public Iterator<User> selectAll(int pageNum, int pageSize) {
//        return null;
//    }

    /**
     * 查询全部列表,并做分页
     *  @param pageNum 开始页数
     * @param pageSize 每页显示的数据条数
     */
    @Override
    public Iterator<User> selectAll(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。

//        Sort sort = new Sort.by(Sort.Direction.DESC, "id");
//        Pageable pageable = new PageRequest(pageNum, pageSize, sort);
        //2.2以上不适合此方法
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        PageRequest Page = PageRequest.of(pageNum,pageSize,sort);
        Page<User> users = userRepository.findAll(Page);
        Iterator<User> userIterator =  users.iterator();
        return  userIterator;

    }


}