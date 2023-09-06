package com.example.food_information.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_information.entity.Meal;
import com.example.food_information.ifs.MealService;
import com.example.food_information.vo.AddMealReq;
import com.example.food_information.vo.AddMealRes;
import com.example.food_information.vo.UpdateMealReq;

@RestController
public class MealController {
	

	@Autowired
	private MealService mealService;
	
	
//新增餐點資訊	
	@PostMapping(value = "meal/meal_info")
	public AddMealRes addMealInfo(@RequestBody AddMealReq req) {
		return mealService.addMeal(new Meal(req.getStoreName(),req.getMeal(),req.getPrice(),req.getMealComment()));
	}
//修改餐點資訊
	@PostMapping(value ="meal/meal_update_meal")
	public AddMealRes updateMeal(@RequestBody UpdateMealReq req) {
		return mealService.updateMealName(req.getStoreName(), req.getOldMeal(), req.getNewMeal());
	}
}
