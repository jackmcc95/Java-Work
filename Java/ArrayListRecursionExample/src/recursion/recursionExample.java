package recursion;

public class recursionExample {

	public recursionExample() {
	}
	
	
	public static void method3() {
		System.out.println("In 3");
	}
	
	public static void method2() {
		System.out.println("In 2");
		method3();
	}
	
	public static void method1() {
		System.out.println("In 1");
		method2();
	}

	public static void main(String[] args) {
		method1();

	}

}
