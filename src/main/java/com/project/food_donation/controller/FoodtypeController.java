package com.project.food_donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.Foodtype;
import com.project.food_donation.service.FoodtypeService;

@RestController
@RequestMapping("/food_donation/foodtype")
public class FoodtypeController {
	@Autowired
	FoodtypeService foodtypeService;
	@PostMapping("/add")
	public Foodtype addFoodtype(@RequestBody Foodtype foodtype) {
		Foodtype addFoodtype=foodtypeService.addFoodtype(foodtype);
		return addFoodtype;
	}
	
	

	

}
