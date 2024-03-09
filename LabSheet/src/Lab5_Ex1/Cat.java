package Lab5_Ex1;

public class Cat extends Animal {
	public Cat() {
		System.out.println("Cat constructor called");
	}

	public Cat(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return "Meow meow";
	}
}
