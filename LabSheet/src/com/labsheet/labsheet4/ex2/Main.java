package com.labsheet.labsheet4.ex2;

public class Main {
	public static void main(String[] args) {

		Feet f1 = new Feet(5, 6); //Check overload constructor
		Feet f2 = new Feet(6, 7);
		Feet f3 = new Feet(3, 6);
		Feet f4 = new Feet();
		
		f4.add(f1, f2); //Add 2 objects
		f4.print("F4 = F1 + F2 \n");
		
		Feet f5 = Feet.add(f1, f2, f3); //Add 3 objects
		f5.print(f5); // check static print method
		
		f1.print("Length: "); //Check print method passing string
		
		Feet f7 = new Feet(f1); //Coppy the content of f7 to new print object: 
		f7.print("Coppy the content of f7 to new print object: ");
		
		f4.add(f1); //add feet and inches
		f4.print("Add feet and inches in f1: ");
	
	}
}