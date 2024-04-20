package com.tutorial.tutorial2.ex1;

public class Ex1 {
	private String name;
	private String sID;
	private double sub1;
	private double sub2;
	private double sub3;
	private double avgMarks;
	
	public Ex1() {
		this.sub1 = 0.0;
		this.sub2 = 0.0;
		this.sub3 = 0.0;
	}
	
	public Ex1(String name, String sID, double sub1, double sub2, double sub3) {
		this.name = name;
		this.sID = sID;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void calcAvg() {
		double total;
		
		total = this.sub1 + this.sub2 + this.sub3;
		
		this.avgMarks = total / 3;
	}
	
	public void disDetails() {
		System.out.println("Student ID: " + this.sID);
		System.out.println("Name: " + this.name);
		System.out.printf("Avarage marks: %.2f", this.avgMarks);
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1("Sirisoma", "ST001", 50.3, 45.0, 68.0);
		
		ex1.calcAvg();
		
		ex1.disDetails();
	}
}
