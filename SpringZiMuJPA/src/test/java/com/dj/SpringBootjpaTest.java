package com.dj;

import com.dj.dao.testssm.ArticleRepository;
import com.dj.dao.testssm2.UserRepository;
import com.dj.model.modelssm.Article;
import com.dj.model.modelssm2.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootjpaTest {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void jpaTest(){
        Article article = Article.builder()
                .id(25)
                .author("zimug")
                .content("spring boot 从青铜到王者")
                .createTime(new Date())
                //.reader(readers)
                .title("t1").build();

//        User user = User.builder()
//                .user_name("zimug")
//                .address("ok")
//                .brithday(new Date())
//                .sex("南")
//                .build();

        //先构造一个Article对象article，这个操作针对testdb
        articleRepository.save(article);
        //在构造一个Message对象message，这个操作针对testdb2
//        userRepository.save(user);
    }
}
