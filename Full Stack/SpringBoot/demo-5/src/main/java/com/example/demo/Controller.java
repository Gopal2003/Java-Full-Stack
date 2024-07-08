package com.example.demo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value="/product/{id}" , produces="application/json")
	public Product GetProductByID(@PathVariable int id)
	{
		if(id == 1)
		{
			return new Product(1,"iPhone","Apples and Selling Product - A SmartPhone");
		}
		else if(id == 2)
		{
			return new Product(2,"MacBook","All Purpose Laptop");
		}
		else if(id == 3)
		{
			return new Product(3,"airPods","Best in Class Audio Quality");
		}
		else
		{
			return null;
		}
	}
	
	@GetMapping("/generator/{number}")
	public String generateTable(@PathVariable int number)
	{
		String rawHTML = "<h2> Table of " + number + " is </h2><hr/>";
		for(int i = 1; i <= 10; i++)
		{
			int val = i * number;
			rawHTML += "<p> " + number + " * " + i + "= " + (val) +" </p>";
		}
		
		return rawHTML;
	}
	
	ArrayList<User> aL = new ArrayList<>();
	//Post Request.
	@PostMapping("/adduser")
	public String createUser(@RequestBody User user)
	{
		aL.add(user);
		return "User Created: "+ user.getName();
	}
	
	@GetMapping(value="/getuser", produces="application/json")
	public List<User> getUsers()
	{
		List<User> users = new ArrayList<>();
		int userCount = 1;
		
		//Iterating over the loop to get the user details.
		for(User u : aL)
		{
			users.add(new User(u.getId(),u.getName(),u.getEmail(),u.getPassword()));
//			users.add("user: " + userCount); 
//			users.add("UserID: " + Integer.toString(u.getId()));
//			users.add("UserName: " + u.getName());
//			users.add("UserEmail: " + u.getEmail());
//			users.add("UserPassword: " + u.getPassword());
//			
//			userCount++;
		}
		
		
		
		return users;
	}
	
	
	// PUT Request to Server
	//Put Request is sent to server for updating Existing User.
	@PutMapping("/updateuser/{id}")
	public String updateUser(@PathVariable int id,@RequestBody User user)
	{
		//Iterating over the ArrayList to find the object with the mentioned ID.
		for(User u : aL)
		{
			if(u.getId() == id)
			{
				u.setId(user.getId());
				u.setName(user.getName());
				u.setEmail(user.getEmail());
				u.setPassword(user.getPassword());
			}
		}
		return "User Update: " + user.getName();
	}
	
	//DELETE Request to Server
	//Delete Reqeuest is Sent to Server for Deleting / Removing an Existing Object.
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id)//,@RequestBody User user
	{
		//Index Variable to delete the object from the ArrayList.
		int index = 0;
		//Iterating over the ArrayList to find the object with the mentioned ID.
		for(User u : aL)
		{
			if(u.getId() == id)
			{
				//Performing remove operation in ArrayList which removes the object which matches the mentioned id from particular index. 
				aL.remove(index);
				break;
			}
			index++;
		}
		
		return "User Deleted Successfully";
	}
	
	//CRUD Operations:
	//Create: Post
	//Read: Get
	//Update: Put
	//Delete: Delete.
}
