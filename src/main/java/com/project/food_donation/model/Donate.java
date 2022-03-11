package com.project.food_donation.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Donate extends BaseEntity {
	@ManyToOne(fetch = FetchType.EAGER)
	 private Appeal appeal;
	
	
	 @ManyToOne(fetch = FetchType.EAGER)
	 private User user;
	 private String msg;
	 private int qty;
	public Appeal getAppeal() {
		return appeal;
	}
	public void setAppeal(Appeal appeal) {
		this.appeal = appeal;
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

}
