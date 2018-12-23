package com.happybuy.dto;

import com.happybuy.model.Category;

public class CategoryDTO {

	private int id;
	private String name;

	public void copy(Category category) {
		this.id = category.getId();
		this.name = category.getName();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
