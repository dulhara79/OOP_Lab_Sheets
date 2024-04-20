package com.tutorial.tutorial1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = scn.next();

		char sentence[] = new char[str.length()];
		
		int lastIndex = str.length() - 1;
		
		for (int i = 0; i < str.length(); i++) {
			char word = str.charAt((lastIndex - i));
			
			sentence[i] = word;
		}
		
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(sentence[i]);
		}
	}
}
