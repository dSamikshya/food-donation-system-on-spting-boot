package com.project.food_donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.Claim;
import com.project.food_donation.service.ClaimService;

@RestController
@RequestMapping("food_donation/claim")
public class ClaimController {
	@Autowired
	ClaimService claimService;
	 @PostMapping("/add")
	 public Claim addClaim(@RequestBody Claim claim) {
		 Claim addClaim=claimService.addClaim(claim);
		 return addClaim;
	 }
	 @GetMapping("/viewall")
	 public  List<Claim>  getAllClaim() {
		 List<Claim> claims=claimService.getAllClaim();
		 return claims;
		
	}
@GetMapping("/viewById/{id}")
public Claim getById(@PathVariable int id) {
	Claim claim=claimService.getClaimById(id);
	return claim;
	
}
}
