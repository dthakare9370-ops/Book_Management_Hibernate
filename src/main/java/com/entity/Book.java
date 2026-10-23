package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Book {
	
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", name=" + name + ", price=" + price + "]";
	}

	@Id
	@Column(name = "book_id", nullable = false)
	private int bId;
	
	@Column(name = "book_name", nullable = false, unique = true)
	private String name;
	
	@Column(name = "book_price", nullable=false)
	private double price;
	
	public Book() {
		super();
	}
	
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
