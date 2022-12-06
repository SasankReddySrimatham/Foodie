package com.workingproject01.foodie.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.Hotel;
import com.workingproject01.foodie.Repo.HotelRepository;

@Service
@Transactional
public class HotelServiceImpl implements  HotelService{

	@Autowired HotelRepository hotelRepository;

	@Override
	public Hotel viewHPayoutById(int hPayoutId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hPayoutId).orElseThrow();
	}

	@Override
	public Hotel postHotelPayment(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}
	

}
