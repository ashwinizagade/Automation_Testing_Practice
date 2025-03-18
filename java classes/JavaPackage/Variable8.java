package JavaPackage;

public class Variable8 {

	int b = 5; // global variable
	char k='a';
	
	static int c = 6; // static variable

	// static method
	public static void d() {
		int s = 10; // local variable
		System.out.println(s); // 10

	}

	// non static method
	public void h() {
		int g = 9; // local variable
		System.out.println(g); // 9
		int n=2;
		System.out.println(n); //2
		d(); 
	}

	public static void main(String[] args) {
		int a = 3; // local variable
		System.out.println(a); // 3 calling a variable

		// static member calling
		System.out.println(c); // 6 calling static member
		d(); // calling static method 
		
		// non static member calling
		Variable8 v8 = new Variable8();
		System.out.println(v8.b); // calling non static variable using object ref
		v8.h();
		System.out.println(v8.k);
	}

}
