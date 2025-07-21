package DayTwo;

public class Continue {
	// Program to demonstrate Continue Statement
	public static void main(String[] args) {
		int a = 20;
		for (int i = 1; i < a; i++) {
			if (i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}

	}

}
