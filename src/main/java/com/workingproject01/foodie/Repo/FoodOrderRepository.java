package com.workingproject01.foodie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.FoodOrder;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Integer>{

}
