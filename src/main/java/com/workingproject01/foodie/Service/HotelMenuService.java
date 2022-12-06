package com.workingproject01.foodie.Service;

import java.util.List;

import com.workingproject01.foodie.Model.HotelMenu;

public interface HotelMenuService {

	 List<HotelMenu> findAllHotelMenu();

	HotelMenu saveHotelMenu(HotelMenu hotelMenu);

	HotelMenu deleteHotelMenuById(int foodId);

	HotelMenu updateHotelMenuById(int foodId);

	HotelMenu findHotelMenuById(int foodId);

	
}
