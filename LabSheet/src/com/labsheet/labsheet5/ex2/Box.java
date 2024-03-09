package com.labsheet.labsheet5.ex2;

public class Box implements ICompute{
	private int length, width, height;
	private int volume;
	
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calculate() {
		this.volume = this.length * this.width * this.height;
	}
	
	@Override
	public void display() {
		System.out.println("Volume: " + this.volume);
	}
}
