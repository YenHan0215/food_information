package com.example.food_information.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.food_information.entity.Store;
import com.example.food_information.vo.StoreNameAndMealVo;


@Repository
public interface StoreDao extends JpaRepository<Store, String> {

	
//找出特定城市 列印出所有的店家資訊餐點資訊	
	@Modifying
	@Transactional
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
			+ "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment) " 
			+ " from Store as s JOIN Meal as m on s.storeName = m.storeName "
			+ " where s.city = :city")
	public List<StoreNameAndMealVo> findCityGetAll(@Param("city") String city);
	
	
	
//找出店家評等()以上 包含 列印出所有店家資訊 餐點資訊	
	@Transactional
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
	        + "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment)"
	        + " from Store as s JOIN Meal as m on s.storeName = m.storeName "
	        + " where s.storeComment between :range1 and :range2"
	        + " order by s.storeComment DESC")
	public List<StoreNameAndMealVo> findStoreComment(@Param("range1") double range1, @Param("range2") double range2);

//找出店家評等X以上 和 餐點X以上 列出該資訊	
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
	        + "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment)"
	        + " from Store as s JOIN Meal as m on s.storeName = m.storeName "
	        + " where s.storeComment between :range1 and :range2 "
	        + " And m.mealComment between :range3 and :range4"
	        + " order by s.storeComment DESC, m.mealComment Desc")
	public List<StoreNameAndMealVo> findStoreCommentAndMealCommentUP
	(@Param("range1") double range1, @Param("range2") double range2, @Param("range3")int range3, @Param("range4")int range4);
}
