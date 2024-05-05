package com.labsheet.labsheet6.ex1;

public class BankDemo {

	public static void main(String[] args) {

		Account account = new Account();
		System.out.println("Depositing Rs.10,000");
		account.deposite(10000.00);

		try {

			System.out.println("\nWithdrawing Rs.6,000/=");
			account.withdraw(6000.00);

			System.out.println("\nWithdrawing Rs.8,000/=");
			account.withdraw(8000.00);
		} catch (InsufficientBalanceException e) {

			System.out.println("\nSorry your account remains only Rs." + e.getAmount());
			e.printStackTrace();
		}
	}

}
