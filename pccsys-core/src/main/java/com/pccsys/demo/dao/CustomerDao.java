package com.pccsys.demo.dao;

import java.util.List;

import com.pccsys.demo.domain.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> findAllCustomer();

}