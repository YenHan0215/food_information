package com.example.food_information.ifs;

import com.example.food_information.entity.Meal;
import com.example.food_information.vo.AddMealRes;

public interface MealService {

	public AddMealRes addMeal(Meal meal);
	
	public AddMealRes updateMealName(String storeName, String oldMeal, String newMeal);
}
