package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.CustomerRegistration;
import com.workingproject01.foodie.Service.CustomerRegistrationService;

@RestController
@RequestMapping("/CustomerRegistration")
public class CustomerRegistrationController {
	
	@Autowired
	CustomerRegistrationService customerRegistrationService;

	@PostMapping("/SaveCustomerRegistration")
	public ResponseEntity<CustomerRegistration> SaveCustomerRegistration(@RequestBody CustomerRegistration customerRegistration){
		return new ResponseEntity<CustomerRegistration>(customerRegistrationService.saveCustomerRegistration(customerRegistration),HttpStatus.CREATED);
		
		
	}
}
