package com.example.inheritance;

public class SuperHero {

	// final on a class means you cannot have children
	// final on a variable means you cannot change it

	String ability = "Flying";
	String name = "Super Calebh";
	String alias = "C-Dawg";
	String weakness = "Java";

	public SuperHero() {
//		System.out.println("In SuperHero constructor()");
	}

	public SuperHero(String a) {
//		System.out.println("In SuperHero constructor(String)");
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void alterweakness() {
		weakness = "cheese";
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public Object getName() { // covariant return types
		return name; // can only go narrower, not the
						// other way around
	}
}
