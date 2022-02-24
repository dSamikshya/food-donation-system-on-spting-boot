package com.project.food_donation.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.ManyToOne;

@Entity
public class Donation extends BaseEntity {

	private String food_type;
	private int quantity;
	private int manufacture_date;
	private int expiry_date;
	private int claimed_qty;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(int manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public int getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(int expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getClaimed_qty() {
		return claimed_qty;
	}

	public void setClaimed_qty(int claimed_qty) {
		this.claimed_qty = claimed_qty;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
