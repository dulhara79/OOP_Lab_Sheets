package com.labsheet.labsheet4.ex1;

public class Student {
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	private static int max = 100;

	public Student() { // create default constructor
		this.studentID = max;
		this.name = "NULL";
		this.degree = "NULL";
		this.mobile = "NULL";
		max++;
	}

	public Student(String name, String degree, String mobile) {
		this.studentID = max;
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		max++;
	}

	// create setters
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	// create getters
	public int getStudentID() {
		return this.studentID;
	}

	public String getname() {
		return this.name;
	}

	public String getDegree() {
		return this.degree;
	}

	public String getMobile() {
		return this.mobile;
	}

	// create print method
	public void print() {
		System.out.println("Student ID: " + this.studentID + "\nName: " + this.name + "\nDegree: " + this.degree
				+ "\nMobile no: " + this.mobile + "\n");
	}

	// get next student id
	public static int getNextStudentID() {
		return max;
	}

}
