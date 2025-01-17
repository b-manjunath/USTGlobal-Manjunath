package com.ustglobal.productdetails.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdetails")
public class ProductDetails {
	@Id
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private int price;

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
	public int getPrice() {
		return price;
	}
	public  void setPrice(int price) {
		this.price = price;
	}

}
