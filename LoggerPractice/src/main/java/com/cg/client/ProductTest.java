package com.cg.client;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.entities.Product;
import com.cg.service.ProductService;
import com.cg.service.ProductServiceImpl;

public class ProductTest {
	private static final Logger logger=LogManager.getLogger(ProductTest.class);
		public static void main(String[] args) {
		
			Product p=new Product();
			p.setId(1);
			p.setName("book");
			p.setPrice(234.99);
			
			Product p1=new Product();
			p1.setId(2);
			p1.setName("copy");
			p1.setPrice(300.21);
			
			//System.out.println("in product app");
			logger.info("in product test........");
			
			ProductService ps=new ProductServiceImpl();
			
			//add a product
			ps.addProduct(p);
			ps.addProduct(p1);
			System.out.println("product list");
			
			//list all products
			List<Product> plist= ps.listAllProducts();
			
			for(Product k: plist) {
				System.out.println(k);
			}
			
			//getting product details for product id :2
			
			Product p2=ps.getProductById(2);
			System.out.println(p2);
			
			//deleting  : 2;
			
			ps.deleteProduct(2);
			System.out.println("deleted...");
			
			//list all products
			plist= ps.listAllProducts();
			
			for(Product k: plist) {
				System.out.println(k);
			}
		}
}
