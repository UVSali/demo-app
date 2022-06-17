package com.tele.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Customer")
public class Customer {
	
	
	@Id
	@Column(name = "unique_IdNumber")
	private Long uniqueIdNumber;
	private LocalDate DOB;
	private String emailAddress;
	private String firstName;
	private String lastName;
	
	private String idType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sim_Id")
	private SimDetails simdetails;
	
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

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public SimDetails getSimdetails() {
		return simdetails;
	}

	public void setSimdetails(SimDetails simdetails) {
		this.simdetails = simdetails;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer(Long uniqueIdNumber, LocalDate dOB, String emailAddress, String firstName, String lastName,
			String idType, CustomerAddress customerAddress, SimDetails simdetails, String state) {
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

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}	



	

	

	
	

	

	
//public static CustomerDTO prepereCustomertoDTO(Customer cust) {
//		
//		CustomerDTO cust1 = new CustomerDTO();
//		///cust1.setCustomerAddress(cust.getCustomerAdderess());
//		cust1.setDOB(cust.getDOB());
//		cust1.setEmailAddress(cust.getEmailAddress());
//		cust1.setFirstName(cust.getFirstName());
//		cust1.setSimId(cust.getSimId());
//		cust1.setIdType(cust.getIdType());
//		cust1.setState(cust.getState());
//		cust1.setUniqueIdNumber(cust.getUniqueIdNumber());
//		cust1.setLastName(cust.getLastName());
//		
//		return cust1;
//		
//		
//	}


