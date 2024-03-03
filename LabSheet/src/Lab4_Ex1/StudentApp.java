package Lab4_Ex1;

public class StudentApp {
	public static void main(String args[]) {
		Student s[] = new Student[5];

		s[0] = new Student();

		s[1] = new  Student();
		s[1].setName("Dulhara");
		s[1].setDegree("IT");
		s[1].setMobile("0123456789");

		s[2] = new Student("Kaushalya", "SE", "0987654321");
		s[3] = new Student("DK", "DS", "1236542378");
		s[4] = new Student("RW", "ISE", "8791350742");

		for (int i = 0; i < 5; i++) {
			s[i].print();
			System.out.println();
		}
	}
}
