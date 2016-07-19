package com.niit.Boohoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Boohoo.DAO.ProductDAO;
import com.niit.Boohoo.bean.product;

@Controller
public class ProductController
{
      @Autowired
      private ProductDAO productDAO;
      @RequestMapping("/getAllProducts")
      public ModelAndView getAllProducts()
      {
    	  List<product> productList = productDAO.getALLProducts();
    	  ModelAndView mv = new ModelAndView("/Products");
    	  mv.addObject("productList",productList);
    	  return mv;
      }
}
