package com.channelit.crudangularspringboot;

import com.channelit.crudangularspringboot.entity.Article;
import com.channelit.crudangularspringboot.service.ArticleService;

public class applicationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticleService service = new ArticleService();
		
		Article article = new Article();
		
		article.setTitle("article1");
		
		article.setCategory("angular2");
		
		boolean flag = service.createArticle(article);
		
		System.out.println(flag);

	}

}
