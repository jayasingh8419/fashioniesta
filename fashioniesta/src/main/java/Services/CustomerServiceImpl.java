package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Models.Customer;
import dao.CustomerDao;



@Service
public class CustomerServiceImpl implements CustomerServices{
	@Autowired
private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
	return customerDao;
}
	
	
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}


public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}
@Transactional
	public void addCustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
	}

}
