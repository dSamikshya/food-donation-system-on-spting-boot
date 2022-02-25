package com.project.food_donation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_donation.model.Appeal;

public interface AppealRepo extends JpaRepository<Appeal,Integer> {
	

	

}
