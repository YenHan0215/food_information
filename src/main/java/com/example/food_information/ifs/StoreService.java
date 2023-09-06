package com.example.food_information.ifs;

import java.util.List;

import com.example.food_information.entity.Store;
import com.example.food_information.vo.AddStoreRes;
import com.example.food_information.vo.StoreNameAndMealRes;
import com.example.food_information.vo.StoreNameAndMealVo;

public interface StoreService {

	public AddStoreRes create(Store store);
	
	
	//public StoreNameAndMealRes findCityGetAll(String city);
}
