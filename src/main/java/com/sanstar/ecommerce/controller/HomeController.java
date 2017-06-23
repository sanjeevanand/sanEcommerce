package com.sanstar.ecommerce.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanstar.ecommerce.dao.ProductDao;
import com.sanstar.ecommerce.model.Product;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ProductDao productDao= new ProductDao();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/productList")
	public String getProduct(Model model)
	{
		List<Product> productList=productDao.getProductList();
		//Product product=productList.get(0);
		model.addAttribute("products",productList);
		return "productlist";
		
	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public String getProduct(@PathVariable int  productId,Model model)throws IOException
	{
		Product product=productDao.getProductById(productId);
		model.addAttribute(product);
		return "viewProduct";
	}
	
}
