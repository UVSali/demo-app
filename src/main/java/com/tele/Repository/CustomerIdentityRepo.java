package com.tele.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.entity.CustomerIdentity;


public interface CustomerIdentityRepo extends JpaRepository<CustomerIdentity, Long>{

}
