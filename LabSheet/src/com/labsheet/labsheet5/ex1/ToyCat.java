package com.labsheet.labsheet5.ex1;

public class ToyCat extends Cat {
	String manufacture;

	public ToyCat() {
		System.out.println("ToyCat constructor called");
	}

	public ToyCat(String name, String manufacture) {
		super(name);
		this.manufacture = manufacture;
	}

	public void display() {
		super.display();
		System.out.println("I am from " + this.manufacture + ".\n");
	}
}
