package JavaPackage;

public class RelationalOperater {

	public static void main(String[] args) {

		int a = 300; // local variable
		int b = 300; // local variable

		if (a != b)

		{
			System.out.println("a is not equal to b");

		} else {
			System.out.println("a is  equal to b");

		}

		String p = "HELLO";
		String q = "hello";
		
		// String Comparison - 1st way - case sensitive
		if (p == q) {
			System.out.println("p and q are equal for 1st way");
		} else {
			System.out.println("p and q are not equal for 1st way");
		}
	}

}
