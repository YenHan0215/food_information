package com.example.food_information;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.food_information.entity.Store;
import com.example.food_information.ifs.StoreService;
import com.example.food_information.repository.StoreDao;
import com.example.food_information.vo.StoreNameAndMealVo;


@SpringBootTest(classes = FoodInformationApplication.class)
public class StoreTest {

	
	@Autowired
	private StoreService storeService;
	
	@Autowired 
	private StoreDao storeDao;


	@Test
	public void createTest() {
		Store store = new Store("¤¦¤¦", "°ª¶¯", 0);
		storeService.create(store);
	}

	@Test
	public void findcitygetall() {
		List<StoreNameAndMealVo> res = storeDao.findCityGetAll("°ª¶¯");
		
		for(StoreNameAndMealVo item : res) {
			System.out.println(item.getStoreName() + item.getCity() + item.getMeal_comment() + item.getMeal() + item.getPrice() +item.getMeal_comment());
		}
	}
	
	@Test 
	public void findStoreComment() {
		List<StoreNameAndMealVo> res = storeDao.findStoreComment(3,5);
		for(StoreNameAndMealVo item : res) {
			System.out.println(item.getStoreName() + item.getCity() + item.getMeal_comment() + item.getMeal() + item.getPrice() +item.getMeal_comment());
		}

	}
	@Test
	public void findStoreComAndMealCom() {
		List<StoreNameAndMealVo> res = storeDao.findStoreCommentAndMealCommentUP(3, 5, 4, 5);
		for(StoreNameAndMealVo item : res) {
			System.out.println(item.getStoreName() + item.getCity() + item.getMeal_comment() + item.getMeal() + item.getPrice() +item.getMeal_comment());
		}
	}

}


