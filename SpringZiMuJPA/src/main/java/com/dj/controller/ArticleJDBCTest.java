package com.dj.controller;

import com.dj.model.modelssm.Article;
import com.dj.service.ArticleRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleJDBCTest {
    //    Article saveArticle(Article article);
//    void deleteArticle(Long id);
//    void updateArticle(Article article);
//    Article getArticle(Long id);
//    List<Article> getAll();
//
    @Autowired
    private ArticleRestService articleRestService;

    @RequestMapping("getarticle/{id}")
    public Article  getArticle(@PathVariable("id") int id){
        Article a =  articleRestService.getArticle(id);
        return a;
    }
}
