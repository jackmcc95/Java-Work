package recursion;

public class Factorial {

	public Factorial() {
	}

	public static int fact(int num) {
		if(num==1) {
			return 1;
		}else {
			return num *(fact(--num));
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Fact 4 : "+ fact(4));
		

	}

}
