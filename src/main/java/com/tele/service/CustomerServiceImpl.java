package com.tele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tele.Repository.CustomerRepository;
import com.tele.dto.CustomerDTO;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	public String addCustomer(CustomerDTO cust) {
		
		customerRepository.saveAndFlush(CustomerDTO.prepareCustomerEntity(cust));
		
		return "Inserted";
		
	}


	
	
	

}
