package JavaPackage;

public class Variable1 {

	public static void main(String[] args) {

		int a = 5; // int type local varible
		System.out.println(a); // 5 - calling a variable
		int x = 100; // int type local variable
		System.out.println(x); // 100
		x = 200;
		System.out.println(x);// 200
		
		char c = 'a'; // char type local variable , should be placed inside single qoute
		System.out.println(c);
		
		boolean b = true;
		System.out.println(b); // true
		b = false;
		System.out.println(b); // false
		
		System.out.println(3 > 12); // false
		
		int e = 100; // int type local variable
		int f= 200; // int type local variable
		boolean z=(e>f); // false
		System.out.println(z); // false
	}

}
