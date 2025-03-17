package JavaPackage;

public class Static3 {
	int roll; // declaring global variable
	String name; // declaring global variable
	static String collage = "IIT Bombay"; // static variable

	// constructor
	Static3(int r, String n) {
		roll = r;
		name = n;
	}

	public void getresult() {
		System.out.println(roll + " " + name + " " + collage);
	}

}
