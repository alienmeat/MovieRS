package com.domain;

public class MovieRating {
	private int id;
	private int movieId;
	private int rating;
	public MovieRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieRating [id=" + id + ", movieId=" + movieId + ", rating=" + rating + "]";
	}
	
}
