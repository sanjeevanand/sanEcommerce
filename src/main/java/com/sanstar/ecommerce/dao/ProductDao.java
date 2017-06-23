package com.sanstar.ecommerce.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sanstar.ecommerce.model.Product;

public class ProductDao {
	
	private List<Product> productList;
	
	public List<Product> getProductList()
	{
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("mango");
		product.setProductCategory("mangocat");
		product.setProductDescription("mango productDescription");;
		product.setProductPrice("100");
		product.setProductStatus("Active");
		product.setProductCondition("new");
		product.setInitInStock(10);
		product.setProductManufacturer("sanstar");
		
		productList=new ArrayList<Product>();
		productList.add(product);
		productList.add(product);
		productList.add(product);
		productList.add(product);
		productList.add(product);
		
		return productList;
		
		
	}
	public Product getProductById(int productId) throws IOException 
	{
		for(Product p:getProductList())
		{
			if(p.getProductId()==productId)
				return p;
		}
		
		throw new IOException();
	}

}
