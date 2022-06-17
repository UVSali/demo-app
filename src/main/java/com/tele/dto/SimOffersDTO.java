package com.tele.dto;

import com.tele.entity.SimDetails;
import com.tele.entity.SimOffers;

public class SimOffersDTO {

		

		private int offerId;	
		private int callQty;
		private int cost;
		private int datacost;
		private int duration;
		private String offerName;
		
		private SimDetailsDTO simdetals;
		
		
			
		public int getOfferId() {
			return offerId;
		}



		public void setOfferId(int offerId) {
			this.offerId = offerId;
		}



		public int getCallQty() {
			return callQty;
		}



		public void setCallQty(int callQty) {
			this.callQty = callQty;
		}



		public int getCost() {
			return cost;
		}



		public void setCost(int cost) {
			this.cost = cost;
		}



		public int getdatacost() {
			return datacost;
		}



		public void setdatacost(int datacost) {
			this.datacost = datacost;
		}



		public int getDuration() {
			return duration;
		}



		public void setDuration(int duration) {
			this.duration = duration;
		}



		public String getOfferName() {
			return offerName;
		}



		public void setOfferName(String offerName) {
			this.offerName = offerName;
		}



		public SimDetailsDTO getSimdetals() {
			return simdetals;
		}



		public void setSimdetals(SimDetailsDTO simdetals) {
			this.simdetals = simdetals;
		}



		public SimOffersDTO(int offerId, int callQty, int cost, int datacost, int duration, String offerName,
				SimDetailsDTO simdetals) {
			super();
			this.offerId = offerId;
			this.callQty = callQty;
			this.cost = cost;
			this.datacost = datacost;
			this.duration = duration;
			this.offerName = offerName;
			this.simdetals = simdetals;
		}



		public SimOffersDTO() {
			super();
			// TODO Auto-generated constructor stub
		}



		public static SimOffers prepareSimOffersEntity(SimOffersDTO  simOffer) {
				SimDetails sd = new SimDetails(simOffer.getSimdetals().getSimId(),simOffer.getSimdetals().getServiceNumber(),simOffer.getSimdetals().getSimNumber(),simOffer.getSimdetals().getSimStatus());
				
				return new SimOffers(simOffer.getOfferId(),simOffer.getCallQty(),simOffer.getCost(),simOffer.getdatacost(),simOffer.getDuration(),simOffer.getOfferName(),sd);
				
			}
			
			

//			public static SimOffers prepareSimOffersEntity(SimOffersDTO  simOffer) {
//			SimOffers so = new SimOffers();
//			
//			so.setCallQty(simOffer.getCallQty());
//			so.setCost(simOffer.getCost());
//			so.setDuration(simOffer.getDuration());
//			so.setOfferId(simOffer.getOfferId());
//			so.setOfferName(simOffer.getOfferName());
//			so.setDataCost(simOffer.getDatacost());
//			so.setSimdetals(simOffer.getSimdetals());
//			return so;
//		}

	}

