package com.rbpd.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbpd.core.Product;
import com.rbpd.dao.ProductDao;

@Service
public class ProductService implements GenericService<Product> {

	@Autowired
	private ProductDao productDao;

	public void save(Product product) {
		this.productDao.persist(product);
	}

	public void update(Product t) {
		// TODO Auto-generated method stub

	}

	public void addSampleProducts() throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want to add product ?");
		String choice = bufferedReader.readLine();

		do {

			Product product = new Product();
			System.out.println("Enter Product Name ");
			String productName = bufferedReader.readLine();
			product.setProductName(productName);

			System.out.println("Enter Product Desc ");
			String productDesc = bufferedReader.readLine();
			product.setProductDescription(productDesc);

			System.out.println("Enter Product type ");
			Integer productType = Integer.parseInt(bufferedReader.readLine());
			product.setProductType(productType);

			System.out.println("Enter Quantity in stock ");
			Integer quanityInStock = Integer.parseInt(bufferedReader.readLine());
			product.setQuanityInStock(quanityInStock);
			
			System.out.println("Enter cost price");
			Double buyPrice = Double.parseDouble(bufferedReader.readLine());
			product.setBuyPrice(buyPrice);

			save(product);
		} while (choice.equalsIgnoreCase("true"));

	}

	@Override
	public List<Product> getAll() {
		return productDao.findAll();
	}

}
