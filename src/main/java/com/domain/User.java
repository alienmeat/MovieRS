package com.domain;

public class User {
	private Integer userId;
	private String gender;
	private int age;
	private int occupation;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getOccupation() {
		return occupation;
	}
	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", gender=" + gender + ", age=" + age + ", occupation=" + occupation + "]";
	}
	
	
	
}
