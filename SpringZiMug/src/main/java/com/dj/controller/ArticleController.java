package com.dj.controller;

import com.dj.model.Article;
import com.dj.response.AjaxResponse;
import com.dj.sercive.ArticlleJDBCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {

    @Autowired
    ArticlleJDBCService articllejdbcervice;

    //获取一篇Article，使用GET方法,根据id查询一篇文章
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){
        System.out.println("查询文章");
        //使用lombok提供的builder构建对象
        Article a =  articllejdbcervice.getArticle(id);
        System.out.println("测试");
        System.out.println(a);

        log.info("article:" + a);

        return AjaxResponse.success(a);
    }


    //增加一篇Article ，使用POST方法(RequestBody方式接收参数)
    //@RequestMapping(value = "/articles",method = RequestMethod.POST)
    @Transactional
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article)
                                   {
        Object  a = articllejdbcervice.saveArticle(article);
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("saveArticle:" + a);
//        int t = 2/0;
        return AjaxResponse.success();
    }

    //增加一篇Article ，使用POST方法(RequestParam方式接收参数)
  /*@PostMapping("/articles")
  public AjaxResponse saveArticle(@RequestParam  String author,
                                  @RequestParam  String title,
                                  @RequestParam  String content,
                                  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                  @RequestParam  Date createTime){

    log.info("saveArticle:" + createTime);
    return AjaxResponse.success();
  }*/


    //更新一篇Article，使用PUT方法，以id为主键进行更新
    //@RequestMapping(value = "/articles",method = RequestMethod.PUT)
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article){
        if(article.getId() == null){
            //article.id是必传参数，因为通常根据id去修改数据
            //TODO 抛出一个自定义的异常
        }

        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }

    //删除一篇Article，使用DELETE方法，参数是id
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id){

        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }

}

