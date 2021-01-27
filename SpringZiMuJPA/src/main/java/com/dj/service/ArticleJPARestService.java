package com.dj.service;

import com.dj.dao.testssm.ArticleRepository;
import com.dj.model.modelssm.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleJPARestService implements  ArticleRestService {
//    Article saveArticle(Article article);
//    void deleteArticle(Long id);
//    void updateArticle(Article article);
//    Article getArticle(Long id);
//    List<Article> getAll();
//
    @Autowired
    private ArticleRepository  articleRepository;

    @Override
    public Article saveArticle(Article article){
        articleRepository.save(article);
        return article;
    }
    public void deleteArticle(int id){
        articleRepository.deleteById(id);
    }

    public  void  updateArticle(Article article){
        articleRepository.save(article);
    }
    public  Article getArticle(int id){
        Optional<Article> option = articleRepository.findById(id);
        Article t = option.get();
        return t;
    }
    public List<Article> getAll(){
        List<Article> articleList = articleRepository.findAll();
        return articleList;
    }
}
