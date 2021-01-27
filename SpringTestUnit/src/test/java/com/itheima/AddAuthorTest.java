package com.itheima;

import com.itheima.dao.AuthorDao;
import com.itheima.pojo.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySptingBootApplication.class)
public class AddAuthorTest {

    @Autowired
    private AuthorDao authorDao;

    @Test
    public void testInsert() {

        Author author = new Author();
        author.setId(45L);
        author.setRealName("莫言3");
        author.setNickName("疯子1");

        authorDao.save(author);
        System.out.println("插入成功！");
    }

    @Test
    public void testFind(){
        Optional<Author> optionalUserDO=authorDao.findById(1L);
        if(optionalUserDO.isPresent()){
            Author userDO=optionalUserDO.get();
            System.out.println("testFind Author"+userDO.getNickName());
        }

    }
}
