package com.project.food_donation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_donation.model.Claim;

public interface ClaimRepo  extends JpaRepository<Claim, Integer>{

}
