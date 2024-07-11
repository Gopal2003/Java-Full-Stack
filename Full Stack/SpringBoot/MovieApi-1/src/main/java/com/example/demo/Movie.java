package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity and @Id are called JPA Annotations.

@Entity // class whcih represents the table name which is Movie here.
public class Movie {
	
	@Id // represents the primary key of the table.
	private String id;
	private String name;
	private String description;
	
	public Movie() {
		
	}
	public Movie(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
