package DayTwo;

public class DecisionWithOperators {

	public static void main(String[] args) {
		int x = 5;
		int y = 25;
		int a = 25;
		int b = 25;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}

	}

}
