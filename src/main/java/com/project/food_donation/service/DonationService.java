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
		List<Donation> Donations=donationRepo.findAll();
		return Donations;
	}
	public Donation getDonationById( int id) {
		Donation donation=donationRepo.findById(id).get();
		return donation;
		
	}
	public  List<Donation> findByName( String name) {
		List<Donation> donations =donationRepo.findByName(name);
		return donations;
		
	}
	
	public void deleteDonation(int id) {
		donationRepo.deleteById(id);
		
	}
	public Donation updateDonation( Donation donation, int id) {
		donation.setId(id);
		Donation updateDonation=donationRepo.save(donation);
		return updateDonation;
	}
	
	}


