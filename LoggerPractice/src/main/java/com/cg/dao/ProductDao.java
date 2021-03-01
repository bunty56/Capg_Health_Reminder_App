package com.cg.dao;

import java.util.List;

import com.cg.entities.Product;

public interface ProductDao {
	public void addProduct(Product p);
	 public List<Product> listAllProducts();
	 public Product getProductById(int id);
	 public void  deleteProduct(int id);
	 public void  updateProduct(int id);
}
