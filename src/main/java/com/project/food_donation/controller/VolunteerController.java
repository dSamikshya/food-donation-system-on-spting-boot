package com.project.food_donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.Volunteer;
import com.project.food_donation.service.VolunteerService;

@RestController
@RequestMapping("/food_donation/volunteer")
public class VolunteerController {
	@Autowired
	 VolunteerService volunteerService;
	 
	@PostMapping("/add")
	public Volunteer addVolunteer(@RequestBody Volunteer volunteer) {
		Volunteer addVolunteer=volunteerService.addVolunteer(volunteer);
		return addVolunteer;
	}
	 @DeleteMapping("/delete/{id}")
	 public void deleteVolunteer(@PathVariable int id) {
		 volunteerService.deleteDonation(id);
	 }
	

}
