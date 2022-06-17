package com.tele.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tele.dto.SimDetailsDTO;


@Entity
@Table(name = "Simoffers")
public class SimOffers {
	
	@Id
	@Column(name = "offerId")
	private int offerId;
	private int callQty;
	private int cost;
	private int dataCost;
	private int duration;
	private String offerName;
	
	@OneToOne(cascade = CascadeType.ALL, optional  =false)
	@JoinColumn(name = "simId")
	SimDetails simdetals;
	

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

	public int getDataCost() {
		return dataCost;
	}

	public void setDataCost(int dataCost) {
		this.dataCost = dataCost;
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

	public SimDetails getSimdetals() {
		return simdetals;
	}

	public void setSimdetals(SimDetails simdetals) {
		this.simdetals = simdetals;
	}

	public SimOffers(int offerId, int callQty, int cost, int dataCost, int duration, String offerName,
			SimDetails simdetals) {
		super();
		this.offerId = offerId;
		this.callQty = callQty;
		this.cost = cost;
		this.dataCost = dataCost;
		this.duration = duration;
		this.offerName = offerName;
		this.simdetals = simdetals;
	}

	public SimOffers() {
		super();
		// TODO Auto-generated constructor stub
	}

}
