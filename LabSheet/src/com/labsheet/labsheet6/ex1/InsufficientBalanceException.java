package com.labsheet.labsheet6.ex1;

public class InsufficientBalanceException extends Exception{
	private double withdrawAmount;
	public InsufficientBalanceException(double amount) {
		//super(msg);
		this.withdrawAmount = amount;
	}
	
	public double getAmount() {
		return this.withdrawAmount;
	}
}
