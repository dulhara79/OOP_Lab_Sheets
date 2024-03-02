package LabSheet01;

public class Ex04 {
	public static void main(String[] args) {
		int dVal = 4;

		switch (dVal) {
		case 0:
			System.out.println("Value of the day: 0\nDay of the week: Sunday");
			break;
		case 1:
			System.out.println("Value of the day: 1\nDay of the week: Monday");
			break;
		case 2:
			System.out.println("Value of the day: 2\nDay of the week: Tuesday");
			break;
		case 3:
			System.out.println("Value of the day: 3\nDay of the week: Wednesday");
			break;
		case 4:
			System.out.println("Value of the day: 4\nDay of the week: Thursday");
			break;
		case 5:
			System.out.println("Value of the day: 5\nDay of the week: Friday");
			break;
		case 6:
			System.out.println("Value of the day: 6\nDay of the week: Saturday");
			break;
		default:
			System.out.println("Invalid Day");
		}
		System.out.println("Good Bye!");
	}
}
