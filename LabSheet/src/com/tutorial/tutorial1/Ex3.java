package com.tutorial.tutorial1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scn.nextInt();
		
		System.out.println();
		System.out.println("Answer: ");
		
		for (int i = 1; i <= 12; i++) {
			int mult = num * i;
			
			//advanced but clear
			//System.out.printf("%-2d %2c %3d %-2c %-5d\n", i, 'X', num, '=', mult);
			
			System.out.println(i + " X " + num + " = " + mult);
		}
	}
}
