package dao;

import java.util.List;

import Models.Customer;

public interface CustomerDao {
	/*void addCustomer(Customer customer);
	}*/
void addCustomer(Customer customer);
List<Customer> getAllCustomers();
}


