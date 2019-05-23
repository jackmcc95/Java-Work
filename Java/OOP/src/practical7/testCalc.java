package practical7;

public class testCalc {

	public static void main(String[] args) {
		
		calculator cal = new calculator();
		int expected =7;
		int actual = cal.addNumbers(3, 4);
		System.out.println("Actual " + actual);
		
		if (actual==expected) {
			System.out.println("Test Passed");
			} else {
			System.out.println("Test Failed");
			}
		}
	}


