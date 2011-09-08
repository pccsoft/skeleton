package com.pccsys.demo.view;

import java.io.Serializable;
import java.util.List;

import com.pccsys.demo.domain.Customer;
import com.pccsys.demo.service.CustomerService;

public class CustomerBean implements Serializable {

	// DI via Spring
	CustomerService customerService;

	public String name;
	public String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	// get all customer data from database
	public List<Customer> getCustomerList() {
		return customerService.findAllCustomer();
	}

	// add a new customer data into database
	public String addCustomer() {

		Customer cust = new Customer();
		cust.setName(getName());
		cust.setAddress(getAddress());

		customerService.addCustomer(cust);

		clearForm();

		return "";
	}

	// clear form values
	private void clearForm() {
		setName("");
		setAddress("");
	}

}
