package Lab3_ex8_to_12;

public class Main {
	public static void main(String[] args) {
		Pet p = new Pet("Lissie", "Smith", 3);
		p.showDetails();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails();
		
		Pet p2 = new Pet("Pet1", "Owner1");
		p2.showDetails();
		
		Cat c2 = new Cat("Cat1", "Owner2");
		c2.showDetails();
		
		Dog d1 = new Dog("Syndy", "Nimal", 4, 2);
		d1.showDetails();
		
		Dog d2 = new Dog("Dog2", "Owner4");
		d1.showDetails();
		
		Pet p3 = c;
		p3.showDetails();
		
		Pet p4 = d1;
		p4.showDetails();
	}
}// end of the demo class
