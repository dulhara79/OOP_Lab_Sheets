package com.labsheet.labsheet6.ex2;

public class Account {

	private int accNo;
	private double amount;

	public Account() {
		this.accNo = 00;
		this.amount = 0.0;
	}

	public Account(int accNo) {

		this.accNo = accNo;
	}

	public void displayDetails() {

		System.out.println("Your account number is: " + this.accNo + "\nYour account balance is: " + this.amount);
	}

	public void deposite(double depAmount) {

		this.amount += depAmount;
	}

	public void withdraw(double withdrawAmount) throws InsufficientBalanceException {

		if (this.amount <= withdrawAmount) {

			throw new InsufficientBalanceException(withdrawAmount);
		} else {

			this.amount -= withdrawAmount;
		}
	}
	
	public double getAmount() {
		return this.amount;
	}

}
