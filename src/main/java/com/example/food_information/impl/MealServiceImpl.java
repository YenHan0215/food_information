package com.example.food_information.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.food_information.constants.RtnCode;
import com.example.food_information.entity.Meal;
import com.example.food_information.ifs.MealService;
import com.example.food_information.repository.MealDao;
import com.example.food_information.vo.AddMealRes;

@Service
public class MealServiceImpl implements MealService{

	@Autowired
	private MealDao mealDao;

	@Override
	public AddMealRes addMeal(Meal meal) {
		if(!StringUtils.hasText(meal.getStoreName()) || !StringUtils.hasText(meal.getMeal())) {
			System.out.println("資料錯誤");
			return new AddMealRes(RtnCode.DATA_ERROR.getCode(),RtnCode.DATA_ERROR.getMessage(),null);
		}
		if(meal.getPrice() < 0) {
			System.out.println("餐點金額輸入錯誤");
			return new AddMealRes(RtnCode.DATA_ERROR.getCode(),RtnCode.DATA_ERROR.getMessage(),null);
		}
		if(isExist(meal.getStoreName(), meal.getMeal())) {
			System.out.println("餐點以重複");
			return new AddMealRes(RtnCode.MEAL__EXISTED.getCode(),RtnCode.MEAL__EXISTED.getMessage(),null);
		}
		mealDao.save(meal);
		return new AddMealRes(RtnCode.SUCCESSFUL.getCode(),RtnCode.SUCCESSFUL.getMessage(),meal);
	}
//更新餐點名稱
	@Override
	public AddMealRes updateMealName(String storeName, String oldMeal, String newMeal) {
		if(!StringUtils.hasText(storeName) || !StringUtils.hasText(oldMeal)) {
			//System.out.println("資訊錯誤");
			return new AddMealRes(RtnCode.DATA_ERROR.getCode(),RtnCode.DATA_ERROR.getMessage(),null);
		}
		int update = mealDao.updateMealName(storeName, oldMeal, newMeal);
		if(update > 0) {
			//System.out.println("更新成功");
			return new AddMealRes(RtnCode.SUCCESSFUL.getCode(),RtnCode.SUCCESSFUL.getMessage(),null);
			
		}else {
			//System.out.println("更新錯誤");
			return new AddMealRes(RtnCode.DATA_ERROR.getCode(),RtnCode.DATA_ERROR.getMessage(),null);
		}
		
	}	
	
//判斷餐點和店名是否一樣已存在
	private boolean isExist(String storeName, String meal) {
		
		return mealDao.existsByStoreNameAndMeal(storeName, meal);
	
	}



}
