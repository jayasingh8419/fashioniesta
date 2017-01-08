package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Models.Authorities;
import Models.Customer;
import Models.Users;
import dao.CustomerDao;


@Repository
public class CustomerDaoImpl implements CustomerDao{
@Autowired
private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

	public void addCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Authorities authorities=new Authorities();
		authorities.setUsername(customer.getUsers().getUsername());
		authorities.setAuthorities("ROLE_USER");
		Users users=customer.getUsers();
		users.setEnabled(true);
		session.save(customer);
		session.save(authorities);
		session.flush();
                        session.close();
	}
	
	public List<Customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		List<Customer> customers=session.createQuery("from Customer").list();
		return customers;
	}


}

