package com.revature.pojo;

public class RealWall implements Wall {

	private String material;
	
	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material; 
	}

	public RealWall(String material) {
		super();
		this.material = material;
	}

	public RealWall() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RealWall [material=" + material + "]";
	}
	
}
