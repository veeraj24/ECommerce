package com.ecommerce.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.dao.CustomersDao;
import com.ecommerce.entities.Customers;

@Service
public class CustomersServiceImpl implements CustomersService{
	
	@Autowired
	private CustomersDao customersDao;

	@Override
	public Customers createCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return customersDao.findAll();
	}

	@Override
	public Customers getCustomersByID(int customerid) {
		// TODO Auto-generated method stub
		return customersDao.getOne(customerid);
	}

	@Override
	public Customers addCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}

	@Override
	public void deleteCustomers(int customerid) {
		// TODO Auto-generated method stub
		Customers cus=customersDao.getOne(customerid);
		customersDao.delete(cus);
	}

	@Override
	public Customers updateCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}

	

	


	
}
