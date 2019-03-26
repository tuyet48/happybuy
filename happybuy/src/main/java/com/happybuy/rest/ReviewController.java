package com.happybuy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.happybuy.dto.ResponseDTO;
import com.happybuy.dto.ReviewDTO;
import com.happybuy.model.Review;
import com.happybuy.reference.ErrorMessage;
import com.happybuy.service.ReviewService;

@RestController
@RequestMapping("/rest/no-auth/review/")
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
	
	public ResponseDTO<Boolean> validate(ReviewDTO reviewDTO){
		ResponseDTO<Boolean> responseDTO = new ResponseDTO<Boolean>();
		responseDTO.setData(false);
		if (reviewDTO.getTitle().length() == 0 || reviewDTO.getTitle().isEmpty()) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_TITLE_EMPTY);
		}else if(reviewDTO.getComment().length() == 0 || reviewDTO.getComment().isEmpty()) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_COMMENT_EMPTY);		
		}else if (reviewDTO.getRating() <1 || reviewDTO.getRating() >5 ) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_RATING_INVALID);
		}else if (reviewDTO.getUserId() == null) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_USERID_EMPTY);
		}else if (reviewDTO.getProdId() == null) {
			responseDTO.setErrorMessage(ErrorMessage.ERROR_PRODUCTID_EMPTY);
		}else {
			responseDTO.setData(true);
		}
		return responseDTO;
	}	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ResponseDTO<Boolean>> save(@RequestBody ReviewDTO reviewDTO){
		ResponseDTO<Boolean> responseDTO = validate(reviewDTO);
		if (!responseDTO.getData()) {
			return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.BAD_REQUEST);
		}else {
			Review review = reviewDTO.copyTo();
			responseDTO = reviewService.save(review);
			if(!responseDTO.getData()) {
				return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<ResponseDTO<Boolean>>(responseDTO, HttpStatus.OK);
		}
	}	

}
