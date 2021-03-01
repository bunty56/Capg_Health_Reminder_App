package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.entities.Product;

public class ProductDaoImpl {
	 private static final Logger logger=LogManager.getLogger(ProductDaoImpl.class);
	 
	 List<Product>plist=new ArrayList<Product>();
	 
	 public void addProduct(Product p) {
		 logger.info("in DAO: adding product....");
			plist.add(p);
	 }
	 
	 public List<Product> listAllProducts(){
		 logger.info("in DAO: displaying all products....");
			 return plist;
	 }
	 
	 public Product getProductById(int id) {
		 logger.info("in DAO: finding product....");
		 Product q=null;
		 for(Product p:plist)
	    	 if(p.getId()==id)
	    		 q=p;
		 return q;
	 }
	 public void  deleteProduct(int id) {
		 logger.info("in DAO: deleting product....");
		 Product q=null;
		 for(Product p:plist)
	    	 if(p.getId()==id)
	    		 q=p;
		 plist.remove(q);
	 }

}
