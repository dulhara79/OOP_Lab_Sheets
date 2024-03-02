package LabSheet01;

import java.util.Scanner;

public class Ex05_WhileLoop {
	public static void main(String args[]) {

		int row = 0, col;

		Scanner inpt = new Scanner(System.in);

		System.out.print("Enter number of lines you want to print: ");
		int line = inpt.nextInt();

		while (row < line) {

			col = 0;

			while (col < line) {

				System.out.print("* ");

				col++;
			}
			System.out.println();
			row++;
		}

	}
}
