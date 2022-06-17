package com.tele.dto;




import com.tele.entity.SimDetails;

	public class SimDetailsDTO {
		
		private int simId;
		private Long serviceNumber;
		private Long simNumber;
		private String simStatus;
		
		
		public int getSimId() {
			return simId;
		}
		public void setSimId(int simId) {
			this.simId = simId;
		}
		public Long getServiceNumber() {
			return serviceNumber;
		}
		public void setServiceNumber(Long serviceNumber) {
			this.serviceNumber = serviceNumber;
		}
		public Long getSimNumber() {
			return simNumber;
		}
		public void setSimNumber(Long simNumber) {
			this.simNumber = simNumber;
		}
		public String getSimStatus() {
			return simStatus;
		}
		public void setSimStatus(String simStatus) {
			this.simStatus = simStatus;
		}
		
		
		public SimDetailsDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SimDetailsDTO(int simId, Long serviceNumber, Long simNumber, String simStatus) {
			super();
			this.simId = simId;
			this.serviceNumber = serviceNumber;
			this.simNumber = simNumber;
			this.simStatus = simStatus;
		}
		
		
		public static SimDetails prepareSimDetailsEntity (SimDetailsDTO  sdDTO) {
			
			SimDetails sdetail = new SimDetails();
			
			sdetail.setServiceNumber(sdDTO.getServiceNumber());
			sdetail.setSimId(sdDTO.getSimId());
			sdetail.setSimNumber(sdDTO.getSimNumber());
			sdetail.setSimStatus(sdDTO.getSimStatus());
			
			return sdetail;
		}
		

	}


