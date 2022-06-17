package com.tele.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.dto.SimOffersDTO;
import com.tele.entity.SimDetails;
import com.tele.entity.SimOffers;

public interface SimOfferRepository extends JpaRepository<SimOffers, Integer>{

public	List<SimOffersDTO> findBySimDetails(SimDetails s);


}
