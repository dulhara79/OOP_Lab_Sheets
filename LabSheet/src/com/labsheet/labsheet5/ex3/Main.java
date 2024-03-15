package com.labsheet.labsheet5.ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int maxSubjects = 1;
		int[] marks = new int[5];
		int total = 0;
		double avg = 0;

		Scanner scn = new Scanner(System.in);

		// 1. Input a value for maxSubjects from keyboard
		// 2. Using a for loop input marks
		// 3. Calculate the avg marks
		// 4. Use a try catch block to prevent the following run time errors
		// (a) Input valid integers to the inputs
		// (b) ArithmeticException division by zero
		// (c) ArrayIndexOutOfBounds Exception

		try {
			System.out.print("Enter a value for maxSubjects: ");
			maxSubjects = scn.nextInt();

			for (int i = 0; i < maxSubjects; i++) {
				System.out.print("Enter marks for subject " + (i + 1) + ": ");
				marks[i] = scn.nextInt();
				total += marks[i];
			}

			avg = (double) total / maxSubjects;

			System.out.println("Total marks: " + total);
			System.out.println("Avarage of marks: " + avg);

		} catch (ArithmeticException e) { // (b) ArithmeticException division by zero
			System.out.println("ArithmeticException division by zero: " + e);
		} catch (InputMismatchException e) { // (a) Input valid integers to the inputs
			System.out.println("Input valid integers to the inputs: " + e);
		} catch (ArrayIndexOutOfBoundsException e) { // (c) ArrayIndexOutOfBounds Exception
			System.out.println("ArrayIndexOutOfBounds Exception: " + e);
		} catch (Exception e) { //To catch another big exceptions
			System.out.println("ERROR: " + e);
		}

		finally {
			System.out.println("This code will be gurrentied to run");
		}

		System.out.println("The end");

		scn.close();

	}
}
