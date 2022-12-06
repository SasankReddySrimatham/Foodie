package com.workingproject01.foodie.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.Delivery;
import com.workingproject01.foodie.Repo.DeliveryRepository;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired DeliveryRepository deliveryRepository;
	
	
	@Override
	public Delivery getDeliveryById(int dPayoutId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(dPayoutId).orElseThrow();
	}


	@Override
	public Delivery postDeliveryPayment(Delivery delivery) {
		// TODO Auto-generated method stub
		return deliveryRepository.save(delivery);
	}



}
