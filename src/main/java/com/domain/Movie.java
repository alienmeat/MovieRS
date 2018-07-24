package com.domain;

import java.util.HashSet;
import java.util.Set;

public class Movie {
	private Integer movieId;
	private String movieName;
	private String intro;
	private String year;
	private String director;
	private String actor;
	private Set<Category> categories=new HashSet<Category>();
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", intro=" + intro + ", year=" + year
				+ ", director=" + director + ", actor=" + actor + ", categories=" + categories + "]";
	}
	
	
}
