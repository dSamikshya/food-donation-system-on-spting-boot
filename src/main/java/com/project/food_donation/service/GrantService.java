package com.project.food_donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_donation.model.Donate;
import com.project.food_donation.repo.GrantRepo;

@Service
public class GrantService {
	@Autowired
	GrantRepo grantRepo;
	public Donate addGrant(Donate donate) {
		Donate addGrant=grantRepo.save(donate);
		return addGrant;
		
	}
	 public List<Donate> getAllGrant() {
		 List<Donate> donates= grantRepo.findAll();
		 return donates;
		
	}
public Donate getGrantById(int id) {
	Donate donate=grantRepo.findById(id).get();
	return donate;
	
}
}
