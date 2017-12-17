package com.channelit.crudangularspringboot.service;

import java.util.List;

import com.channelit.crudangularspringboot.entity.*;

public interface IArticleService {

	List<Article> getAllArticles();
	
	Article getArticleById(int articleId);
	
	boolean createArticle(Article article);
	
	void updateArticle(Article article);
	
	void deleteArticle(int articleId);
}
