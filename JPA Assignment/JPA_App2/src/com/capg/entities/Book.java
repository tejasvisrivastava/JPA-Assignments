package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Book extends Author {
	
	@Column(name="isbn")
	private int isbn;
	@Column(name="title")
	private String title;
	@Column(name="price")
	private int price;
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	public Book(int id,String name,int isbn, String title, int price) {
		super(id,name);
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public Book() {
		
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
