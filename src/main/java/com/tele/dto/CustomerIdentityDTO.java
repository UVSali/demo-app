package com.tele.dto;

import java.time.LocalDate;

import com.tele.entity.CustomerIdentity;
import com.tele.entity.Customer;

public class CustomerIdentityDTO {

		private Long uniqueIdNumber;
		private LocalDate DOB;
		private String firstName;
		private String lastName;	
		private String emailAddress;
	
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

		@Override
		public String toString() {
			return "CustomerIdentiyDTO [uniqueIdNumber=" + uniqueIdNumber + ", DOB=" + DOB + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", emailAddress=" + emailAddress + ", state=" + state + "]";
		}

		public CustomerIdentityDTO(Long uniqueIdNumber, LocalDate dOB, String firstName, String lastName,
				String emailAddress, String state) {
			super();
			this.uniqueIdNumber = uniqueIdNumber;
			DOB = dOB;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailAddress = emailAddress;
			this.state = state;
		}
		
		
		
		
		
		public CustomerIdentityDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public static CustomerIdentity prepareCustomerIdentityEntity(CustomerIdentityDTO cidDTO) {
			CustomerIdentity custid = new CustomerIdentity();
			
			custid.setDOB(cidDTO.getDOB());
			custid.setEmailAddress(cidDTO.getEmailAddress());
			custid.setFirstName(cidDTO.getFirstName());
			custid.setLastName(cidDTO.getLastName());
			custid.setState(cidDTO.getState());
			custid.setUniqueIdNumber(cidDTO.getUniqueIdNumber());
		
			return custid;
		}
		

	}

