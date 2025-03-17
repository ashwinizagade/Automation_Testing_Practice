package JavaPackage;

public class Static1 {
	
	int x=500; // global  variable
	String s="hello";
	static int a=10; // static variable
	
     // static method
	public static void method1() {
		int w=11; // local variable
		System.out.println(w); //11
	}
	
	// non static method
	public void method2() {
		int d=44; // local variable
	}

}
