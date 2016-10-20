package daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import models.Products;
import dao.ProductsDAO;

@Repository
public class ProductsDAOImpl implements ProductsDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/*@Autowired
	public ProductsDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}*/
	

	
	public List<Products> viewProducts() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
        List<Products> productsList = session.createQuery("from Products").list();
		return productsList;
	}
	
	/*public void addNewProduct(Products p) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(p);
        //logger.info("Person saved successfully, Person Details="+p);
    }

		public void deleteProduct(int id)
		{
			Session session = sessionFactory.getCurrentSession();
	        Products p = (Products) session.get(Products.class, new Integer(id));
	        if(null != p)
	        {
	            session.delete(p);       
	        }
		}*/
		
		
	}
	

