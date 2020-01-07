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


	public void updatemovie(Movie movie, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<movieList.size();i++) {
			System.out.println("inside update"+id);
			System.out.println("movie is"+movie);
			Movie m=movieList.get(i);
			System.out.println("movie is 2"+m);
			int year=m.getYear();
			System.out.println("year is"+year);
			if(id.equalsIgnoreCase(String.valueOf(year))) {
				System.out.println("inside if");
				movieList.set(i, movie);
			}
		}
		
	}

}
