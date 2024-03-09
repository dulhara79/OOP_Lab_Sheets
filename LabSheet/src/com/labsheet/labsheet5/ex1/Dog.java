package com.labsheet.labsheet5.ex1;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Dog constructor called");
	}

	public Dog(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return "Bow Bow";
	}
}
