package com.example.food_information.vo;

public class AddStoreReq {

	private String storeName;
	
	private String city;
	
	private double storeComment;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getStoreComment() {
		return storeComment;
	}

	public void setStoreComment(double storeComment) {
		this.storeComment = storeComment;
	}
	
}
