package com.example.food_information.vo;

import java.util.List;

public class StoreNameAndMealRes {

	private String code;

	private String message;

	private List<StoreNameAndMealVo> storeNameAndMealVO;

	public StoreNameAndMealRes() {
		super();
	}

	public StoreNameAndMealRes(String code, String message, List<StoreNameAndMealVo> storeNameAndMealVO) {
		super();
		this.code = code;
		this.message = message;
		this.storeNameAndMealVO = storeNameAndMealVO;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<StoreNameAndMealVo> getStoreNameAndMealVO() {
		return storeNameAndMealVO;
	}

	public void setStoreNameAndMealVO(List<StoreNameAndMealVo> storeNameAndMealVO) {
		this.storeNameAndMealVO = storeNameAndMealVO;
	}
	
	
}
