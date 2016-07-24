package com.niit.Boohoo.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.Boohoo.dao.UserDAO;
import com.niit.Boohoo.model.Category;
import com.niit.Boohoo.model.User;


public class Test {
	
	static AnnotationConfigApplicationContext context;
	
	public Test()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
	}
	
	public static void createUser(User user)
	{
		
		UserDAO  userDAO =  (UserDAO) context.getBean("userDAO");
		userDAO.saveOrUpdate(user);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Test t = new Test();
		
		User user =(User)  context.getBean("user");
		user.setId("NIIT");
		user.setPassword("NIIT");
		user.setAdmin(true);
		
		
		t.createUser(user);
		
		
	}

	

}
