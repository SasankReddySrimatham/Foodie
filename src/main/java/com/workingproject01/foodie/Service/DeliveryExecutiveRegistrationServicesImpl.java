package com.workingproject01.foodie.Service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Repo.DeliveryExecutiveRegistrationRepository;

@Service
@Transactional
public class DeliveryExecutiveRegistrationServicesImpl implements  DeliveryExecutiveRegistrationService{

	@Autowired DeliveryExecutiveRegistrationRepository deliveryExecutiveRegistrationRepository;

	@Override
	public DeliveryExecutiveRegistration saveDeliveryExecutiveRegistration(
			@Valid DeliveryExecutiveRegistration deliveryExecutiveRegistration) {
		// TODO Auto-generated method stub
		return deliveryExecutiveRegistrationRepository.save(deliveryExecutiveRegistration);
	}

	@Override
	public List<DeliveryExecutiveRegistration> viewDeliveryExecutiveRegistrationDetails() {
		// TODO Auto-generated method stub
		return deliveryExecutiveRegistrationRepository.findAll();
	}

	@Override
	public DeliveryExecutiveRegistration deleteDeliveryExecutiveRegistrationById(int deliveryExecutiveRegistrationId) {
		DeliveryExecutiveRegistration deliveryExecutiveRegistration1=deliveryExecutiveRegistrationRepository.findById(deliveryExecutiveRegistrationId).orElseThrow();
		DeliveryExecutiveRegistration deliveryExecutiveRegistration=deliveryExecutiveRegistration1;
		deliveryExecutiveRegistrationRepository.delete(deliveryExecutiveRegistration);
		return deliveryExecutiveRegistration1;
	}

	
}
