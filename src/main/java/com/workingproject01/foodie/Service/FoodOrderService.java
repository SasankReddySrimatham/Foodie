package com.workingproject01.foodie.Service;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Model.FoodOrder;

public interface FoodOrderService {

	FoodOrder findFoodOrderById(int orderId);

	DeliveryExecutiveRegistration findDeliveryDetailById(int deliveryExecutiveId);


	
}
