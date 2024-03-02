package LabSheet01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String args[]) {

		int outRow, col, trSp;
		int tr = 1, lp = 1;

		Scanner inpt = new Scanner(System.in);

		System.out.print("Enter number of rows you want to print: ");
		int ans = inpt.nextInt();

		int sps = ans;

		for (outRow = 1; outRow <= ans; outRow++) {

			for (int sqrRow = 1; sqrRow <= ans; sqrRow++) {
				System.out.print("* ");
			}

			for (; tr <= lp; tr++) {

				for (int trR = sps; trR >= 1; trR--) {
					System.out.print(" ");
				}

				for (int upTr = 1; upTr <= outRow; upTr++) {
					System.out.print("* ");
				}

				System.out.println();
				sps--;
			}

			lp++;

		}

	}
}
