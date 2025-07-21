package DayTwo;

public class ForEach {
	// Program to demonstrate for-each loop
	public static void main(String[] args) {
		// Integer
		int a[] = { 1, 2, 3, 4, 5 };

		for (int i : a) {
			System.out.println(i);
		}

		char ch[] = { 'a', 'b', 'i', 'n', 'e', 's', 'h', 'w', 'a', 'r', 'v' };
		for (char c : ch) {
			System.out.print(c);
		}
		System.out.println(" ");
		String s1[] = { "abineshwarv", "learning", "java" };

		// String
		for (String s : s1) {
			System.out.print(s + " ");
		}
	}

}
