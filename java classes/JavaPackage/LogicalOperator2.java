package JavaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {


		int a = 10; //local variable
		int b = 15; // local variable
		int c = 20; // local variable
		
		
		//logical operator - if first condition is false , 2nd condition will not check
		System.out.println(a<b && a++ > c); //false
		System.out.println(a);
		
		//bitwise operator - it will  check both condition
				System.out.println(a>b & a++ >c); //false
				System.out.println(a);

	}

}
