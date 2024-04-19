package com.tutorial.tutorial3.ex2;

public class Main {
	public static void main(String[] args) {
		Feet mylength = new Feet(5, 6);
		Feet newlen = new Feet(6, 7);
//		mylength.add(newlen);
//		mylength.print("Length: "); // 12’1”
		
//		Feet.print(mylength);

		Feet f5 = Feet.addFeet(mylength, newlen, mylength);
		Feet.print(f5);
	}
}
