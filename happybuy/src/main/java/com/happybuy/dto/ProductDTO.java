package com.happybuy.dto;

import java.math.BigDecimal;

import com.happybuy.model.Product;

public class ProductDTO {
	
	private int id;
	private String brand;
	private String name;
	private String img;
	private BigDecimal regularPrice;
	private BigDecimal salePrice;
	private String size;
	
	
	public void copy(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.brand = product.getBrand();
		this.img = product.getImage();
		this.regularPrice = product.getRegularPrice();
		this.salePrice = product.getSalePrice();	
		this.size = product.getSize();		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
	
	

}
