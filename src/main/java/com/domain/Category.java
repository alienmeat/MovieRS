package com.domain;

public class Category {
	private int cid;
	private String cName;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cName=" + cName + "]";
	}
	
	
}
