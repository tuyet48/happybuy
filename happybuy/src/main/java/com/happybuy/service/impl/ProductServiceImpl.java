package com.happybuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happybuy.dto.RequestDataDTO;
import com.happybuy.model.Product;
import com.happybuy.repository.ProductRepository;
import com.happybuy.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public Product findById(int id) {
		List<Product> products = productRepository.findById(id);
		return products.get(0);
	}

	@Override
	public List<Product> findByColor(String color, String name) {
		List<Product> products = productRepository.findByColor(color, name);
		return products;
	}

	@Override
	public List<Product> findBySize(String size) {
		List<Product> products = productRepository.findBySize(size);
		return products;
	}

	@Override
	public List<Product> findLatest() {		
		return null;
	}

	@Override
	public List<Product> findProdByCate(RequestDataDTO<Integer> requestData) {
		List<Product> products = productRepository.findProdByCate(requestData);	
		return products;
	}	
	

}
