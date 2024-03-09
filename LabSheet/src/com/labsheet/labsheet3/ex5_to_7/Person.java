package com.labsheet.labsheet3.ex5_to_7;

public class Person {
	private String name;
	public String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void showDetails() {
		System.out.println("Name: " + this.name + "\nAddress: " + this.address + "\n");
	}
}
