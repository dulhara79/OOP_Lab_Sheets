package com.tutorial.tutorial1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		int count = 0;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = scn.next();

		System.out.print("Enter character that you want to count: ");
		char ltr = scn.next().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			char strChar = str.charAt(i);

			if (strChar == ltr) {
				count++;
			}

		}

		System.out.println("Character count: " + count);
	}
}
