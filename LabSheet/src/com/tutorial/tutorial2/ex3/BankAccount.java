package com.tutorial.tutorial2.ex3;

public class BankAccount {
	private  String accoNumbe;
	private String holderName;
	private double balance;
	
	public BankAccount() {
		this.accoNumbe = "0";
		this.holderName = "NULL";
		this.balance = 0.0;
	}
	
	public BankAccount(String accNumber, String holderName, double balance) {
		this.accoNumbe = accNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public String getAccoNumbe() {
		return accoNumbe;
	}

	public void setAccoNumbe(String accoNumbe) {
		this.accoNumbe = accoNumbe;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
	
	public void deposite(double deposite) {
		this.balance += deposite;
	}
	
	public void displayDet() {
		System.out.println("Account Holder's name: " + this.holderName);
		System.out.println("Account number: " + this.accoNumbe);
		System.out.printf("Account Balance: %.2f\n", this.balance);
	}
}
