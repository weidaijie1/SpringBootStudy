package com.dj.sercive;

import com.dj.model.Article;

import java.util.List;

public  interface ArticleService {

    Object saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}