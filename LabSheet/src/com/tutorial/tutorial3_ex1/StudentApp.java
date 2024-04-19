package com.tutorial.tutorial3_ex1;

public class StudentApp {
	public static void main(String[] args) {
		Student students[] = new Student[5];

		for (int i = 0; i < 5; i++) {
			students[i] = new Student();
			students[i].setName("Dulhara");
			students[i].setDegree("IT");
			students[i].setmobile("123456789");
		}
		for (int i = 0; i < 5; i++) {
			students[i].print();
		}

		/*
		 * for (int i = 0; i < 5; i++) { students[i] = new Student("Dulhara", "IT",
		 * "123456789"); }
		 * 
		 * for (int i = 0; i < 5; i++) { students[i].print(); }
		 */

	}
}
