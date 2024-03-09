package com.labsheet.labsheet3.ex5_to_7;

public class Student extends Person{
	private String studentid;
	
	public Student(String name, String address, String studentid) {
		super(name, address);
		
		this.studentid = studentid;
	}
	
	public String getStudentid() {
		return this.studentid;
	}
}
