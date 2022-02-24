package com.project.food_donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.Donation;
import com.project.food_donation.service.DonationService;

@RestController
@RequestMapping("food_donation/donation")
public class DonationController {
	@Autowired
	DonationService donationService;

	@PostMapping("/add")
	public Donation addDonation(@RequestBody Donation donation) {
		System.out.println("hello");
		Donation addDonation = donationService.addDonation(donation);
		return addDonation;
	}

	@GetMapping("/viewall")
	public List<Donation> getAllDonations() {
		System.out.println("Test");
		List<Donation> donations = donationService.getAllDonations();
		return donations;
	}

	@GetMapping("/viewById/{id}")
	public Donation getDonationById(@PathVariable int id) {
		Donation donationById = donationService.getDonationById(id);
		return donationById;
	}
	
}
