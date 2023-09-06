package com.example.food_information.vo;

public class UpdateMealReq {

	private String storeName;

	private String oldMeal;

	private String newMeal;

	public UpdateMealReq() {
		super();
	}

	public UpdateMealReq(String storeName, String oldMeal, String newMeal) {
		super();
		this.storeName = storeName;
		this.oldMeal = oldMeal;
		this.newMeal = newMeal;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getOldMeal() {
		return oldMeal;
	}

	public void setOldMeal(String oldMeal) {
		this.oldMeal = oldMeal;
	}

	public String getNewMeal() {
		return newMeal;
	}

	public void setNewMeal(String newMeal) {
		this.newMeal = newMeal;
	}

}
