package com.workingproject01.foodie.Controllers;

import java.util.Optional;

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

import com.workingproject01.foodie.Model.Cart;
import com.workingproject01.foodie.Service.CartService;

@RestController
@RequestMapping("/Cart")
public class CartController {

	@Autowired CartService cartService;
	
	@GetMapping("/GetCart/{id}")
    public Optional<Cart> GetCart(@PathVariable (name="id")int cartId){
	    return (cartService.getCartById(cartId));
	
    }
	
	@PostMapping("/SaveCart")
	public ResponseEntity<Cart> SaveCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.saveNewCart(cart),HttpStatus.CREATED);
		
	}
	
	@PutMapping("/UpdateCart/{id}")
	public ResponseEntity<Cart> UpdateCart(@PathVariable (name="id")int cartId){
		return new ResponseEntity<Cart>(cartService.updateCartById(cartId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/DeleteCart/{id}")
	public ResponseEntity<Cart> DeleteCart(@PathVariable (name= "id") int cartId){
		return new ResponseEntity<Cart>(cartService.deleteCartById(cartId),HttpStatus.OK);
		
	}
	
}
