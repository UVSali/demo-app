package com.tele.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tele.Repository.SimDetailsRepo;
import com.tele.Repository.SimOfferRepository;
import com.tele.dto.SimOffersDTO;
import com.tele.entity.SimDetails;
import com.tele.entity.SimOffers;

@Service
public class SimOffersServiceImpl implements SimOfferService{
	
	@Autowired
	private SimOfferRepository simoffers;
	
	private SimDetailsRepo  simdet;

	@Override
	public void addSimOffers(SimOffersDTO simOffersDTO) {
		simoffers.saveAndFlush(SimOffersDTO.prepareSimOffersEntity(simOffersDTO));
		
	}

	@Override
	public List<SimOffersDTO> simDetails(Long simNumber, Long serviceNumber) throws Exception {
		if (simNumber.toString().length()!=13) {
			throw new Exception("Sim number should contain 13 digits");
		}
		if (simNumber.toString().length()!=10) {
			throw new Exception("Sim number should contain 10 digits");
		}
		
		SimDetails s = simdet.findBySimNumberAndServiceNumber(simNumber, serviceNumber);
		if(s != null) {
			if(s.getSimStatus().equalsIgnoreCase("inactive")) {
				List<SimOffersDTO> simOffer = simoffers.findBySimDetails(s);
				return simOffer;
			}
			
			else {
				throw new Exception ("Sim is already activated");
			}
			
		}
		else {
			throw new Exception ("Invalid Sim or service Number");
		}
		
	}
	
}
