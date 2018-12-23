package com.happybuy.repository;

import java.util.List;

import com.happybuy.dto.RequestDataDTO;
import com.happybuy.model.Product;

public interface ProductRepository {
	
	List<Product> findAll();
	List<Product> findById(int id);
	List<Product> findByColor(String color, String name);
	List<Product> findBySize(String size);
	List<Product> findByCate(String cate);
	List<Product> findLatest();
	List<Product> findProdByCate(RequestDataDTO<Integer> requestData);

}
