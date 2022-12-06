package com.workingproject01.foodie.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.Cart;
import com.workingproject01.foodie.Repo.CartRepository;

@Service
@Transactional
public class CartServiceImpl implements CartService{

	@Autowired CartRepository cartRepository;
	
	@Override
	public Optional<Cart> getCartById(int cartId) {
		// TODO Auto-generated method stub
		return cartRepository.findById(cartId);
	}

	@Override
	public Cart saveNewCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	

	@Override
	public Cart deleteCartById(int cartId) {
		Cart cart1=cartRepository.findById(cartId).orElseThrow();
		Cart cart=cart1;
		cartRepository.delete(cart);
		return cart1;
	
	}

	@Override
	public Cart updateCartById( int cartId){
		
		Cart c=cartRepository.findById(cartId).orElseThrow();		
		c.setCustomerId(c.getCustomerId());
		c.setFoodId(c.getFoodId());
		c.setQuantity(c.getQuantity());
		return cartRepository.save(c);		
	}

}
