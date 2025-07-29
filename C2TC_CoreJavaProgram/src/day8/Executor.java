package day8;

public class Executor {

	public static void main(String[] args) {
		// college reference
		College c1;

		// CSE students
		c1 = new Cse_Student();
		c1.session();

		// IT students
		c1 = new It_Student();
		c1.session();

	}

}
