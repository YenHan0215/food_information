package com.example.food_information.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.food_information.constants.RtnCode;
import com.example.food_information.entity.Store;
import com.example.food_information.ifs.StoreService;
import com.example.food_information.repository.StoreDao;
import com.example.food_information.vo.AddStoreRes;
import com.example.food_information.vo.StoreNameAndMealRes;
import com.example.food_information.vo.StoreNameAndMealVo;

@Service
public class StoreServiceImpl implements StoreService {


	@Autowired
	private StoreDao storeDao;

	@Override
	public AddStoreRes create(Store store) {
		if(!StringUtils.hasText(store.getStoreName()) || !StringUtils.hasText(store.getCity())) {
			System.out.println("新增資訊有錯誤!!!");
			return new AddStoreRes(RtnCode.DATA_ERROR.getCode(),RtnCode.DATA_ERROR.getMessage(),null);
		}
		if(storeDao.existsById(store.getStoreName())){
			System.out.println("資料以存在");
			return new AddStoreRes(RtnCode.MEAL__EXISTED.getCode(),RtnCode.MEAL__EXISTED.getMessage(),null);
		}
		storeDao.save(store);
		System.out.println("新增資訊成功");
		return new AddStoreRes(RtnCode.SUCCESSFUL.getCode(),RtnCode.SUCCESSFUL.getMessage(),store);
	}

//	@Override
//	public StoreNameAndMealRes findCityGetAll(String city) {
	//	List<StoreNameAndMealVo> res = storeDao.findCityGetAll(city);
//		for(StoreNameAndMealVo item :res) {
//			
//		}
//		return new StoreNameAndMealRes(RtnCode.SUCCESSFUL.getCode(),RtnCode.SUCCESSFUL.getMessage(),res);
//	}
	
//找出特定城市 並列印餐點	
}
