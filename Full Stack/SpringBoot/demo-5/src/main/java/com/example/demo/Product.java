package com.example.demo;

public class Product {
	private int ID;
	private String Title;
	private String Description;
	
	public Product(int iD, String title, String description) {
		super();
		ID = iD;
		Title = title;
		Description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
