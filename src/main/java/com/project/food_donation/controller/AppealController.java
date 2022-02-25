package com.project.food_donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food_donation.service.AppealService;
import com.project.food_donation.model.Appeal;

@RestController
@RequestMapping("/food_donation/appeal")
public class AppealController {
	@Autowired
	AppealService appealService;
	@PostMapping("/add")
	 public Appeal addAppeal(@RequestBody Appeal appeal) {
		Appeal addAppeal= appealService.addAppeal(appeal);
		return addAppeal;
	}
	@GetMapping("/viewall")
	public List<Appeal> viewAllAppeal(){
		List<Appeal> appeals=appealService.getAllAppeal();
		return appeals;
	}
	 @GetMapping("viewById/{id}")
	 public Appeal getById(@PathVariable int id) {
		 System.out.println("abc");
		 Appeal appeal=appealService.getAppealById(id);
		 return appeal;
	 }
	

}
