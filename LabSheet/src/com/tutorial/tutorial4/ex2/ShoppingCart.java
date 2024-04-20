package com.tutorial.tutorial4.ex2;

public class ShoppingCart {
	private double total;
	private int itemCount;

	public ShoppingCart() {
		total = 0.0;
		itemCount = 0;
	}

	// Implement adding an item to the shopping cart and handle exceptions
	public void addItem(double price) {
		if(price < 0 || price > 1000) {
			throw new IllegalArgumentException("Invalid price: " + price + ". Price should be between $0 and $1,000.");
		}
		this.total += price;
		this.itemCount++;
	}

	// Implement calculating the total price and handle exceptions
	public double calculateTotalPrice() {
		if(this.itemCount == 0) {
			throw new ArithmeticException("Cart is empty.");
		}
		return this.total;
	}
}
