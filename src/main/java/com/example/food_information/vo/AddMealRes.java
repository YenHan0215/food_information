package com.example.food_information.vo;

import com.example.food_information.entity.Meal;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class AddMealRes {

	private String code;

	private String message;

	private Meal meal;

	public AddMealRes() {
		super();
	}

	public AddMealRes(String code, String message, Meal meal) {
		super();
		this.code = code;
		this.message = message;
		this.meal = meal;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

}
