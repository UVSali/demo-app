package com.tele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tele.Repository.CustomerIdentityRepo;
import com.tele.dto.CustomerIdentityDTO;

@Service
public class CustomerIdentityImpl implements CustomerIdentityService{
	
	@Autowired
	private CustomerIdentityRepo custIdentityRepo;

	@Override
	public void addCustomerIdentity(CustomerIdentityDTO customerIdentityDTO) {
		
		custIdentityRepo.saveAndFlush(CustomerIdentityDTO.prepareCustomerIdentityEntity(customerIdentityDTO));
		
		
		
	}
	

}
