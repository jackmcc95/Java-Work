/**
 * 
 */
package week2;

/**
 * @author User
 *
 */
public class IfStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2;
		
		num1 = 10;
		num2 = 12;
		
		if (num1>num2) {
			System.out.println(num1 + " is bigger than " +num2);
		}
		
		if (num2>num1) {
			System.out.println(num2 + " is bigger than " +num1);
		}
		
		if (num2 == num1) {
			System.out.println(num2 + " is equal than " +num1);
			
		}
		
		if (num2 != num1) {
			System.out.println(num2 + " is not equal to " + num1);
			
		}
	}

}
