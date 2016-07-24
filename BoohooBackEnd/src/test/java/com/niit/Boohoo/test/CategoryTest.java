package com.niit.Boohoo.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Boohoo.dao.CategoryDAO;
import com.niit.Boohoo.model.Category;

public class CategoryTest {
	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		
	Category c =(Category)	  context.getBean("category");
	
	CategoryDAO categoryDAO = (CategoryDAO)  context.getBean("categoryDAO");
	
/*	
	c.setId("TAB_003");
	c.setName("Tablet");
	c.setDescription("Tablet product");
	
	
	categoryDAO.saveOrUpdate(c);
	*/
	
	
	
	List<Category>  list =    categoryDAO.list();
	
	for(Category cat : list)
	{
		System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
	}
		
		
	}

}
