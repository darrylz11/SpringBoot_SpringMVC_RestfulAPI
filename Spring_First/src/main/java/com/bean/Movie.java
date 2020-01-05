package com.bean;

public class Movie {

	private int year;
	private String movieName;
	private String director;
	
	
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(int year, String movieName, String director) {
		super();
		this.year = year;
		this.movieName = movieName;
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [year=" + year + ", movieName=" + movieName + ", director=" + director + "]";
	}
	
	
	
}
