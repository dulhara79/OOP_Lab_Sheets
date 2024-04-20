package com.tutorial.tutorial4.ex3;

public class AgeValidationDemo {
	private int age;
	
	public AgeValidationDemo() {
		this.age = 0;
	}
	
	public AgeValidationDemo(int age) {
		this.age = age;
	}
	
	public void validateAge() throws AgeValidationException {
		if(this.age < 0 || this.age > 120) {
			throw new AgeValidationException("\nAge is not within the valid range (0 to 120).");
		} else {
			System.out.println("Age in valid range");
		}
	}
	
	public static void main(String[] args) {
		AgeValidationDemo ageVal;
		ageVal = new AgeValidationDemo(130);
		try {
			ageVal.validateAge();
		} catch (AgeValidationException e) {
			e.printStackTrace();
		}
	}
}
