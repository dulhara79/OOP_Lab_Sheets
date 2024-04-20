package com.tutorial.tutorial4.ex1;

public class Developer extends Employee {
	private double rate;
	private double hours;
	
	public Developer() {
		super("Teshan", 102);
		this.hours = 10;
		this.rate = 5000;
	}
	
	public double calculateSalary() {
		return this.hours * this.rate;
	}
	
	public void displayDetails() {
		System.out.println("Developer name: " + super.name);
		System.out.println("Developer ID: " + super.employeeId);
		System.out.println("Developer worked hours: " + this.hours);
		System.out.println("Developer's hourly rate: " + this.rate);
	}
}
