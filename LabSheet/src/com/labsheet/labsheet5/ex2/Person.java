package com.labsheet.labsheet5.ex2;

public class Person implements ICompute {
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}
	
	@Override
	public void calculate() {
		this.netSal = this.basicSal + (this.otHrs * this.otRate);
	}
	
	@Override
	public void display() {
		System.out.println("Name: " + this.name + "\nNet Salary: " + this.netSal + "\n");
	}
}
