package com.workingproject01.foodie.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.HotelRegistration;
import com.workingproject01.foodie.Repo.HotelRegistrationRepository;

@Service
@Transactional
public class HotelRegistrationServiceImpl implements  HotelRegistrationService{

	@Autowired HotelRegistrationRepository hotelRegistrationRepository;
	@Override
	public HotelRegistration addNewHotelRegistration(HotelRegistration hotelRegistration) {
		// TODO Auto-generated method stub
		return hotelRegistrationRepository.save(hotelRegistration);
	}
	@Override
	public List<HotelRegistration> viewHotelRegistrationDetails() {
		// TODO Auto-generated method stub
		return hotelRegistrationRepository.findAll();
	}
	@Override
	public HotelRegistration deleteHotelRegistrationById(int hotelRegistrationId) {
	HotelRegistration hotelRegistration1=hotelRegistrationRepository.findById(hotelRegistrationId).orElseThrow();
		HotelRegistration hotelRegistration=hotelRegistration1;
		hotelRegistrationRepository.delete(hotelRegistration);
		return hotelRegistration1;
	}
	}

	
	
