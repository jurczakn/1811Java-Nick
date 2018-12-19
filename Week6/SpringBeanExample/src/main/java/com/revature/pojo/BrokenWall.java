package com.revature.pojo;

public class BrokenWall implements Wall {

	public String getMaterial() {
		return "This wall is broken";
	}

	public void setMaterial(String material) {
	}

	@Override
	public String toString() {
		return "BrokenWall [material=" + getMaterial() + "]";
	}

	public BrokenWall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
