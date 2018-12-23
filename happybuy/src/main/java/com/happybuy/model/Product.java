package com.happybuy.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.happybuy.common.HBStatus;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@Column (name="id")
	@GeneratedValue
	private int id;

	@Column(name="brand")
	private String brand ;
	
	@Column (name="name")
	private String name;
	
	@Column (name="regular_price")
	private BigDecimal regularPrice;
	
	@Column (name="sale_price")
	private BigDecimal salePrice;
	
	@Column (name="image")
	private String image;
	
	@Column (name="size")
	private String size;
	
	@Column (name="color")
	private String color;
	
	@Column (name="quantity")
	private int quantity;	
	
	@Column (name="create_date")
	private Date createDate;
	
	@Column (name="status")
	private HBStatus status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;	
	
	public Date getCreateDate() {
		return createDate;
	}	

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public HBStatus getStatus() {
		return status;
	}

	public void setStatus(HBStatus status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(BigDecimal regularPrice) {
		this.regularPrice = regularPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
