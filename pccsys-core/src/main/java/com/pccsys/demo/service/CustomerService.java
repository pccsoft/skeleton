package com.pccsys.demo.service;
import java.util.List;

import com.pccsys.demo.domain.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> findAllCustomer();

}