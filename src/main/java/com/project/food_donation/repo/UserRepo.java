package com.project.food_donation.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.food_donation.model.User;


public interface UserRepo extends JpaRepository <User, Integer> {

	

	List<User> findByname(String name);

}
