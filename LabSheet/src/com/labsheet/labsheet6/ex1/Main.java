package com.labsheet.labsheet6.ex1;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(123, 0);
		System.out.println("Deposite Amount: 10,000.00");
		account.deposite(10000.00);
		
		try {
			System.out.println("Withdrawing Rs. 6,000.00");
			account.withdraw(8000.00);
			
			System.out.println("Withdrawing Rs. 8,000.00");
			account.withdraw(8000.00);
			
			if(account.getAmount() < 0) {
				throw new InsufficientBalanceException(8000.00);				
			}
		} catch(InsufficientBalanceException e) {
			System.out.print(/* e.getMessage() */"Sorry, your account remains only Rs. ");
			System.out.println(account.getAmount()+ e.getAmount());
			e.printStackTrace();
		}
	}

}
