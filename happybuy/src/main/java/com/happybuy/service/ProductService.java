package com.happybuy.service;

import java.util.List;

import com.happybuy.dto.RequestDataDTO;
import com.happybuy.model.Product;

public interface ProductService {
	
	List<Product> findAll();
	Product findById(int id);
	List<Product> findByColor(String color, String name);
	List<Product> findBySize(String size);
	List<Product> findLatest();
	List<Product> findProdByCate(RequestDataDTO<Integer> requestData);

}
