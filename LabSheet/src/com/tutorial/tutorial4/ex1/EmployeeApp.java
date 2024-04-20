package com.tutorial.tutorial4.ex1;

public class EmployeeApp {
	public static void main(String[] args) {
		Manager mng = new Manager();
		
		double managerSal = mng.calculateSalary();
		
		mng.displayDetails();
		System.out.println("Manager salary : " + managerSal);
		
		System.out.println();
		
		Developer dvlp = new Developer();
		
		double developerSal = dvlp.calculateSalary();
		
		dvlp.displayDetails();
		System.out.println("Developer salary : " + developerSal);
	}
	
}
