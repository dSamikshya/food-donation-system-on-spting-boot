package com.project.food_donation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.food_donation.model.User;
import com.project.food_donation.repo.UserRepo;


import java.util.List;

@Service
public class UserService {
	@Autowired
	 UserRepo userRepo;
	public User addUser(User user) {
		User SavedUser =userRepo.save(user);
		return SavedUser;
	}
	
	
		public List<User> getAllUsers() {
			List<User> allUsers=userRepo.findAll();
			return allUsers;
	}


		public User getById(int id) {
			User user=userRepo.getById(id);
			return user;
		}

}
