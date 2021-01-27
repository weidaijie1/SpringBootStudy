package com.dj;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

// 静态导入会使代码更简洁

// 静态导入会使代码更简洁


@Slf4j
public class ArticleResControllerTest {

    @Before // setup
    public void setup() {
        System.out.println("at  Before");
    }

    @Test //assert 部分可以帮助我们验证一个结果
    public void testAdd() throws Exception {
        int sum = 3;
        System.out.println(sum);  //为了简洁，往往会static import Assert里面的所有方法。
    }

    @Test
    @Ignore("not implemented yet") // 测试时忽略该方法
    public void testMultiply() throws Exception {
    }

    // 表示验证这个测试方法将抛出 IllegalArgumentException 异常，若没抛出，则测试失败
    @Test(expected = IllegalArgumentException.class)
    public void test() {
        Double f = 4.0/3;
    }
}
