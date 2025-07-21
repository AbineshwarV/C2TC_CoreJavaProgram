package DayTwo;

public class Switch {
	// Program to demonstrate Switch statement
	public static void main(String[] args) {
		char a = ' ';
		switch (a) {
		case 'l':
		case 'L':
			System.out.println(a + " is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(a + " is a Digit");
			break;
		case 'w':
		case 'W':
			System.out.println(a + " is White Space");
			break;
		case 's':
		case 'S':
			System.out.println(a + " is Special Symbol");
		default:
			System.out.println(a + " is other than letter, digit, space or special symbol ");
			break;
		}

	}
}
