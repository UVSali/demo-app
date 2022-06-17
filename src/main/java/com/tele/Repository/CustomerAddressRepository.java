package com.tele.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.entity.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

}
