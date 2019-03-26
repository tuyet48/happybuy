package com.happybuy.dto;

import com.happybuy.model.Product;
import com.happybuy.model.Review;
import com.happybuy.model.User;

public class ReviewDTO {
	
	private long id;
	
	private String title;
	
	private String comment;
	
	private int rating;
	
	private String createDate;
	
	private Integer prodId;
	
	private Long userId;
	
	public void copy(Review review){
		this.id = review.getId();
		this.title = review.getTitle();
		this.comment = review.getComment();
		this.rating = review.getRating();
		this.createDate = review.getCreateDate();
	}
	
	public Review copyTo(){
		Review review = new Review();
		review.setTitle(title);
		review.setComment(comment);
		review.setRating(rating);
		Product prod = new Product();
		prod.setId(prodId);
		review.setProduct(prod);
		User user = new User();
		user.setId(userId);
		review.setUser(user);
		return review;		
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
