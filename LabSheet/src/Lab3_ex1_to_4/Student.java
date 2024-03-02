package Lab3_ex1_to_4;

public class Student {
	private String name;
	private String dit;
	private String address;

	public Student() {
		this.name = "Dulhara";
		this.dit = "ITOO1";
		this.address = "Colombo";
	}

	public Student(String name, String dit, String address) {
		this.name = name;
		this.dit = dit;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDit(String dit) {
		this.dit = dit;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDit() {
		return this.dit;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getDetails() {
		String details = "I am student. \nMy name is " + this.name + ".\nI am from " + this.address + ".\nMy dit no is " + this.dit;
		return details;
	}
}
