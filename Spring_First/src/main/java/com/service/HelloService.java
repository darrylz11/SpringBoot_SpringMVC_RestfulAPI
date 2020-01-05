package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Movie;

@Service
public class HelloService {
	
	List<Movie> movieList=new ArrayList<Movie>(Arrays.asList(new Movie(2000,"dark night", "james camron"),new Movie(2020,"batman bengins", "martin scorseci"),new Movie(2012,"dark night rises", "cris nolan")));
	
	
	public List<Movie> getMovieList() {
		// TODO Auto-generated method stub
		return movieList;
	}


	public void addMovie(Movie movie) {
		// TODO Auto-generated method stu
		movieList.add(movie);
		
	}

}
