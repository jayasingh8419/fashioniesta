package com.spring.dao;

import java.util.List;

import com.spring.model.Products;

public interface ProductsDao {
		
	public List<Products> listProducts();
	void addProducts(Products p);
	void updateProducts(Products p);
	void removeProducts(int id);
	Products getProductsById(int id);

}




