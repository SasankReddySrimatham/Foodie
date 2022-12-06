package com.workingproject01.foodie.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Service.DeliveryExecutiveRegistrationService;

@RestController
@RequestMapping("/DeliveryExecutiveRegistration")
public class DeliveryExecutiveRegistrationController {
	
	@Autowired DeliveryExecutiveRegistrationService deliveryExecutiveRegistrationService;
	
	@PostMapping("/SaveDeliveryExecutiveRegistration")
	public ResponseEntity<DeliveryExecutiveRegistration> SaveDeliveryExecutiveRegistration(@RequestBody @Valid DeliveryExecutiveRegistration deliveryExecutiveRegistration){
		return new ResponseEntity<DeliveryExecutiveRegistration> (deliveryExecutiveRegistrationService.saveDeliveryExecutiveRegistration(deliveryExecutiveRegistration),HttpStatus.CREATED);
		
	}

}
