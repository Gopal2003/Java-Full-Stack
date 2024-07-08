package myspringproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/hello")
	public String greet() {
		return "<h2> Congratulations! You Have Successfully Created a SpringBootApp </h2> <hr/>";
	}
	
}
