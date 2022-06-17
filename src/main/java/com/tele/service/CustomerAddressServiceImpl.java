package com.tele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tele.Repository.CustomerAddressRepository;
import com.tele.dto.CustomerAddressDTO;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService{
	
	@Autowired
	CustomerAddressRepository customerAddressRepo;

	@Override
	public void addCustomerAddress(CustomerAddressDTO customerAddress) {
	
		customerAddressRepo.saveAndFlush(CustomerAddressDTO. prepareAddressEntity(customerAddress));
	}

}
