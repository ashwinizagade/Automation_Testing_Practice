package JavaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {

		int a = 10; // local variable
		int b = 10; // local variable

		System.out.println(a++); // 10,11
		System.out.println(a); // 11
		System.out.println(a++ + ++a); // 11,12,13,13 = 24
		System.out.println(a + a++); // 13,13,14=26
		System.out.println(b++ + b--); // 10,11,11,10 = 21
		System.out.println(b-- + ++b); // 10,9,10,10=20
		System.out.println(b); // 10
		System.out.println(--b + b--); // 9,9,9,8 =18
		System.out.println(b++  +  b++); //8,9,9,10 =17
		System.out.println(b); // 10
	}

}
