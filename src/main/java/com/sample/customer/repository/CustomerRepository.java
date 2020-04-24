package com.sample.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//Customer findByName(String name);
}
