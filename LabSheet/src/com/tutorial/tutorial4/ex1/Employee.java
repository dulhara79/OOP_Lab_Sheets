package com.tutorial.tutorial4.ex1;

public abstract class Employee {
	protected String name;
	protected int employeeId;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public abstract double calculateSalary();

	public abstract void displayDetails();
}
