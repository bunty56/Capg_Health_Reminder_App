package com.cg.service;

import java.util.List;

import com.cg.dao.ProductDaoImpl;
import com.cg.entities.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductServiceImpl implements ProductService {
	
	ProductDaoImpl productDaoImpl=new ProductDaoImpl();
	private static final Logger logger=LogManager.getLogger(ProductServiceImpl.class);
	
	public void addProduct(Product p) {
		logger.info("in service: adding product....");
		productDaoImpl.addProduct(p);
	}
	 public List<Product> listAllProducts(){
		 List<Product> plist=productDaoImpl.listAllProducts();
		 logger.info("in service: displaying all products....");
		 return plist;
	 }
	 public Product getProductById(int id) {
		 Product p=productDaoImpl.getProductById(id);
		 logger.info("in service: finding product....");
		 return p;
	 }
	 public void  deleteProduct(int id) {
		 logger.info("in service: deleting product....");
		 productDaoImpl.deleteProduct(id);
	 }
}
