package com.tele.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.tele.dto.CustomerDTO;
import com.tele.dto.CustomerIdentityDTO;

import net.bytebuddy.asm.Advice.Local;


@Entity
public class CustomerIdentity{
	
	
	@Id 
    private Long uniqueIdNumber;
	private LocalDate DOB;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String state;
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
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

	public CustomerIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public CustomerIdentity(Long uniqueIdNumber, LocalDate dOB, String firstName, String lastName, String emailAddress,
			String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		DOB = dOB;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.state = state;
	}
	
	
}
	
	
	
	


//	
//	public CustomerIdentityDTO prepareCustomerIdentityEntity(CustmerIdentity cid) {
//		CustomerIdentityDTO custid1 = new CustomerIdentityDTO();
//		
//		custid1.setDOB(cid.getDOB());
//		custid1.setEmailAddress(cid.getEmailAddress());
//		custid1.setFirstName(cid.getFirstName());
//		custid1.setLastName(cid.getLastName());
//		custid1.setState(cid.getState());
//		custid1.setUniqueIdNumber(cid.getUniqueIdNumber());
//	
//		return custid1;
//	
//	
//	
//	}
//	
//	
//}
