package com.workingproject01.foodie.Service;

import java.util.List;

import javax.validation.Valid;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;

public interface DeliveryExecutiveRegistrationService {

	DeliveryExecutiveRegistration saveDeliveryExecutiveRegistration(
			@Valid DeliveryExecutiveRegistration deliveryExecutiveRegistration);

	List<DeliveryExecutiveRegistration> viewDeliveryExecutiveRegistrationDetails();

	DeliveryExecutiveRegistration deleteDeliveryExecutiveRegistrationById(int deliveryExecutiveRegistrationId);

	

	
}
