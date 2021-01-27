package it.com;

import it.com.controller.FirstSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration //启用自动配置
//@ComponentScan //扫描该类所在包的，及以下的所有包
//@SpringBootConfiguration
@SpringBootApplication
public class MySpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication .class,args);
    }

}
