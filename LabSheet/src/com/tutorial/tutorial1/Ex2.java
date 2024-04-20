package com.tutorial.tutorial1;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		double num, total = 0, avg = 0;
		int cnt = 1;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter negative number to terminate the entering process.");
		System.out.print("Enter number : ");
		num = scn.nextDouble();
		
		while(num > 0) {
			total = total + num;
			cnt++;
			System.out.print("Enter number : ");
			num = scn.nextDouble();
		}
		
		avg = total / cnt;
		
		System.out.println("total: " + total + "cnt: " + cnt);
		
		System.out.printf("Avarage of the series is: %.2f\n", avg);
	}
}
