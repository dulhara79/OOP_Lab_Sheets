package com.labsheet.labsheet6.ex1;

public class InsufficientBalanceException extends Exception {

	private double amount;

	public InsufficientBalanceException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}
}
