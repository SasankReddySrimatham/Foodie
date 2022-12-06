package com.workingproject01.foodie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;

@Repository
public interface DeliveryExecutiveRegistrationRepository extends JpaRepository<DeliveryExecutiveRegistration,Integer> {

}
