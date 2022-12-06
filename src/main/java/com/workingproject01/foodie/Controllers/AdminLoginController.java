package com.workingproject01.foodie.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.AdminLogin;
import com.workingproject01.foodie.Model.CustomerRegistration;
import com.workingproject01.foodie.Model.Delivery;
import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Model.Hotel;
import com.workingproject01.foodie.Model.HotelRegistration;
import com.workingproject01.foodie.Model.PaymentDetails;
import com.workingproject01.foodie.Service.AdminLoginService;
import com.workingproject01.foodie.Service.CustomerRegistrationService;
import com.workingproject01.foodie.Service.DeliveryExecutiveRegistrationService;
import com.workingproject01.foodie.Service.DeliveryService;
import com.workingproject01.foodie.Service.HotelRegistrationService;
import com.workingproject01.foodie.Service.HotelService;
import com.workingproject01.foodie.Service.PaymentDetailsService;

@RestController
@RequestMapping("/AdminController")
public class AdminLoginController {

	@Autowired AdminLoginService adminLoginService;
	@Autowired PaymentDetailsService paymentDetailsService;
	@Autowired HotelService hotelService;
	@Autowired DeliveryService deliveryService;
	@Autowired HotelRegistrationService hotelRegistrationService;
	@Autowired CustomerRegistrationService customerRegistrationService;
	@Autowired DeliveryExecutiveRegistrationService deliveryExecutiveRegistrationService;
	
	
	
	
	//PostMapping
	@PostMapping("/PostAdminLogin")
	public ResponseEntity<AdminLogin> PostAdminLogin(@RequestBody AdminLogin adminLogin){
		
		 
		
		return new ResponseEntity<AdminLogin>( adminLoginService.postAdminLogin(adminLogin),HttpStatus.OK);
	}
	
	@PostMapping("/PostHotelPayment")
	public ResponseEntity<Hotel> PostHotelPayment(@RequestBody Hotel hotel){
		return new ResponseEntity<Hotel>(hotelService.postHotelPayment(hotel), HttpStatus.CREATED);
		
	}
	
	@PostMapping("/PostDeliveryPayment")
	public ResponseEntity<Delivery> PostDeliveryPayment(@RequestBody Delivery delivery){
		return new ResponseEntity<Delivery>(deliveryService.postDeliveryPayment(delivery),HttpStatus.CREATED);
	}
	
	
	
	
	
	//GetMapping
	@GetMapping("/AdminViewAllPayment")
	public ResponseEntity<List<PaymentDetails>> AdminViewAllPayment(){
		return new ResponseEntity<List<PaymentDetails>>(paymentDetailsService.AdminViewAllPayment(),HttpStatus.FOUND);
	}
	
	@GetMapping("/AdminViewPayment/{id}")
	public ResponseEntity<PaymentDetails> AdminViewPayment(@PathVariable (name="id") int paymentId){
		return new ResponseEntity <PaymentDetails> (paymentDetailsService.findAllPaymentDetails(paymentId),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/ViewHotelRegistrationDetails")
	public ResponseEntity<List<HotelRegistration>> ViewHotelRegistrationDetails(){
		return new ResponseEntity<List<HotelRegistration>>(hotelRegistrationService.viewHotelRegistrationDetails(),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/ViewCustomerRegistrationDetails")
	public ResponseEntity<List<CustomerRegistration>> ViewCustomerRegistrationDetails(){
		return new ResponseEntity<List<CustomerRegistration>>(customerRegistrationService.viewCustomerRegistrationDetails(),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/ViewDeliveryExecutiveRegistrationDetails")
	public ResponseEntity<List<DeliveryExecutiveRegistration>> ViewDeliveryExecutiveRegistrationDetails(){
		return new ResponseEntity<List<DeliveryExecutiveRegistration>>(deliveryExecutiveRegistrationService.viewDeliveryExecutiveRegistrationDetails(),HttpStatus.FOUND);
		
	}
	
 
	//DeleteMapping
	@DeleteMapping("/DeleteCustomerDetails/{id}")
	public ResponseEntity<CustomerRegistration> DeleteCustomerDetails(@PathVariable (name= "id") int customerRegistrationId){
		return new ResponseEntity<CustomerRegistration>(customerRegistrationService.deleteCustomerRegistrationById(customerRegistrationId),HttpStatus.OK);
	}
	
	@DeleteMapping("/DeleteHotelDetails/{id}")
	public ResponseEntity<HotelRegistration> DeleteHotelDetails(@PathVariable (name= "id") int hotelRegistrationId){
		return new ResponseEntity<HotelRegistration>(hotelRegistrationService.deleteHotelRegistrationById(hotelRegistrationId),HttpStatus.OK);
	}
	
	@DeleteMapping("/DeleteDeliveryExecutiveDetails/{id}")
	public ResponseEntity<DeliveryExecutiveRegistration> DeleteDeliveryExecutiveDetails(@PathVariable (name= "id") int deliveryExecutiveRegistrationId){
		return new ResponseEntity<DeliveryExecutiveRegistration>(deliveryExecutiveRegistrationService.deleteDeliveryExecutiveRegistrationById(deliveryExecutiveRegistrationId),HttpStatus.OK);
	}

	
	
	
	
	
	
}
