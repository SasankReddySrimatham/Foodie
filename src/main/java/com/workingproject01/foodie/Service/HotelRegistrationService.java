package com.workingproject01.foodie.Service;

import java.util.List;

import com.workingproject01.foodie.Model.HotelRegistration;

public interface HotelRegistrationService {

	HotelRegistration addNewHotelRegistration(HotelRegistration hotelRegistration);

	List<HotelRegistration> viewHotelRegistrationDetails();

	HotelRegistration deleteHotelRegistrationById(int hotelRegistrationId);

}
