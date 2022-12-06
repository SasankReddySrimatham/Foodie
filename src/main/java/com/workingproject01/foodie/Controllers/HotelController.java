package com.workingproject01.foodie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.Hotel;
import com.workingproject01.foodie.Service.HotelService;

@RestController
@RequestMapping("/Hotel")
public class HotelController {
	
	@Autowired HotelService hotelService;
	
	
	@GetMapping("/ViewHPayout")
	public ResponseEntity<Hotel> ViewHPayout(@PathVariable (name="id")int hPayoutId){
		return new ResponseEntity<Hotel>(hotelService.viewHPayoutById(hPayoutId),HttpStatus.FOUND);
		
	}

}
