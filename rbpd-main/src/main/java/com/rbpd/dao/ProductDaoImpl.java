package com.rbpd.dao;

import com.rbpd.core.Product;

public class ProductDaoImpl extends BaseDao<Product, Long> implements ProductDao {

	public ProductDaoImpl(Class<Product> persistanceClass) {
		super(Product.class);
	}
	
}
