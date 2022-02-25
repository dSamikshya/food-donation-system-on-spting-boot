package com.project.food_donation.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Entity
public class Claim  extends BaseEntity{
	@ManyToOne(fetch=FetchType.EAGER )
	private Donation donation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	private String msg;
	
	 private int qty;
	 
	  private boolean status;
	  
	public Donation getDonation() {
		return donation;
	}
	public void setDonation(Donation donation) {
		this.donation = donation;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	  
	 
}
