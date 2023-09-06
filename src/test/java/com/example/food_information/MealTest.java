package com.example.food_information;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.food_information.entity.Meal;
import com.example.food_information.ifs.MealService;
import com.example.food_information.repository.MealDao;

@SpringBootTest(classes = FoodInformationApplication.class)
public class MealTest {


	@Autowired
	private MealService mealService;
	
	@Autowired 
	private MealDao mealDao;
	
	
	@Test
	public void mealAdd() {
		Meal meal = new Meal("麥當勞", "炸雞", 129, 0);
		mealService.addMeal(meal);
	}
	
	@Test
	public void updateMeal() {
		mealService.updateMealName("麥當勞", "可樂", "檸檬紅茶");
	}
	
//更新店家評等
	@Test
	public void setStoreTest() {

//		int res = mealDao.updateStoreComment("麥當勞");
//		System.out.println(res);
//		Assert.isTrue(res == 1, "Insert Failed!!!");
	}
}
