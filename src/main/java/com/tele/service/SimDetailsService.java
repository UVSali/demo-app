package com.tele.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.dto.SimDetailsDTO;
import com.tele.entity.SimDetails;

public interface SimDetailsService {
	public String addSimDetails (SimDetailsDTO smd);
	public String simDetails(long simNumber, long serviceNumber);

}
