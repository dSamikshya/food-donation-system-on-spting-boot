package com.project.food_donation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_donation.model.Donation;


public interface DonationRepo extends JpaRepository <Donation, Integer>  {

}
