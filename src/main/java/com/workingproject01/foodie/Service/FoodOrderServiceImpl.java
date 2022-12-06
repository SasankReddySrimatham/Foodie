package com.workingproject01.foodie.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.DeliveryExecutiveRegistration;
import com.workingproject01.foodie.Model.FoodOrder;
import com.workingproject01.foodie.Repo.DeliveryExecutiveRegistrationRepository;
import com.workingproject01.foodie.Repo.FoodOrderRepository;

@Service
@Transactional
public class FoodOrderServiceImpl implements FoodOrderService {

	@Autowired FoodOrderRepository foodOrderRepository;
 
	@Autowired DeliveryExecutiveRegistrationRepository deliveryExecutiveRegistrationRepository;
	@Override
	public FoodOrder findFoodOrderById(int orderId) {
		// TODO Auto-generated method stub
		return foodOrderRepository.findById(orderId).orElseThrow();
	}

	@Override
	public DeliveryExecutiveRegistration findDeliveryDetailById(int deliveryExecutiveId) {
		// TODO Auto-generated method stub
		return deliveryExecutiveRegistrationRepository.findById(deliveryExecutiveId).orElseThrow();
	}
}

	
