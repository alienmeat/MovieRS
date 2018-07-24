package com.domain;

import java.sql.Timestamp;

public class WatchRecord {
	private int id;
	private int userId;
	private int movieId;
	private Timestamp time;
	public WatchRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "WatchRecord [id=" + id + ", userId=" + userId + ", movieId=" + movieId + ", time=" + time + "]";
	}
	
}
