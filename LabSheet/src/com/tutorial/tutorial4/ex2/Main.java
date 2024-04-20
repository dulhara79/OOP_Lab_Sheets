package com.tutorial.tutorial4.ex2;

public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		try {
			cart.addItem(200.50);
            cart.addItem(300.75);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try {
            cart.addItem(-50.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try {
            cart.addItem(1200.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try {
            cart.addItem(600.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Total price is: " + cart.calculateTotalPrice());
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
