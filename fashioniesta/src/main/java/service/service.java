package service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import daoimpl.ProductsDAOImpl;
import models.Products;

@Service
public class service {
	
	@Autowired
	private ProductsDAOImpl pdi;
	
	/*@Autowired
	public service(ProductsDAOImpl pdi)
	{
		this.pdi=pdi;
	}*/
	
	public List<Products> getAll()
	{
		return pdi.viewProducts();
	}
	
	/*public void addProduct(Products p)
	{
		this.pdi.addNewProduct(p);
	}
	
	public void removeProduct(int id)
	{
		this.pdi.deleteProduct(id);
	}
	
	public void update(int id)
	{
		this.pdi.updateProduct(id);
	}
	*/

}
