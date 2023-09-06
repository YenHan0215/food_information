package com.example.food_information.vo;

import com.example.food_information.entity.Store;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class AddStoreRes {

	private String code;

	private String message;

	private Store store;

	public AddStoreRes() {
		super();
	}

	public AddStoreRes(String code, String message, Store store) {
		super();
		this.code = code;
		this.message = message;
		this.store = store;
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
