package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Model.FoodOrder;
import com.workingproject01.foodie.Service.FoodOrderService;

@RestController
@RequestMapping("/FoodOrder")
public class FoodOrderController {
 
	@Autowired FoodOrderService foodOrderService;
	
	@GetMapping("/GetFoodOrder")
	public ResponseEntity<FoodOrder> GetFoodOrder(@PathVariable (name="id")int orderId ){
		return new ResponseEntity<FoodOrder>(foodOrderService.findFoodOrderById(orderId),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/ViewDeliveryDetails")
	public ResponseEntity <DeliveryExecutiveRegistration> ViewDeliveryDetails(@PathVariable (name="id")int deliveryExecutiveId){
		return new ResponseEntity <DeliveryExecutiveRegistration> (foodOrderService.findDeliveryDetailById(deliveryExecutiveId),HttpStatus.FOUND);
		
	}
	
}
