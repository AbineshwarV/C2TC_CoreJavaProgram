package DayOne;

public class DataTypes {

	// Program to demonstrate usage of different Data Types and type conversions
	public static void main(String[] args) {

		int value1 = 9 / 2; // Integer division: fractional part is discarded
		float value2 = 101 / 61; // Integer division result assigned to float
		double value3 = 10d / 6d; // Double division result includes fractional part
		float value4 = 5 / 2.5f; // Float division result includes fractional part

		System.out.println("value 1 = " + value1);
		System.out.println("value 2 = " + value2);
		System.out.println("value 3 = " + value3);
		System.out.println("value 4 = " + value4);

		int marker = 512;
		// Expression using float constant and assigned to double variable (implicit
		// type conversion)
		double percentage = marker * 0.46f;
		System.out.println("percentage : " + percentage);

	}

}
