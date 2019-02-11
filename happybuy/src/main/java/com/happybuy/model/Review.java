package com.happybuy.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.happybuy.reference.EReviewStatus;

@Entity
@Table(name = "review")
public class Review {
	
	@Id
	@Column (name="id")
	@GeneratedValue
	private long id;
	
	@Column (name="title")
	private String title;
	
	@Column (name="comment")
	private String comment;	
	
	@Column (name="rating")
	private int rating;
	
	@Enumerated(EnumType.STRING)
	@Column (name="status")
	private EReviewStatus status;
	
	@Column (name="create_date")
	private Date createDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Product product;		
	
	public Review () {
		
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

	public EReviewStatus getStatus() {
		return status;
	}

	public void setStatus(EReviewStatus status) {
		this.status = status;
	}	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCreateDate() {			
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String datefm = df.format(createDate);		
		return datefm;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}	
		
}
