package com.revature.pojo;

public class House {
	
	private String name;
	
	private Wall wall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wall getWall() {
		return wall;
	}

	public void setBrokenWall(Wall wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", wall=" + wall + "]";
	}

	public House(String name, Wall wall) {
		super();
		this.name = name;
		this.wall = wall;
	}

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

}
