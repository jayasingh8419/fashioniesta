package com.spring.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ProductsDao;
import com.spring.model.Products;


@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	public ProductsDao bookDao;
	
	

	public ProductsDao getBookDao() {
		return bookDao;
	}



	public void setProductsDao(ProductsDao bookDao) {
		this.bookDao = bookDao;
	}


	@Transactional
	public List<Products> listProducts() {
		// TODO Auto-generated method stub
		return bookDao.listProducts();
	}
	
	public Products getProductsById(int id){
		
		return bookDao.getProductsById(id);
	}
	
	public void removeProducts(int id){
		
		bookDao.removeProducts(id);
	}
	
	public void addProducts(Products p){
		
		bookDao.addProducts(p);
	}



	public void updateProducts(Products p) {
		// TODO Auto-generated method stub
		bookDao.updateProducts(p);
		
	}

}
