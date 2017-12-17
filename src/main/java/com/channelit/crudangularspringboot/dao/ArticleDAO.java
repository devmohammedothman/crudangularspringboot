package com.channelit.crudangularspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.channelit.crudangularspringboot.entity.Article;

@Transactional
@Repository
public class ArticleDAO implements IArticleDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		String hql = "FROM Article as artcl ORDER BY artcl.articleid";
		List<Article> resultList = entityManager.createQuery(hql).getResultList();
		return resultList;
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		return entityManager.find(Article.class, articleId);
	}

	@Override
	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		entityManager.persist(article);
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		Article artcl = getArticleById(article.getArticleId());
		artcl.setTitle(article.getTitle());
		artcl.setCategory(article.getCategory());
		
		entityManager.flush();
	}

	@Override
	public void deleteArticle(int articleId) {
		// TODO Auto-generated method stub
		entityManager.remove(getArticleById(articleId));
	}

	@Override
	public boolean articleExists(String title, String category) {
		// TODO Auto-generated method stub
		String hql = "from Article as artcl where artcl.title = ? and artcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title).setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}

}
