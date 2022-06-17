package com.tele.service;

import java.util.List;
import java.util.Optional;

import com.tele.dto.SimOffersDTO;
import com.tele.entity.SimOffers;

public interface SimOfferService {
	
	public void addSimOffers(SimOffersDTO simOffersDTO);
	
	List<SimOffersDTO> simDetails (Long simNumber , Long serviceNumber) throws Exception ;

}
