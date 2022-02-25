package com.project.food_donation.model;

import javax.persistence.Entity;

@Entity
public class Foodtype extends BaseEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
