package com.example.food_information.vo;

public class StoreNameAndMealVo {

	private String storeName;

	private String city;

	private double storeComment;

	private String meal;

	private int price;

	private int meal_comment;

	public StoreNameAndMealVo() {
		super();

	}

	public StoreNameAndMealVo(String storeName, String city, double storeComment, String meal, int price,
			int meal_comment) {
		super();
		this.storeName = storeName;
		this.city = city;
		this.storeComment = storeComment;
		this.meal = meal;
		this.price = price;
		this.meal_comment = meal_comment;
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

	public int getMeal_comment() {
		return meal_comment;
	}

	public void setMeal_comment(int meal_comment) {
		this.meal_comment = meal_comment;
	}

}
