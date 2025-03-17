package JavaPackage;

public class Static7 {
	String a; // declaring global variable
	int b; // declaring global variable
	static int c = 4; // static varaible

	// static method
	public static void a() {
		System.out.println("hello java ");

	}

	public static void main(String[] args) {
		Static7 s7 = new Static7();
		s7.a = "selenium";
		s7.b = 1;
		c = 2;

		a(); // hello java
		System.out.println(s7.a); // selenium
		System.out.println(s7.b); // 1
		System.out.println(c); // 2

	}

}
