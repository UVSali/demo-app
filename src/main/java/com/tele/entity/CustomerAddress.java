package com.tele.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

;

@Entity
@Table(name = "CustomerAddress")
public class CustomerAddress {
	
	@Id
	@Column(name= "addressId")
	@GeneratedValue
	private int addressId;
	
	private String address;
	private String city;
	private int pincode;
	private String state;
	
	
	

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAddress(int addressId, String address, String city, int pincode, String state) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
	
	
	
	
}




//
//	public CustomerAddressDTO  prepareAddressEntity(CustomerAddress customerAddress) {
//		
//		CustomerAddressDTO   ca1 =  new 	CustomerAddressDTO();
//		ca1.setAddress(customerAddress.getAddress());
//		ca1.setAddressId(customerAddress.getAddressId());
//		ca1.setCity(customerAddress.getCity());
//		ca1.setPincode(customerAddress.getPincode());
//		ca1.setState(customerAddress.getState());
//		return ca1;
//	
//	
//	}
//
//}
