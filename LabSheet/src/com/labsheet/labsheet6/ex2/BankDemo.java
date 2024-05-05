package com.labsheet.labsheet6.ex2;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {

		double amount;
		String ans = "yes";

		Scanner scn = new Scanner(System.in);

		Account account = new Account();
		System.out.println("Depositing Rs.10,000");
		account.deposite(10000.00);

		while (ans.equalsIgnoreCase("yes")) {

			try {

				while (1 == 1) {
					System.out.print("Please enter amount to withdraw = ");
					amount = scn.nextDouble();

					account.withdraw(amount);

					System.out.println("Withdrawing Rs." + amount + "/=\n\texixting amount = " + account.getAmount());
				}

			} catch (InsufficientBalanceException e) {

				System.out.println("\nSorry your account remains only Rs." + e.getAmount());
				e.printStackTrace();
			} finally {

				System.out.println("Do you wish to continue? yes/no");
				ans = scn.next();

				if (ans.equalsIgnoreCase("yes")) {

					System.out.println("Depositing Rs.10,000");
					account.deposite(10000.00);
					
				}
			}
		} 
	}

}
 


/*
 * package com.labsheet.labsheet6.ex2;
 * 
 * import java.util.Scanner;
 * 
 * public class BankDemo {
 * 
 * public static void main(String[] args) { double amount; String ans; boolean
 * continueFlag = true;
 * 
 * Scanner scn = new Scanner(System.in); Account account = new Account();
 * 
 * System.out.println("Depositing Rs.10,000"); account.deposite(10000.00);
 * 
 * while (continueFlag) { try {
 * System.out.print("Please enter amount to withdraw: "); amount =
 * scn.nextDouble(); account.withdraw(amount);
 * System.out.println("Withdrawing Rs." + amount + "/=\nExisting amount: " +
 * account.getAmount()); } catch (InsufficientBalanceException e) {
 * System.out.println("\nSorry, your account remains only Rs." + e.getAmount());
 * e.printStackTrace(); } catch (IllegalArgumentException e) {
 * System.out.println(e.getMessage()); } finally {
 * System.out.print("Do you wish to continue? (yes/no): "); ans = scn.next(); if
 * (ans.equalsIgnoreCase("no")) { continueFlag = false; } else if
 * (!ans.equalsIgnoreCase("yes")) {
 * System.out.println("Invalid input. Exiting..."); continueFlag = false; } } }
 * 
 * scn.close(); } }
 */
