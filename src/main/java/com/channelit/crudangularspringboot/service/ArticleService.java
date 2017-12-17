package com.channelit.crudangularspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channelit.crudangularspringboot.dao.IArticleDAO;
import com.channelit.crudangularspringboot.entity.Article;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	private IArticleDAO articleDao;

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleDao.getAllArticles();
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		return articleDao.getArticleById(articleId);
	}

	@Override
	public synchronized boolean createArticle(Article article) {
		// TODO Auto-generated method stub
		try{
			if(articleDao.articleExists(article.getTitle(), article.getCategory()))
				return false;
			else
			{
				articleDao.createArticle(article);
				return true;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
		
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.updateArticle(article);
		
	}

	@Override
	public void deleteArticle(int articleId) {
		// TODO Auto-generated method stub
		articleDao.deleteArticle(articleId);
	}

}
