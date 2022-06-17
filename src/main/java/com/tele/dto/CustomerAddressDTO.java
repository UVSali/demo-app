package com.tele.dto;

import com.tele.entity.CustomerAddress;

public class CustomerAddressDTO {

		
		private int addressId;
		private String address;
		private String city;
		private int pincode;
		private String state;

		

		public CustomerAddressDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

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
		
		@Override
		public String toString() {
			return "CustomerAddressDTO [addressId=" + addressId + ", address=" + address + ", city=" + city
					+ ", pincode=" + pincode + ", state=" + state + "]";
		}

		public CustomerAddressDTO(int addressId, String address, String city, int pincode, String state) {
			super();
			this.addressId = addressId;
			this.address = address;
			this.city = city;
			this.pincode = pincode;
			this.state = state;
		}

		public static CustomerAddress  prepareAddressEntity(CustomerAddressDTO customerAddressDTO) {
			
			CustomerAddress   ca =  new CustomerAddress();
			ca.setAddress(customerAddressDTO.getAddress());
			ca.setAddressId(customerAddressDTO.getAddressId());
			ca.setCity(customerAddressDTO.getCity());
			ca.setPincode(customerAddressDTO.getPincode());
			ca.setState(customerAddressDTO.getState());
			return ca;
			
		}
		
}

