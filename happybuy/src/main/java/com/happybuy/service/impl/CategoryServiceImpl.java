package com.happybuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import com.happybuy.model.Category;
import com.happybuy.repository.CategoryRepository;
import com.happybuy.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll(){		
		List<Category> categories = categoryRepository.findAll();		
		return categories;
	}

}
