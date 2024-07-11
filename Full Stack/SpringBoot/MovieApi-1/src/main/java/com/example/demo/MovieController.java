package com.example.demo;


//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Controllers are only ment for describing the route and calling the route.
//We need to seperate the business logic and route. Because every thing in controller including business logic is a bad practice.
// For that we will use service.
@RestController
public class MovieController {
	
	
	//Service
	//Service is a Java File Meant for containing the Business Logic of
	//Yout Project/
	//Controller is Meant for Containing only the EndPoints- (/moives),(/movies/{id})...
	
	@Autowired//Use dependencies injection- the object which is injected(movieservice) need not to be initialize with new keyword. That is take cared by sptingboot.
	private MovieService movieservice;
	
	@CrossOrigin // Allows to send and recieve the request from different servers. This Annotation removes the error of Cross Origin Resource Error.
	@GetMapping("/movies")
	public List<Movie> getMovies() {
		
		return movieservice.getMovies();
	}
	
	
	@GetMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable String id)
	{
		return movieservice.getMovieById(id);
	}
	
	@PostMapping("/movies")
	public String addMovie(@RequestBody Movie mov)
	{
		movieservice.addMovie(mov);
		
		return "Movie Added Successfully!";
	}
	
	@PutMapping("/movies/{id}")
	public String updateMovie(@PathVariable String id,@RequestBody Movie mov)
	{
		movieservice.updateMovie(id,mov);
		return "Movie Updated Successfully!";
	}
}
