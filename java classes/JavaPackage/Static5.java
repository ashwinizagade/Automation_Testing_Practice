package JavaPackage;

public class Static5 {

	static int z = 2; // static variable
	int a = 1; // global variable

// user defined static method
	public static void amethod() {
		z = 4; // modification of static value
		System.out.println(z); // 4
	}

	// user defined non static method
	public void bmethod() {
		z = 6;
		System.out.println(z); // 6
	}

	public static void main(String[] args) {
		System.out.println(z); // 5
		amethod(); // 4
		Static5 s5 = new Static5();
		s5.bmethod(); // 6
	}
}
