package com.dj.controller;

import com.dj.dao.testssm.ArticleRepository;
import com.dj.dao.testssm2.UserRepository;
import com.dj.model.modelssm.Article;
import com.dj.model.modelssm2.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class springboottest {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("test")
    public String test(){
        return "112s";
    }

    @Transactional
    @RequestMapping("addtest")
    public  String  jpsTest(){
        Article article = Article.builder()
                .id(25)
                .author("550zimug6666321")
                .content("spring boot 从青铜到王者")
                .createTime(new Date())
                //.reader(readers)
                .title("t133333").build();

        User user = User.builder()
                .user_name("55056zimug321")
                .address("ok")
                .birthday(new Date())
                .sex("南")
                .build();

        //先构造一个Article对象article，这个操作针对testdb
        articleRepository.save(article);
        //在构造一个Message对象message，这个操作针对testdb2
        userRepository.save(user);
        return "success";
    }

}

