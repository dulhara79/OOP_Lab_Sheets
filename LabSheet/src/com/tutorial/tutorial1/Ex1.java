package com.tutorial.tutorial1;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		double number = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter integer number: ");
		double num = scn.nextDouble();
		number = num;
		if(num > 0) {
			for(double i = num; i > 1; --i) {
				num--;
				number *= num;
			}
		} else {
			number = 0;
			System.out.println("\nPlease enter positive number (except 0)!");
		}
		
		System.out.println("\nAnswer is: " + number);
	}
}
