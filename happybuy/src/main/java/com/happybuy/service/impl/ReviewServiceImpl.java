package com.happybuy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happybuy.model.Review;
import com.happybuy.repository.ReviewRepository;
import com.happybuy.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public List<Review> findByProd(int id) {
		List<Review> reviews = reviewRepository.findByProd(id);
		return reviews;
	}

	@Override
	public List<Review> findAll() {
		List<Review> reviews = reviewRepository.findAll();		
		return reviews;
	}

}
