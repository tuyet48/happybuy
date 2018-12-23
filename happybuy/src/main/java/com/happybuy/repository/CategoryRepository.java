package com.happybuy.repository;

import java.util.List;

import com.happybuy.model.Category;

public interface CategoryRepository {
	
	List<Category> findAll();
}
