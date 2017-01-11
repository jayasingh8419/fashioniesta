package com.spring.services;

import java.util.List;

import com.spring.model.Products;

public interface ProductsService {
	
		public void addProducts(Products p);
		public List<Products> listProducts(); 
		public Products getProductsById(int id);
		public void updateProducts(Products p);
		public void removeProducts(int id);
		/*public List<Products> getAll();*/
		

	}



