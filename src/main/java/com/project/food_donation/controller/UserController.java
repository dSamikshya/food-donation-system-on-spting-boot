package com.project.food_donation.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.model.User;
import com.project.food_donation.service.UserService;

@RestController
@RequestMapping("/food_donation/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User addedUser= userService.addUser(user);
		return addedUser;
		
	}

@GetMapping("/viewall")
public List<User> getallUsers(){
	List<User> users =userService.getAllUsers();
	return users;
}
@GetMapping("/viewById/{id}")
public User getById(@PathVariable int id) {
	
	User user=userService.getById(id);
	return user;
}
@GetMapping("/viewByName/{name}")
public List<User>  getByName(@PathVariable String name) {
	List<User> users=userService.getByName(name);
	return users;
}

@PutMapping("/updateById/{id}")
public User updateUserById(@RequestBody User user, @PathVariable int id) {
	User updateUser= userService.updateUserById( user,id);
	return updateUser;
}
@DeleteMapping("/deleteById/{id}")
public void deleteUser(@PathVariable int id) {
	userService.deleteUser(id);
	
}
}
