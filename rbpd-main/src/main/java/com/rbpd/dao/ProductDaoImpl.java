package com.rbpd.dao;

import org.springframework.stereotype.Component;

import com.rbpd.core.Product;

@Component
public class ProductDaoImpl extends BaseDao<Product, Long> implements ProductDao {

	public ProductDaoImpl() {
		super(Product.class);
	}
	
}
