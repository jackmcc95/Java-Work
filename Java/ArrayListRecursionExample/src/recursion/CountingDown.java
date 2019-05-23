package recursion;

public class CountingDown {

	public CountingDown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		countdown(3);
		
	}

	public static void countdown(int num) {
		//base case
		if (num <=0) {
			System.out.println("End");
		}else {
			System.out.println(num);
			countdown(--num);
		}
	}
}
