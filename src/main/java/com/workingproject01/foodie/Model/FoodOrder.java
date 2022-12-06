package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OrderId;
	
	@OneToOne
	@JoinColumn(name="CustomerId",referencedColumnName="CustomerId")
	private CustomerRegistration CustomerId;
	
	@OneToOne
	@JoinColumn(name="FoodId",referencedColumnName="FoodId")
	private HotelMenu FoodId;
	
	

	@NotNull(message = "FoodQuantity must not be null..")
	private int FoodQuantity;

	@OneToOne
	@JoinColumn(name="DeliveryExecutiveId",referencedColumnName="DeliveryExecutiveId")
	private DeliveryExecutiveRegistration DeliveryExecutiveId;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
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

	public int getFoodQuantity() {
		return FoodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		FoodQuantity = foodQuantity;
	}

	public DeliveryExecutiveRegistration getDeliveryExecutiveId() {
		return DeliveryExecutiveId;
	}

	public void setDeliveryExecutiveId(DeliveryExecutiveRegistration deliveryExecutiveId) {
		DeliveryExecutiveId = deliveryExecutiveId;
	}

	@Override
	public String toString() {
		return "FoodOrder [OrderId=" + OrderId + ", CustomerId=" + CustomerId + ", FoodId=" + FoodId + ", FoodQuantity="
				+ FoodQuantity + ", DeliveryExecutiveId=" + DeliveryExecutiveId + "]";
	}
	
	
}
