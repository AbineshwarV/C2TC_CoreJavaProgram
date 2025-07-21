package DayTwo;

public class NestedIfElse {
	// Program to demonstrate Nested If-Else statement
	public static void main(String[] args) {
		int a = 3, b = 19, c = 47;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
		}

	}

}
