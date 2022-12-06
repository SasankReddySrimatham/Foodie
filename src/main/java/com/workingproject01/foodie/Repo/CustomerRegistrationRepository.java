package com.workingproject01.foodie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.CustomerRegistration;

@Repository
public interface CustomerRegistrationRepository extends JpaRepository<CustomerRegistration,Integer> {

	

	
}
