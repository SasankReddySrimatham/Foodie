package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.Delivery;
import com.workingproject01.foodie.Service.DeliveryService;

@RestController
@RequestMapping("/Delivery")
public class DeliveryController {
	 
	@Autowired DeliveryService deliveryService;
	
	@PostMapping("/SaveDeliveryPayout")
	public ResponseEntity<Delivery> SaveDeliveryPayout(@RequestBody Delivery delivery){
		return new ResponseEntity<Delivery> (deliveryService.postDeliveryPayment(delivery),HttpStatus.CREATED);
		
	}
	

	@GetMapping("/GetDeliveryPayout")
	public ResponseEntity<Delivery> GetDelivery(@PathVariable (name="id")int dPayoutId){
		return new ResponseEntity<Delivery> (deliveryService.getDeliveryById(dPayoutId),HttpStatus.FOUND);
		
	}
	
	
}
