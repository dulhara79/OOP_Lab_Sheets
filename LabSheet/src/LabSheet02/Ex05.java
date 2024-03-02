package LabSheet02;

import java.util.Scanner;

class EvenOddNumber  {
	public boolean findEvenOrOdd(int i) {
		return i % 2 == 0;
	}
}

public class Ex05 {
	    public static void main(String[] args) {
	        EvenOddNumber evenOddNumber = new EvenOddNumber();
			Scanner in = new Scanner(System.in);

	        System.out.print("Enter a number: ");
			int number = in.nextInt();
			
	        boolean isNumberEven = evenOddNumber.findEvenOrOdd(number);
			
	        System.out.println("The number is " + (isNumberEven ? "even" : "odd"));

	        in.close();
	    }
}