package com.labsheet.labsheet6.ex1;

public class Account {
	private int accNo;
	private double balance;
	
	public Account(int accNo , double balance ) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void displayBalance() {
		System.out.println("Your account balance is: " + this.balance);
	}
	
	public void deposite(double dep) {
		this.balance += dep; 
	}
	
	public void withdraw(double draw) {
		this.balance -= draw; 
		if(this.balance < 0) {
			//this.balance
		}
	}
	
	
	public double getAmount() {
		return this.balance;
	}
	 
}