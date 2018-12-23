package com.happybuy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.dto.CategoryDTO;
import com.happybuy.model.Category;
import com.happybuy.service.CategoryService;

@RestController
@RequestMapping("/no-auth/category/")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "find-all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<CategoryDTO>> findAll() {
		List<Category> categories = categoryService.findAll();			
		if (categories == null) {			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			List<CategoryDTO> categoryDtos = new ArrayList<CategoryDTO>();
			for (Category cate : categories) {
				CategoryDTO cateDto = new CategoryDTO();
				cateDto.copy(cate);
				categoryDtos.add(cateDto);
			}
			return new ResponseEntity<List<CategoryDTO>>(categoryDtos, HttpStatus.OK);
		}
	}
}
