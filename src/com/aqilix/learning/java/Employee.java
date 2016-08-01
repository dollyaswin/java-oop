package com.aqilix.learning.java;

public class Employee extends Person {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Id: " + this.getId());
	}
}
