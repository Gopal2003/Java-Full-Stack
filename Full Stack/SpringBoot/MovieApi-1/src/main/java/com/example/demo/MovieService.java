package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;


//We use annotations so that the springboot recognize that this is a service.
@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movierepository;
	
	private List<Movie> movies = new ArrayList<>(Arrays.asList(
			new Movie("101","Kalki 2048AD","Story Of Mahabharata"),
			new Movie("102","Avengers","Story Of Marvel Avengers"),
			new Movie("103","Spider Far From Home","Story Of Spider-Man")
			));
	//Unsupported Operation Exception: because the List defined is static meaning it contains only and only 3 objects. In order to make it dynamic, we will use new keyword.
	
//	@GetMapping("/movies")
	public List<Movie> getMovies() {
		
		//Modify the Function to return Movie Object
//		return movies;
		
		//Creted an empty list of Movies type.
		List<Movie> movies = new ArrayList<>();
		
		movierepository.findAll() // findAll fetches all the rows from Table.
		.forEach(movies :: add);//forEach method traverse through each row of Table 1 by 1
		
		//movies::add expression calls Add Method for Each Row of Table.
		// and Add Each Row as List Object in movies List.
		//.forEach(row --> movies.add(row)) is same as .forEach(movies::add )
		return movies;
	}
	
	
//	@GetMapping("/movies/{id}")
	public Movie getMovieById(String id)
	{
//		Movie mv = movies.stream().filter(m -> m.getId().equals(id)).findFirst().get(); // findFirst is of type Optional<>. But our list is of type Movie. In order to convert from Optional to Movie, we use get.
		//For findFirst() understanding search in internet or read the description.
//		return mv;
		
		return movierepository.findById(id).get();
	}

	public void addMovie(Movie mov) {
		// TODO Auto-generated method stub
		movierepository.save(mov);
	}


	public void updateMovie(String id,Movie updatedMov) {
		// TODO Auto-generated method stub
		//Finding the Requested Movie.
//		Movie mv = movies.stream().filter(m -> m.getId().equals(id)).findFirst().get();
//		String updatedId = updatedMov.getId();
//		String updatedName = updatedMov.getName();
//		String updatedDescription = updatedMov.getDescription();
//		
//		//Updating the Movie information
//		mv.setId(updatedId);
//		mv.setName(updatedName);
//		mv.setDescription(updatedDescription);
		
		movierepository.save(updatedMov);
	}


	public void deleteMovieById(String id) {
		// TODO Auto-generated method stub
		movierepository.deleteById(id);
	}
	
	
}
