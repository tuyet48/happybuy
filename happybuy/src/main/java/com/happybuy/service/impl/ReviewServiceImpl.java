package com.happybuy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happybuy.dto.ResponseDTO;
import com.happybuy.model.Product;
import com.happybuy.model.Review;
import com.happybuy.model.User;
import com.happybuy.reference.EReviewStatus;
import com.happybuy.reference.ErrorMessage;
import com.happybuy.repository.ProductRepository;
import com.happybuy.repository.ReviewRepository;
import com.happybuy.repository.UserRepository;
import com.happybuy.repository.impl.ProductRepositoryImpl;
import com.happybuy.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;

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

	@Override
	public ResponseDTO<Boolean> save(Review review) {
		ResponseDTO<Boolean> responseDTO = new ResponseDTO<Boolean>();
		responseDTO.setData(false);
		int prodId = review.getProduct().getId();
		Long userId = review.getUser().getId();
		List<Product> prodList = productRepository.findById(prodId);	
		User user =  userRepository.findOne(userId);
		if (prodList.isEmpty()) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_PRODUCT_NOT_EXIST);
		}else if (user == null) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_USER_NOT_EXIST);			
		}else {	
			review.setStatus(EReviewStatus.READY);
			review.setCreateDate(new Date());
			reviewRepository.save(review);
			responseDTO.setData(true);
		}
		return responseDTO;
	}

}
