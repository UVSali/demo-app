package com.tele.entity;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
	

	@Entity
	@Table(name= "Sim_Details")
		public class SimDetails {
			
			@Id
			private Integer simId;
			private long serviceNumber;
			private long simNumber;
			private String simStatus;
			
			public Integer getSimId() {
				return simId;
			}
			public void setSimId(Integer simId) {
				this.simId = simId;
			}
			public Long getServiceNumber() {
				return serviceNumber;
			}
			public void setServiceNumber(Long serviceNumber) {
				this.serviceNumber = serviceNumber;
			}
			public long getSimNumber() {
				return simNumber;
			}
			public void setSimNumber(long simNumber) {
				this.simNumber = simNumber;
			}
			public String getSimStatus() {
				return simStatus;
			}
			public void setSimStatus(String simStatus) {
				this.simStatus = simStatus;
			}
			public void setServiceNumber(long serviceNumber) {
				this.serviceNumber = serviceNumber;
			}
			public SimDetails(Integer simId, long serviceNumber, long simNumber, String simStatus) {
				super();
				this.simId = simId;
				this.serviceNumber = serviceNumber;
				this.simNumber = simNumber;
				this.simStatus = simStatus;
			}
			public SimDetails() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			
			
			
	}
//			public SimDetailsDTO prepareSimDetailsEntity (SimDetails  sd) {
//				
//				SimDetailsDTO sdetail1 = new SimDetailsDTO();
//				
//				sdetail1.setServiceNumber(sd.getServiceNumber());
//				sdetail1.setSimId(sd.getSimId());
//				sdetail1.setSimNumber(sd.getSimNumber());
//				sdetail1.setSimStatus(sd.getSimStatus());
//				
//				return sdetail1;
//			
//	}

