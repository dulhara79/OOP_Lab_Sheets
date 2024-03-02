package LabSheet01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int num1, num2, sum;
		double avg;

		Scanner in = new Scanner(System.in); // create scanner object

		// taking user inputs
		System.out.print("Enter 1st number: ");
		num1 = in.nextInt();
		System.out.print("Enter 2nd number: ");
		num2 = in.nextInt();

		// calculations
		sum = num1 + num2;
		avg = sum / 2.0;

		// print outputs
		System.out.println("Summation of the numbers: " + sum);
		System.out.println("Avarage of the numbers: " + avg);
	}
}