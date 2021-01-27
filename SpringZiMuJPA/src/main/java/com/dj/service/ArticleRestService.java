package com.dj.service;

import com.dj.model.modelssm.Article;

import java.util.List;

public interface ArticleRestService {

    Article saveArticle(Article article);

    void deleteArticle(int id);

    void updateArticle(Article article);

    Article getArticle(int id);

    List<Article> getAll();
}

