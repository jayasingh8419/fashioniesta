package com.spring.daoimpl;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.ProductsDao;
import com.spring.model.Products;

@Repository
public class ProductsDaoImpl implements ProductsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Products> listProducts(){
		
		Session session=sessionFactory.openSession();
		return session.createQuery("from Products").list();
	}
	
	public Products getProductsById(int id){
		Session session=sessionFactory.openSession();
		Products p=(Products) session.get(Products.class, id);
				session.close();
		return p;
	}
	
	public void removeProducts(int id){
		
		Session session= sessionFactory.openSession();
		Products p=(Products)session.get(Products.class, id);
		session.delete(p);
		session.flush();
		session.close();
	}
	public void  addProducts(Products p){
		
		Session session=sessionFactory.openSession();
		session.save(p);
		session.close();
		
	}

	public void updateProducts(Products p) {
		Session session=sessionFactory.openSession();
		session.update(p);
		session.flush();
		session.close();
		
	}

}
