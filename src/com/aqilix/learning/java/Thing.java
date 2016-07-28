package com.aqilix.learning.java;

public class Thing {
	public final static String uniqId = "ea34c183"; 
	
	private String name;
	
	public static String description;
	
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
}