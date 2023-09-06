package com.example.food_information.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.food_information.entity.Store;
import com.example.food_information.ifs.StoreService;
import com.example.food_information.repository.StoreDao;
import com.example.food_information.vo.AddStoreReq;
import com.example.food_information.vo.AddStoreRes;
import com.example.food_information.vo.CityReq;
import com.example.food_information.vo.StoreNameAndMealRes;
import com.example.food_information.vo.StoreNameAndMealVo;
//@Controller
@RestController
public class StoreController {

	
	@Autowired
	private StoreService storeService;
	
	@Autowired 
	private StoreDao storeDao;
	
	
//新增店家資訊		
	@PostMapping(value = "store/create")
	public  AddStoreRes addStore(@RequestBody AddStoreReq req) {
		return storeService.create(new Store(req.getStoreName(),req.getCity(),req.getStoreComment()));
	}
	
//找出特定城市 並列印相關資訊

	@GetMapping(value = "store/find_city_get_all")
	public List<StoreNameAndMealVo> findCityAllInfo(@RequestBody CityReq city) {
		return storeDao.findCityGetAll(city.getCity());
	}
	
//找出店家評等()以上 包含 列印出所有店家資訊 餐點資訊	
	@GetMapping(value = "store/find_store_Comment")
	public List<StoreNameAndMealVo> findStoreComment(@RequestBody CityReq city){
		return storeDao.findStoreComment(city.getRange1(),city.getRange2());
	}
	
//找出店家評等()以上 以及餐點評等需X以上  列出符合店家資訊
	@GetMapping(value = "store/find_store_com_and_meal_com")
	public List<StoreNameAndMealVo> findStoreCOmAndMealCom(@RequestBody CityReq city){
		return storeDao.findStoreCommentAndMealCommentUP(city.getRange1(),city.getRange2(),city.getMealRange1(),city.getMealRange2());
	}
}
