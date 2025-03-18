package JavaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {

		int a = 10; // local variable
		int b = 15; // local variable

		System.out.println(a++); // 10,11
		System.out.println(a++ + ++a); // 11,12,13,13 = 24
		System.out.println(--a + --a);// 12,12,11,11 =23
		System.out.println(b++);// 15,16
		System.out.println(b++ + --b); // 16,17,16,16=32
		System.out.println(--b + ++a); // 15,15,12,12 = 27
		System.out.println(--a + --b); // 11,11,14,14 = 25
		System.out.println(a); //11
		System.out.println(b); //14
	}

}
