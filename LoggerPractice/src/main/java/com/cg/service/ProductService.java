package com.cg.service;

import java.util.List;

import com.cg.entities.Product;


public interface ProductService {
 public void addProduct(Product p);
	 
	 public List<Product> listAllProducts();
	 public Product getProductById(int id);
	 public void  deleteProduct(int id) ;
}
