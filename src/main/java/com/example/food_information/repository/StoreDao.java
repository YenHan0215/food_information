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

	
//��X�S�w���� �C�L�X�Ҧ������a��T�\�I��T	
	@Modifying
	@Transactional
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
			+ "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment) " 
			+ " from Store as s JOIN Meal as m on s.storeName = m.storeName "
			+ " where s.city = :city")
	public List<StoreNameAndMealVo> findCityGetAll(@Param("city") String city);
	
	
	
//��X���a����()�H�W �]�t �C�L�X�Ҧ����a��T �\�I��T	
	@Transactional
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
	        + "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment)"
	        + " from Store as s JOIN Meal as m on s.storeName = m.storeName "
	        + " where s.storeComment between :range1 and :range2"
	        + " order by s.storeComment DESC")
	public List<StoreNameAndMealVo> findStoreComment(@Param("range1") double range1, @Param("range2") double range2);

//��X���a����X�H�W �M �\�IX�H�W �C�X�Ӹ�T	
	@Query(value = "select new com.example.food_information.vo.StoreNameAndMealVo"
	        + "(s.storeName, s.city, s.storeComment, m.meal, m.price, m.mealComment)"
	        + " from Store as s JOIN Meal as m on s.storeName = m.storeName "
	        + " where s.storeComment between :range1 and :range2 "
	        + " And m.mealComment between :range3 and :range4"
	        + " order by s.storeComment DESC, m.mealComment Desc")
	public List<StoreNameAndMealVo> findStoreCommentAndMealCommentUP
	(@Param("range1") double range1, @Param("range2") double range2, @Param("range3")int range3, @Param("range4")int range4);
}
