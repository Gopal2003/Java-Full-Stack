package com.example.demo;


import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")// WOrks for GET and POST both
	public String greet() {
		return "<h2> Congratulations! You Have Successfully Created a SpringBootApp </h2> <hr/>";
	}
	
	String[] juices = {"Billsful Berry", "Tropical Sunset","Citrux Mint"};
	@GetMapping("/getJuices")// WOrks for GET only
	public String juices()
	{
		String rawHTML = "<h3> Popular Juices</h3><hr/> <ul>";
		
		for(String J : juices) {
			rawHTML += "<li>" + J + "</li>";
		}
		
		rawHTML += "</ul>";
		return rawHTML;
	}
	
	//This activity Explains How to Construct Parameterized URLs
	
	@GetMapping("/getbook/{id}")
	public String getBookByID(@PathVariable int id)
	{
		return "<h4> You Resquested for a Bood with ID: " + id + "</h4> <hr/>";
	}
	
	
	//Quick Activity:
	//Create a HashMap where key : BookID and value: BookTitle for 5 BOOKS
	//Input BookID via URL and Check if BookID is Present in HashMap
	//if Key Not Present an Error Message.
	//if Key is Present Return the BookTitle
	
	
	
	
	@GetMapping("/checkbook/{bookid}")
	public String checkBookWithBookID(@PathVariable int bookid)
	{
		HashMap<Integer,String> books = new HashMap<>();
		
		books.put(11, "Java Programming");
		books.put(12, "C Programming");
		books.put(13, "C++ Programming");
		books.put(14, "JavaScript Programming");
		books.put(15, "C# Programming");
		
		if(books.containsKey(bookid))
		{
			String bookName = books.get(bookid);
			String Message = "<h3>The Book name is  " + bookName + "</h3>";
			return Message;
		}
		
		else
		{
			return "<h3> No Book Found🥲 </h3>";
		}
	}
}
