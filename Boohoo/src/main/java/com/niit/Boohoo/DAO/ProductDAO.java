package com.niit.Boohoo.DAO;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.niit.Boohoo.bean.product;

@Repository
public class ProductDAO
{
	 public List<product> getALLProducts()
	  {
		  List<product> list=new ArrayList<product>();
		  product p = new product();
		  p.setId("P_101");
		  p.setName("Jeans");
		  
		  
		list.add(p);
		  
		  p = new product();
		  p.setId("P_102");
		  p.setName("Shirt");
		  list.add(p);
		return list;
	  }
	  
	}

