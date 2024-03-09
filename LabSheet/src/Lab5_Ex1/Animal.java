package Lab5_Ex1;

public abstract class Animal {
	private String name;
	
	public Animal() {
		System.out.println("Animal constructor called");
		}
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract public String speak();
	
	public void display() {
		System.out.println("My name is " + this.name + ". " + this.speak() + ".\n");
	}
}
