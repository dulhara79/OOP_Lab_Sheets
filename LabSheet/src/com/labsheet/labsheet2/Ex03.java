package com.labsheet.labsheet2;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the height : ");
		float height = in.nextFloat();
		System.out.print("Enter the width : ");
		float width = in.nextFloat();
		System.out.print("Enter the length : ");
		float length = in.nextFloat();

		System.out.println("Cube is : " + length * width * height);
		
		in.close();
	}
}