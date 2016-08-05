package com.aqilix.learning.java;

import java.io.Serializable;

public abstract class Person implements Info, Serializable {
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
	
	public abstract void run();
	
	public abstract void jump();
}