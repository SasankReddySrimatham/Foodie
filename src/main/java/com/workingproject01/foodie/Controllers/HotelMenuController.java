package com.workingproject01.foodie.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingproject01.foodie.Model.HotelMenu;
import com.workingproject01.foodie.Service.HotelMenuService;

@RestController
@RequestMapping("/HotelMenu")
public class HotelMenuController {

	@Autowired HotelMenuService hotelMenuService;
	
	
	@GetMapping("/GetHotelMenu")
	public ResponseEntity<List<HotelMenu>> GetHotelMenu(){
		return new ResponseEntity<List<HotelMenu>> (hotelMenuService.findAllHotelMenu(),HttpStatus.FOUND);
		
	}
	@GetMapping("/GetHotelMenu/{id}")
	public ResponseEntity<HotelMenu> GetHotelMenu(@PathVariable (name="id")int foodId){
		return new ResponseEntity<HotelMenu> (hotelMenuService.findHotelMenuById(foodId),HttpStatus.FOUND);
		
	}
	 
	 @PostMapping("/SaveHotelMenu")
	 public ResponseEntity<HotelMenu> SaveHotelMenu(@RequestBody HotelMenu hotelMenu){
		return new ResponseEntity<HotelMenu>(hotelMenuService.saveHotelMenu(hotelMenu),HttpStatus.CREATED);
		 
	 }
	 
	 @PutMapping("/UpdateHotelMenu/{id}")
	 public ResponseEntity<HotelMenu> UpdateHotelMenu(@PathVariable (name = "id")int FoodId){
		return new ResponseEntity<HotelMenu>(hotelMenuService.updateHotelMenuById(FoodId),HttpStatus.OK);
		 
	 }
	 
	 @DeleteMapping("/DeleteHotelMenu/{id}")
	 public ResponseEntity<?> DeleteHotelMenu(@PathVariable (name = "id")int FoodId){
		return new ResponseEntity<HotelMenu>(hotelMenuService.deleteHotelMenuById(FoodId),HttpStatus.OK);
		 
	 }
	 
}
