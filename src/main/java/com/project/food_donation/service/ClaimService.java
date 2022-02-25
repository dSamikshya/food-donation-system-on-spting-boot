package com.project.food_donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.food_donation.model.Claim;
import com.project.food_donation.repo.ClaimRepo;
@Service
public class ClaimService {
@Autowired
ClaimRepo claimRepo;
 
public Claim addClaim(Claim claim) {
	Claim addClaim=claimRepo.save(claim);
	return addClaim;
	
}

public List<Claim> getAllClaim() {
	List<Claim> claims=claimRepo.findAll();
	
	return claims;
}
public  Claim getClaimById( int id) {
	Claim claim=claimRepo.findById(id).get();
	return claim;
	
}

}
