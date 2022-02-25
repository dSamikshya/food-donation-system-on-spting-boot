package com.project.food_donation.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Donation extends BaseEntity {
	
@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Foodtype foodtype;

	private String name;
	private int quantity;
	private int manufacture_date;
	private int expiry_date;
	private int claimed_qty;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	 @OneToMany(mappedBy = "donation", cascade = CascadeType.ALL)
	 @JsonIgnore
	 private List<Claim> claims;

	

	public Foodtype getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(Foodtype foodtype) {
		this.foodtype = foodtype;
	}

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

	public List<Claim> getClaims() {
		return claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

}
