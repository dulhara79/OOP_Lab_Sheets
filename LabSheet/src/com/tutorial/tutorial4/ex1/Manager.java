package com.tutorial.tutorial4.ex1;

public class Manager extends Employee {
	private double salary;
	private String position;
	
	public Manager() {
		super("Naveen", 101);
		this.salary = 95000;
		this.position = "TL";
	}
	
	public double calculateSalary() {
		return this.salary;
	}
	
	public void displayDetails() {
		System.out.println("Manager name: " + super.name);
		System.out.println("Manager ID: " + super.employeeId);
		System.out.println("Manager position: " + this.position);
	}
}
