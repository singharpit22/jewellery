package com.rbpd.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rbpd.core.Product;
import com.rbpd.dao.ProductDao;

public class ProductService implements GenericService<Product> {

	@Autowired
	private ProductDao productDao;
	
	public void save(Product product) {
		
	}

	public void update(Product t) {
		// TODO Auto-generated method stub
		
	}

}
