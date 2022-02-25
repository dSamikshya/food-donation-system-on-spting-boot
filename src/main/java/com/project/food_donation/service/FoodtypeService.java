package com.project.food_donation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_donation.model.Foodtype;
import com.project.food_donation.repo.FoodtypeRepo;

@Service
public class FoodtypeService {
	@Autowired
	FoodtypeRepo foodtypeRepo;
	public Foodtype addFoodtype(Foodtype foodtype) {
		Foodtype addFoodtype = foodtypeRepo.save(foodtype);
		return addFoodtype;
		
	}
	

}
