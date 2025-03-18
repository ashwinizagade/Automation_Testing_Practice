package JavaPackage;

public class IfElse4 {
	public static void main(String[] args) {

		int age = 15;// local variable
		int weight = 50; // local variable

		// if statement
		if (age > 18) {
			if (weight > 45) {
				System.out.println("Eligible");
			} else {
				System.out.println("not eligible");
			}

		} else {
			System.out.println("age is not graeter than 18");
		}
	}
}
