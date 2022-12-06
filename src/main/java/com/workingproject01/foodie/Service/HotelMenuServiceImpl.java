package com.workingproject01.foodie.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.HotelMenu;
import com.workingproject01.foodie.Repo.HotelMenuRepository;

@Service
@Transactional
public class HotelMenuServiceImpl implements HotelMenuService {

	@Autowired HotelMenuRepository hotelMenuRepository;
	
	@Override
	public List<HotelMenu> findAllHotelMenu() {
		// TODO Auto-generated method stub
		return hotelMenuRepository.fetchAll();
	
	}

	@Override
	public HotelMenu saveHotelMenu(HotelMenu hotelMenu) {
		// TODO Auto-generated method stub
		return hotelMenuRepository.save(hotelMenu);
	}

	@Override
	public HotelMenu deleteHotelMenuById(int foodId) {
		HotelMenu hotelMenu1=hotelMenuRepository.findById(foodId).orElseThrow();
		HotelMenu hotelMenu=hotelMenu1;
		hotelMenuRepository.delete(hotelMenu);
		return hotelMenu1;
	}

	@Override
	public HotelMenu updateHotelMenuById(int foodId) {
		HotelMenu h=hotelMenuRepository.findById(foodId).orElseThrow();
		h.setFoodId(h.getFoodId());
		h.setFoodName(h.getFoodName());
		h.setFoodImage(h.getFoodImage());
		h.setFoodPrice(h.getFoodPrice());
		h.setFoodDiscription(h.getFoodDiscription());
		
		return hotelMenuRepository.save(h);
	}

	@Override
	public HotelMenu findHotelMenuById(int foodId) {
		// TODO Auto-generated method stub
		return hotelMenuRepository.findById(foodId).orElseThrow();
	}

}
