package dao;

import java.util.List;
//import java.util.List;

import Models.Products;

public interface ProductDAO {
	
	/*public void addProduct();*/
	
	
	public List<Products> listProducts();
	void addProducts(Products p);
	void updateProducts(int id);
	void removeProducts(int id);
	/*Products getProductsById(int id);*/
	public List<Products> viewProducts();
	/*public void editProducts(Products p);*/


}
