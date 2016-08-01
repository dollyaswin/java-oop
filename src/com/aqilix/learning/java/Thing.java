package com.aqilix.learning.java;

public class Thing {
	public final static String uniqId = "ea34c183"; 
	
	private String name;
	
	public static String description;
	
	public static int count;

	public Thing() {
		count++;
	}
	
	public static void displayCounter() {
		System.out.println("Counter: " + count);
	}
	
	public static void displayInfo() {
		System.out.println(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayName()
	{
		System.out.println(this.name);
	}
	
	public String toString()
	{
		return uniqId + " " + this.name;
	}
}