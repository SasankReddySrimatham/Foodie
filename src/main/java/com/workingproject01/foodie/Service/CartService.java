package com.workingproject01.foodie.Service;

import java.util.Optional;

import com.workingproject01.foodie.Model.Cart;

public interface CartService {



	Optional< Cart> getCartById(int cartId);

	 Cart saveNewCart(Cart cart);

	 Cart deleteCartById(int cartId);

	Cart updateCartById( int cartId);

	 

	
}
