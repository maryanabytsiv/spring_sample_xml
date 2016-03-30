package com.ss.service;

import java.util.List;

import com.ss.model.Customer;
import com.ss.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomreService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository custRepo) {
		this.customerRepository = custRepo;
	}

	public void setCustRepo(CustomerRepository custRepo) {
		this.customerRepository = custRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
