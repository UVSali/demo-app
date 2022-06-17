package com.tele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tele.Repository.SimDetailsRepo;
import com.tele.dto.SimDetailsDTO;
import com.tele.entity.SimDetails;

@Service
public class SimDetailsImpl implements SimDetailsService{
	
	@Autowired
	private SimDetailsRepo srepo;

	@Override
	public String addSimDetails(SimDetailsDTO smd) {
		srepo.saveAndFlush(SimDetailsDTO.prepareSimDetailsEntity(smd));
		return "Success";
	}

	@Override
	public String simDetails(long simNumber, long serviceNumber) {
		SimDetails simdetails = srepo.findBySimNumberAndServiceNumber(simNumber, serviceNumber);
		if(simdetails.getSimStatus().equals("active"))
		{
			return "Your Sim is already Activated";
			
		}
		else 
		{
			return "Invalid details, please check again SIM number/Service number!";
		}
	
	}
	

}
