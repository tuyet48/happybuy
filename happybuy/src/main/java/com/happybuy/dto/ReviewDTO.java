package com.happybuy.dto;

import com.happybuy.model.Review;

public class ReviewDTO {
	
	private long id;
	
	private String title;
	
	private String comment;
	
	private int rating;
	
	private String createDate;
	
	public void copy(Review review){
		this.id = review.getId();
		this.title = review.getTitle();
		this.comment = review.getComment();
		this.rating = review.getRating();
		this.createDate = review.getCreateDate();
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
