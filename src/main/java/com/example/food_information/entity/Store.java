package com.example.food_information.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {

	@Id
	@Column(name = "store_name")
	private String storeName;

	@Column(name = "city")
	private String city;

	@Column(name = "store_comment")
	private double storeComment;

	public Store() {
		super();
	}

	public Store(String storeName, String city, double storeComment) {
		super();
		this.storeName = storeName;
		this.city = city;
		this.storeComment = storeComment;
	}

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
