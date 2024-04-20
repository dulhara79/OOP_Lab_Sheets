package com.tutorial.tutorial2.ex2;

public class Point3D {
	private double point1;
	private double point2;
	private double point3;
	private double distance;
	
	//overload constructor
	public Point3D(double point1, double point2, double point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	//calculate the distance
	public void distance() {
		double addDist;
		
		addDist = Math.sqrt((point1 * point1) + (point2 + point2) + (point3 * point3));
		
		this.distance = addDist;
	}
	
	//display entered values
	public void display() {
		System.out.println("Point 1 value: " + this.point1);
		System.out.println("Point 2 value: " + this.point2);
		System.out.println("Point 3 value: " + this.point3);
		System.out.println();
		System.out.printf("Distance: %.2f", this.distance);//print the double value in 2 decimal points
	}
}
