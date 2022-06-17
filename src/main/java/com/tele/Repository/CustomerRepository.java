package com.tele.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tele.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
