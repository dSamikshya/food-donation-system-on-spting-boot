package com.project.food_donation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appeal extends BaseEntity {
	
	private String name;
	private int quantity;

	private int date;
	private int granted_qty;
	
	@ManyToOne(fetch = FetchType.EAGER)
 private User user;
	
	@OneToOne
	private Foodtype foodtype;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getGranted_qty() {
		return granted_qty;
	}

	public void setGranted_qty(int granted_qty) {
		this.granted_qty = granted_qty;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
