package com.tutorial.tutorial3_ex1;

public class Student {
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	private static int max = 100;
	
	public Student() {
		this.studentID = this.max;
		this.name = "NULL";
		this.degree = "NULL";
		this.mobile = "NULL";
		this.max++;
	}
	
	public Student(String name, String degree, String mobile) {
		this.studentID = this.max;
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		this.max++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void setmobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return this.name;
	}
	public String getDegree() {
		return this.degree;
	}
	public String getMobile() {
		return this.degree;
	}
	
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Student ID: " + this.studentID);
		System.out.println("Degree: " + this.degree);
		System.out.println("Mobile no.: " + this.mobile);
	}
	
	public static int getNextStudentID() {
		return max++;
	}
	
	
}
