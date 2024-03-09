package com.labsheet.labsheet3.ex5_to_7;

public class InheritanceDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Dulhara", "Colombo");
		
		Student s1 = new Student("Kaushalya", "Gampaha", "IT004");
		
		PartTimeStudent ps1 = new PartTimeStudent("Noname", "Thumpane", "IT005", 3);
		
		p1.showDetails();
		s1.showDetails();
		ps1.showDetails();
	}
}
