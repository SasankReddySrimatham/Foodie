package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.HotelRegistration;
import com.workingproject01.foodie.Service.HotelRegistrationService;

@RestController
@RequestMapping("/HotelRegistration")
public class HotelRegistrationController {

	@Autowired HotelRegistrationService hotelRegistrationService;
	
	
	@PostMapping("/SaveHotelRegistration")
	public ResponseEntity<HotelRegistration> SaveHotelRegistration(@RequestBody HotelRegistration hotelRegistration){
		return new ResponseEntity<HotelRegistration>(hotelRegistrationService.addNewHotelRegistration(hotelRegistration),HttpStatus.ACCEPTED);
		
	}
}
