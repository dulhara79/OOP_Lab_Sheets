package com.labsheet.labsheet3.ex1_to_4;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Kaushalya", "IT002", "Homagama");
		Student s3 = new Student();
		
		s3.setName("Test1");
		s3.setDit("Test2");
		s3.setAddress("Test3");
		
		String nameS1 = s1.getName();
		String ditS1 = s1.getDit();
		String addressS1 = s1.getAddress();
		
		String nameS2 = s2.getName();
		String ditS2 = s2.getDit();
		String addressS2 = s2.getAddress();
		
		String nameS3 = s3.getName();
		String ditS3 = s3.getDit();
		String addressS3 = s3.getAddress();
		
		String details = s3.getDetails();
		
		System.out.println("Name: " + nameS1 + "\nDIT: " + ditS1 + "\nAddress: " + addressS1);
		System.out.println("\nName: " + nameS2 + "\nDIT: " + ditS2 + "\nAddress: " + addressS2 + "\n");
//		System.out.println("\nName: " + nameS3 + "\nDIT: " + ditS3 + "\nAddress: " + addressS3);
		System.out.println(details);
		
	}
}
