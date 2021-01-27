package com.itheima;

import com.itheima.dao.AuthorDao;
import com.itheima.pojo.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySptingBootApplication.class)
public class AddAuthorTest {

    @Autowired
    private AuthorDao authorDao;

    @Test
    public void testInsert() {
        Author author = new Author();
        author.setRealName("莫言");
        author.setNickName("疯子11");

        authorDao.save(author);

        System.out.println("插入成功！");
    }
}
