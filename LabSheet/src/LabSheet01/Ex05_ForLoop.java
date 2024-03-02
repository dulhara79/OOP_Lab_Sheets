package LabSheet01;

import java.util.Scanner;

public class Ex05_ForLoop {
	public static void main(String args[]) {

		int row, col, line, space, space1;

		Scanner inpt = new Scanner(System.in);

		System.out.print("Enter number of lines you want to print: ");
		line = inpt.nextInt();

		space1 = line;

		for (row = 1; row <= line; row++) {

			for (space = space1; space >= 1; space--) {
				System.out.print(" ");
			}

			for (col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();

			space1--;

		}

	}
}
