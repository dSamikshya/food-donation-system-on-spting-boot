package com.project.food_donation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_donation.model.Foodtype;

public interface FoodtypeRepo extends JpaRepository<Foodtype, Integer> {

}
