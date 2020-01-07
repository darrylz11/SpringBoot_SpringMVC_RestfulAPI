package com.hello;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Movie;
import com.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "hello world";
	}
	
	@RequestMapping("/movies")
	public List<Movie> list(){
		return helloService.getMovieList();
	}
	
	@RequestMapping(value="/addMovie" , method=RequestMethod.POST)
	public void addMovie(@RequestBody Movie movie) {
		 helloService.addMovie(movie);
	}
	
	@RequestMapping(value="/updateMovie/{id}" , method=RequestMethod.PUT)
	public void updateMovie(@RequestBody Movie movie, @PathVariable String id) {
		System.out.println("inside update controller");
		 helloService.updatemovie(movie,id);
	}
	
	
	
	

}
