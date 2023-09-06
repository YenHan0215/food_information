package com.example.food_information.vo;

public class AddMealReq {

	private String storeName;
	
	private String meal;
	
	private int price;
	
	private int mealComment;

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
