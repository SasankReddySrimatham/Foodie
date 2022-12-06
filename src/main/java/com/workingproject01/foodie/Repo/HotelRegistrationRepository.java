package com.workingproject01.foodie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.HotelRegistration;

@Repository
public interface HotelRegistrationRepository extends JpaRepository<HotelRegistration,Integer> {

	

}
