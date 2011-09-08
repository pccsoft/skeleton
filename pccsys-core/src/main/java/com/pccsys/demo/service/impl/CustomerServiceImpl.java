package com.pccsys.demo.service.impl;

import java.util.List;

import com.pccsys.demo.dao.CustomerDao;
import com.pccsys.demo.domain.Customer;
import com.pccsys.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void addCustomer(Customer customer) {

		customerDao.addCustomer(customer);

	}

	public List<Customer> findAllCustomer() {

		return customerDao.findAllCustomer();
	}
}