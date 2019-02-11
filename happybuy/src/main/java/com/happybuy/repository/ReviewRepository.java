package com.happybuy.repository;

import java.util.List;

import com.happybuy.model.Review;

public interface ReviewRepository {
	List<Review> findAll();	
	List<Review> findByProd(int id);

}
