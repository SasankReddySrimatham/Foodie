package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.PaymentDetails;
import com.workingproject01.foodie.Service.PaymentDetailsService;

@RestController
@RequestMapping("/PaymentDetails")
public class PaymentDetailsController {
	
	@Autowired PaymentDetailsService paymentDetailsService;

	
	
	@PostMapping("/SavePaymentDetails")
	public ResponseEntity<PaymentDetails> SavePaymentDetails(@RequestBody PaymentDetails paymentDetails){
		return new ResponseEntity<PaymentDetails>(paymentDetailsService.addNewPaymentDetails(paymentDetails),HttpStatus.ACCEPTED);
		
	}
	
	
}
