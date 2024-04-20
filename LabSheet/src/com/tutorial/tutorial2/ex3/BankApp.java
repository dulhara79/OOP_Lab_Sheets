package com.tutorial.tutorial2.ex3;

public class BankApp {
	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount();//values assign using default constructor
		
		//values assign using overload constructor
		BankAccount bank2 = new BankAccount("10501006273", "Sandaruwan",  50000.01);
		
		//values assign using setters
		BankAccount bank3 = new BankAccount();
		bank3.setAccoNumbe("10551346567");
		bank3.setHolderName("Nishantha");
		bank3.setBalance(95000.35);

		//values assign using overload constructor
		BankAccount bank4 = new BankAccount("10443567891243", "Hansimal", 65342.94);
		
		//values assign using overload constructor
		BankAccount bank5 = new BankAccount("112345678923", "Hemawaka", 45235.23);
		
		bank1.displayDet();//values diaplay using displayDet method
		System.out.println();
		
		bank2.displayDet();//values diaplay using displayDet method
		System.out.println();
		
		bank3.displayDet();//values diaplay using displayDet method
		System.out.println();
		
		//values getting using getters
		String accNo = bank4.getAccoNumbe();
		String accName = bank4.getHolderName();
		double accBal = bank4.getBalance();
		
		System.out.println("Account Holder's name: " + accNo);
		System.out.println("Account number: " + accName);
		System.out.printf("Account Balance: %.2f\n", accBal);
		System.out.println();
		
		//perform withdraw and deposit methods
		bank5.deposite(3200.00);
		bank5.withdraw(1500.00);
		
		bank5.displayDet();
	}
}
