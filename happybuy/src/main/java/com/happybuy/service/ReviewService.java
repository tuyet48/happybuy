package com.happybuy.service;

import java.util.List;

import com.happybuy.dto.ResponseDTO;
import com.happybuy.model.Review;

public interface ReviewService {
	List<Review> findAll();
	List<Review> findByProd(int id);
	ResponseDTO<Boolean> save(Review review);
}
