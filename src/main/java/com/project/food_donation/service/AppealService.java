package com.project.food_donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_donation.model.Appeal;
import com.project.food_donation.repo.AppealRepo;

@Service
public class AppealService {
@Autowired
AppealRepo appealRepo;
	public Appeal addAppeal(Appeal appeal) {
		Appeal addAppeal=appealRepo.save(appeal);
		return addAppeal;
	}
	public List<Appeal> getAllAppeal() {
	List<Appeal> appeals=appealRepo.findAll();
		return appeals;
	}
	public Appeal getAppealById( int id) {
		Appeal appeal=appealRepo.getById(id);
		return appeal;
	}

}
