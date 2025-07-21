package DayTwo;

public class NestedForLoop {
	// Program to demonstrate Nested For-loop
	public static void main(String[] args) {
		int init = 1;
		int end = 10;

		for (int i = init; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("Answer of " + i + "*" + j + " is " + i * j);
			}
			System.out.println();

		}

	}

}
