package JavaPackage;

public class Static6 {

	int x = 100; // global variable
	static int y = 5; // static variable

// non static method
	public void a() {
		int z = 10; // local variable
		System.out.println(z); // 10

	}

	static int b = 6; // static variable

// static method
	public static void b() {
		int a = 2; // local variable
		System.out.println(a); // 10

	}

	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a(); // 10
		System.out.println(s6.b); // 6- not an appropriate way
		System.out.println(Static6.b); // 6- not an appropriate way for same class
		System.out.println(b); // 6
		b(); // 5
		System.out.println(s6.x); // 100
System.out.println(y); // 5
	}
}
