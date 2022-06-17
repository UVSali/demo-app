package com.tele.SimController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tele.dto.CustomerDTO;
import com.tele.service.CustomerService;
import com.tele.service.SimDetailsService;
import com.tele.service.SimOfferService;

@RestController
public class SimActivationController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private SimDetailsService simDe;
	
	@Autowired
	private SimOfferService sos;
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@PostMapping("/addCustomers")
	public String addCustomer(@RequestBody CustomerDTO customerDTO) {
		
	service.addCustomer(customerDTO);	
		return "addedd successfully";
	}
	
	@GetMapping("/add/{simNumber}/{serviceNumber}")
	public String SimOffers(@PathVariable ("simNumber") long simNumber, @PathVariable("serviceNumber") long serviceNumber) {
		return simDe.simDetails(simNumber, serviceNumber);
	}
	                 
	
	

}
