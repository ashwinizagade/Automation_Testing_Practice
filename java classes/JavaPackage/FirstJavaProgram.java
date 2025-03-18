package JavaPackage;

public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Ashwini");

		aMethod(); // calling a method
		bMethod(); // calling b method
		cMethod(); // calling c method
		int d = 2; // local variable
		System.out.println(d); // 2
		char g = 1;
	}

	// user defined method
	public static void aMethod() {
		System.out.println("hello a method");
	}

	// user defined method
	public static void bMethod() {
		int a = 5; // local variable
		System.out.println(a); // calling a variable
	}

	// user defined method
	public static void cMethod() {
		int b = 6;
		int c = 7;
		System.out.println(b + c);
	}
}
