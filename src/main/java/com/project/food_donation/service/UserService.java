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
		User savedUser =userRepo.save(user);
		return savedUser;
	}
	
	
		public List<User> getAllUsers() {
			List<User> allUsers=userRepo.findAll();
			return allUsers;
	}


		public User getById(int id) {
			System.out.println("tdets "+ id);
			User user=userRepo.findById(id).get();
			return user;
		}


		public User updateUserById(User user, int id) {
			user.setId(id);
			User updateUser= userRepo.save(user);
			
			return updateUser;
		}


		public List<User> getByName(String name) {
			List<User> user=userRepo.findByname(name);
			return user;
		}


		public void deleteUser(int id) {
			userRepo.deleteById(id);
			
		}



}
