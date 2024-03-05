package Lab4_Ex2;

public class Feet {
	private int feet;
	private int inches;
	
	public Feet() {
		
	}

	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}

	// Add f1+f2 feet and store in current feet
	public void add(Feet f1, Feet f2) {
		this.feet = f1.feet + f2.feet;
		this.inches = f1.inches + f2.inches;
		
		if(this.inches >= 12) {
			this.feet += this.inches / 12;
			this.inches = this.inches % 12;
		}
	}

	// Display a Length e.g 5’6”
	public void print(String msg) {
		System.out.println(msg + this.feet + "'" + this.inches + "\"\n");
	}

	public Feet(Feet len) {
		this.feet = len.feet;
		this.inches = len.inches;
	} // Copy the content of len to the new Feet Object.

	public void add(Feet f1) {
		int feet = this.feet + f1.feet;
		int inch = this.inches + f1.inches;

		if (inch >= 12) {
			feet += inch / 12;
			inch = inch % 12;
		}

		this.feet = feet;
		this.inches = inch;
	}

	// create static print method
	public static void print(Feet f) {
		System.out.println(f.feet + "'" + f.inches + "\"" + "\n");
	}
	
	//create static feet class add method and return new feet object
	public static Feet add(Feet f1, Feet f2, Feet f3) {
		int Tfeet = f1.feet+f2.feet+f3.feet;
		int Tinch = f1.inches+f2.inches+f3.inches;
		
		if (Tinch >= 12) {
			Tfeet += Tinch / 12;
			Tinch = Tinch % 12;
		}
		
		return new Feet(Tfeet, Tinch); //return new Feet object in Feet class
	}

}
