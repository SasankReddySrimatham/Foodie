package com.workingproject01.foodie.Service;

import com.workingproject01.foodie.Model.Delivery;

public interface DeliveryService {

	Delivery getDeliveryById(int dPayoutId);

	Delivery postDeliveryPayment(Delivery delivery);

	
}
