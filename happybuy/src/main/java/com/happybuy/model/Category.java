package com.happybuy.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="CATEGORY")
public class Category {
	
	@Id
	@Column (name="id")
	@GeneratedValue
	private int id;

	@Column(name="name")
	private String name ;
		
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			mappedBy="category"
	)
	private List<Product> products = new ArrayList<Product>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
