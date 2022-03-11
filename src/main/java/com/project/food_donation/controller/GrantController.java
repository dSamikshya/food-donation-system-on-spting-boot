package com.project.food_donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.Donate;
import com.project.food_donation.service.GrantService;

@RestController
@RequestMapping("food_donation/grant")
public class GrantController {
	@Autowired
	GrantService grantService;
	@PostMapping("/add")
	public Donate addGrant(@RequestBody Donate donate) {
		Donate addGrant=grantService.addGrant(donate);
		return addGrant;
	}

}
