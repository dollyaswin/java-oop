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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return this.getId() + ": " + this.getName();
	}
	
	
}
