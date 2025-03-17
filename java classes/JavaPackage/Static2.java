package JavaPackage;

public class Static2 {

	int roll; // declaring global variable
	String name; // declaring global variable
	String collage; // declaring global variable

	public static void main(String[] args) {
		
		Static2 s2 = new Static2(); // creating an object
		
		System.out.println(s2.roll); // 0
		System.out.println(s2.name); // null
		System.out.println(s2.collage); // null

	}

}
