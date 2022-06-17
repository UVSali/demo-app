package com.tele.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.entity.SimDetails;

public interface SimDetailsRepo extends JpaRepository<SimDetails, Integer>{
	
	public SimDetails findBySimNumberAndServiceNumber(long simNumber, long serviceNumber);

}
