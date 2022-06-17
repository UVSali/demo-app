package com.tele.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.tele.entity.Customer;
import com.tele.entity.CustomerAddress;
import com.tele.entity.SimDetails;

public class CustomerDTO {
		
	private Long uniqueIdNumber;
	private LocalDate DOB;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String idType;	
	private CustomerAddressDTO customerAddress;
	private SimDetailsDTO simdetails;
	private String state;
	

	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}


	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}


	public LocalDate getDOB() {
		return DOB;
	}


	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}


	public CustomerAddressDTO getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(CustomerAddressDTO customerAddress) {
		this.customerAddress = customerAddress;
	}


	public SimDetailsDTO getSimdetails() {
		return simdetails;
	}


	public void setSimdetails(SimDetailsDTO simdetails) {
		this.simdetails = simdetails;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public CustomerDTO(Long uniqueIdNumber, LocalDate dOB, String emailAddress, String firstName, String lastName,
			String idType, CustomerAddressDTO customerAddress, SimDetailsDTO simdetails, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		DOB = dOB;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idType = idType;
		this.customerAddress = customerAddress;
		this.simdetails = simdetails;
		this.state = state;
	}

	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public static Customer prepareCustomerEntity(CustomerDTO customerDto)
	 {
	  SimDetails simDetails = new SimDetails(customerDto.getSimdetails().getSimId(), customerDto.getSimdetails().getServiceNumber(), customerDto.getSimdetails().getSimNumber(), customerDto.getSimdetails().getSimStatus());
	  CustomerAddress customerAddress = new CustomerAddress(customerDto.getCustomerAddress().getAddressId(), customerDto.getCustomerAddress().getAddress(), customerDto.getCustomerAddress().getCity(), customerDto.getCustomerAddress().getPincode(), customerDto.getCustomerAddress().getState());
	  return new Customer(customerDto.getUniqueIdNumber(),customerDto.getDOB(),customerDto.getEmailAddress(),customerDto.getFirstName(),customerDto.getLastName(),customerDto.getIdType(),customerAddress,simDetails,customerDto.getState());
	  
	 }
	
	
	
	
	
	
	
	
	
	
	
//
//	public static Customer prepareCustomerEnity(CustomerDTO customerDTO) {
//			Customer cust = new Customer();
//			cust.setCustomerAddress(customerDTO.getCustomerAddress());
//			cust.setDOB(customerDTO.getDOB());
//			cust.setEmailAddress(customerDTO.getEmailAddress());
//			cust.setFirstName(customerDTO.getFirstName());
//		    cust.setLastName(customerDTO.getLastName());
//		    cust.setIdType(customerDTO.getIdType());		
//			cust.setUniqueIdNumber(customerDTO.getUniqueIdNumber());
//			cust.setSimdetails(customerDTO.getSimdetails());
//			cust.setState(customerDTO.getState());
//			return cust;
//		}

	}



