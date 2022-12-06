package com.workingproject01.foodie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workingproject01.foodie.Model.Cart;

@Repository
public interface CartRepository extends JpaRepository <Cart,Integer>{

	
}
