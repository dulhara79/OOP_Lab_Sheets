package com.tutorial.tutorial3.ex2;

public class Feet {
	private int feet;
	private int inches;

	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public Feet(Feet f1) {
	}

	public void add(Feet f2) {
		int feet = this.feet + f2.feet;
		int inch = this.inches + f2.inches;

		if (inch >= 12) {
			int temFeet = inch / 12;
			int temInch = inch - (temFeet * 12);

			this.inches = temInch;
			this.feet = feet + temFeet;
		} else {
			this.feet = feet;
			this.inches = inch;
		}

	}

	// Add f1+f2 feet and store in current feet
	public void add(Feet f1, Feet f2) {
	}

	// Display a Length e.g 5’6”
	public void print(String msg) {
		System.out.println(msg + this.feet + "' " + this.inches + "\"");
	}
	
	public static void print(Feet f3) {
		System.out.println(f3.feet + "' " + f3.inches + "\"");

	}
	
	public static Feet addFeet(Feet f4, Feet f5, Feet f6) {
		int sumFeet, sumInch;
		int feet = f4.feet + f5.feet + f6.feet;
		int inch = f4.inches + f5.inches + f6.inches;
		
		if (inch >= 12) {
			int temFeet = inch / 12;
			int temInch = inch - (temFeet * 12);

			sumInch = temInch;
			sumFeet = feet + temFeet;
		} else {
			sumFeet = feet;
			sumInch = inch;
		}
		
		return new Feet(sumFeet, sumInch);
	}

}
