package com.happybuy.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.happybuy.model.Image;
import com.happybuy.model.Product;

public class ProductDTO {
	
	private int id;
	private String brand;
	private String name;
	private String img;
	private BigDecimal regularPrice;
	private BigDecimal salePrice;
	private String size;
	private String color;
	
	private List<String> images = new ArrayList<String>();	
		
	public void copy(Product product) {
		this.id = product.getId();
		this.name = product.getName();
		this.brand = product.getBrand();
		this.img = product.getImage();
		this.regularPrice = product.getRegularPrice();
		this.salePrice = product.getSalePrice();	
		this.size = product.getSize();	
		this.color = product.getColor();
		List<Image> ims = product.getImages();
		for (Image image: ims) {
			images.add(image.getImage());			
		}
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
