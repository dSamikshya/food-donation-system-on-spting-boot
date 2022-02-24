package com.project.food_donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_donation.model.Donation;
import com.project.food_donation.repo.DonationRepo;

@Service
public class DonationService {
	@Autowired
	DonationRepo donationRepo;
	public Donation addDonation(Donation donation) {
		Donation addDonation = donationRepo.save(donation);
		return addDonation;
		}
	public List<Donation> getAllDonations() {
		List<Donation> allDonations=donationRepo.findAll();
		return allDonations;
	}
	public Donation getDonationById( int id) {
		Donation donationById=donationRepo.findById(id).get();
		return donationById;
		
	}
	
	
	}


