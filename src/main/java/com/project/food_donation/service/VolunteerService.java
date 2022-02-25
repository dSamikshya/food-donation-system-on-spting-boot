package com.project.food_donation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_donation.model.Volunteer;
import com.project.food_donation.repo.VolunteerRepo;
@Service
public class VolunteerService {
	@Autowired
	VolunteerRepo volunteerRepo;

	public Volunteer addVolunteer( Volunteer volunteer) {
		Volunteer addVolunteer=volunteerRepo.save(volunteer);
		return addVolunteer;
		
	}

	public void deleteDonation(int id) {
		volunteerRepo.deleteById(id);
		
	}

}
