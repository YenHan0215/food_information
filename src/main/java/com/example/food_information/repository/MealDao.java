package com.example.food_information.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.food_information.entity.Meal;

@Repository
public interface MealDao extends JpaRepository<Meal, Integer>{

//判斷餐點以及店名 是否已存在
	public Boolean existsByStoreNameAndMeal(String StoreName, String meal);
	
//修改餐點名稱
	@Modifying
	@Transactional
	@Query(value = "update meal set meal = :newMeal where store_name = :storeName and meal = :oldMeal", nativeQuery = true)
	public int updateMealName(@Param("storeName")String storeName, @Param("oldMeal")String oldMeal, @Param("newMeal")String newMeal);

//更新店家評等	
	@Modifying
	@Transactional
	@Query(value = "UPDATE store " +
	       "SET store.store_comment = ROUND((SELECT AVG(meal.meal_comment) FROM meal WHERE meal.store_name = :storeName), 1) " +
	       "WHERE store.store_name = :storeName", nativeQuery = true)
	public int updateStoreComment(@Param("storeName") String storeName);

}


