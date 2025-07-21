package DayOne;

public class Char {

	// Program to demonstrate usage of char data type and Unicode/ASCII values
	public static void main(String[] args) {

		// Character literal assigned directly
		char ch = 'a';
		System.out.println(ch); // Output: a

		// Integer value assigned to char (ASCII value of 70 is 'F')
		char num = 70;
		System.out.println(num); // Output: F

		// Unicode character using escape sequence for '§' (Section sign)
		char UniChar = '\u00A7';
		System.out.println(UniChar); // Output: §

		// Unicode character for Euro symbol (€)
		char unicode = '\u20AC';
		System.out.println(unicode); // Output: €

		// Character 'F' implicitly converted to its ASCII value (70)
		int asci = 'F';
		System.out.println(asci); // Output: 70
	}
}