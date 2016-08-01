package com.aqilix.learning.java;

public class Person implements Info{
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void move(String direction, double distance) {
		System.out.println("Move to " + direction + " with distance " + distance);
	}
	
	public void displayInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
	}
}