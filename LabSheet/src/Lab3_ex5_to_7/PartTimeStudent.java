package Lab3_ex5_to_7;

public class PartTimeStudent extends Student{
	private int numberOfWorkingHours;
	
	public PartTimeStudent(String name, String address, String studentid, int partTimeWorkingHours) {
		super(name, address, studentid);
		
		this.numberOfWorkingHours = partTimeWorkingHours;
	}
	
	public int getNumberOfWorkingHours() {
		return this.numberOfWorkingHours;
	}
}
