package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CartId;
	
	
	@OneToOne
	@JoinColumn(name="CustomerId",referencedColumnName="CustomerId") 
	private CustomerRegistration CustomerId;
	 
	
	@OneToOne
	@JoinColumn(name="FoodId",referencedColumnName="FoodId")
	private HotelMenu FoodId;
	
	
	@NotNull(message = "Quantity must not be null..")
	private int Quantity;
	
	
	public int getCartId() {
		return CartId;
	}
	public void setCartId(int cartId) {
		CartId = cartId;
	}
	public CustomerRegistration getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(CustomerRegistration customerId) {
		CustomerId = customerId;
	}
	public HotelMenu getFoodId() {
		return FoodId;
	}
	public void setFoodId(HotelMenu foodId) {
		FoodId = foodId;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", CustomerId=" + CustomerId + ", FoodId=" + FoodId + ", Quantity=" + Quantity
				+ "]";
	}
	
	
}
