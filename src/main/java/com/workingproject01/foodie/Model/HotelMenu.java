package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class HotelMenu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int FoodId;
	

	@NotNull(message = "FoodName must not be null..")
	private String FoodName;
	

	@NotNull(message = "FoodImage must not be null..")
	private String FoodImage;
	

	@NotNull(message = "FoodPrice must not be null..")
	private int FoodPrice;
	

	@NotNull(message = "FoodDiscription must not be null..")
	private String FoodDiscription;
	
	
	public int getFoodId() {
		return FoodId;
	}
	public void setFoodId(int foodId) {
		FoodId = foodId;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getFoodImage() {
		return FoodImage;
	}
	public void setFoodImage(String foodImage) {
		FoodImage = foodImage;
	}
	public int getFoodPrice() {
		return FoodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		FoodPrice = foodPrice;
	}
	public String getFoodDiscription() {
		return FoodDiscription;
	}
	public void setFoodDiscription(String foodDiscription) {
		FoodDiscription = foodDiscription;
	}
	@Override
	public String toString() {
		return "HotelMenu [FoodId=" + FoodId + ", FoodName=" + FoodName + ", FoodImage=" + FoodImage + ", FoodPrice="
				+ FoodPrice + ", FoodDiscription=" + FoodDiscription + "]";
	}
	
	
}
