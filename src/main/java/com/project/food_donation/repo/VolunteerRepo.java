package com.project.food_donation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_donation.model.Volunteer;

public interface VolunteerRepo extends JpaRepository<Volunteer,Integer> {

}
