package com.example.food_information.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "meal")
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@JoinColumn(name = "store_name")
	@Column //(name = "store_name")
	private String storeName;

	@Column(name = "meal")
	private String meal;

	@Column(name = "price")
	private int price;

	@Column(name = "meal_comment")
	private int mealComment;

	public Meal() {
		super();

	}

	public Meal(String storeName, String meal, int price, int mealComment) {
		super();
		this.storeName = storeName;
		this.meal = meal;
		this.price = price;
		this.mealComment = mealComment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMealComment() {
		return mealComment;
	}

	public void setMealComment(int mealComment) {
		this.mealComment = mealComment;
	}

}
