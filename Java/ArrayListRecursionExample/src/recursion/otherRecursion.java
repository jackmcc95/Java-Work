package recursion;

public class otherRecursion {

	public otherRecursion() {
	}
	
	
	public static void main(String[] args) {
		int i =1;
		callMe(i);
	}

	public static void callMe(int i) {
		System.out.println("Call me" +i);
		i++;
		callMe(i);// recursive call
	}
}
