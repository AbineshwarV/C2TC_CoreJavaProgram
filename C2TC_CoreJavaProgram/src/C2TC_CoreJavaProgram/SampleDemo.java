package C2TC_CoreJavaProgram;

public class SampleDemo {
	public static void main() {
		System.out.println("Welcome from main 1");
		
	}
	public static void main(char c[]) {
		System.out.println("Welcome from main 2");
		
	}
	public static void main(String ar) {
		System.out.println("Welcome from main 3");
		
	}
		
	static {
		System.out.println("Static block 2");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Day1");
		System.out.println("hello");
		
	}
	
	static {
		System.out.println("Static block 1");
	}
}