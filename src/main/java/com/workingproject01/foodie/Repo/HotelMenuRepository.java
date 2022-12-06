package com.workingproject01.foodie.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.HotelMenu;

@Repository
public interface HotelMenuRepository extends JpaRepository<HotelMenu,Integer> {

	//HotelMenu findAll(HotelMenu hotelMenu);

	@Query("Select d from HotelMenu d ")
	List<HotelMenu> fetchAll();
	
}
