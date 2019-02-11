package com.happybuy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.dto.ReviewDTO;
import com.happybuy.model.Review;
import com.happybuy.service.ReviewService;

@RestController
@RequestMapping("/no-auth/review/")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping(value = "find-all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ReviewDTO>> findAll(){
		List<Review> reviews = reviewService.findAll();		
		if (reviews == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			List<ReviewDTO> reviewDTOs = new ArrayList<ReviewDTO>();
			for (Review review: reviews) {
				ReviewDTO reviewDTO = new ReviewDTO();
				reviewDTO.copy(review);
				reviewDTOs.add(reviewDTO);
			}
			return new ResponseEntity<List<ReviewDTO>>(reviewDTOs, HttpStatus.OK);
		}		
	}
	
	@RequestMapping(value = "find-by-prod", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ReviewDTO>> findByProd(@RequestParam("productId") int id){
		List<Review> reviews = reviewService.findByProd(id);
		if(reviews == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			List<ReviewDTO> reviewDTOs = new ArrayList<ReviewDTO>();
			for (Review review: reviews) {
				ReviewDTO reviewDTO = new ReviewDTO();
				reviewDTO.copy(review);
				reviewDTOs.add(reviewDTO);
			}
			return new ResponseEntity<List<ReviewDTO>>(reviewDTOs, HttpStatus.OK);					
		}	
	}	

}
