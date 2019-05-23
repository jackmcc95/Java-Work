/**
 * 
 */
package week2;

/**
 * @author User
 *
 */
public class BiggestNumberFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declare vars
		
		int number1, number2;
		number1 = 44;
		number2 = 44;
		
		if(number1>number2) {
			System.out.println("The biggest number is : "+number1);
		}
		
		if (number2>number1) {
			System.out.println("The biggest number is : "+number2);
			
		}
		
		if (number1==number2) {
			System.out.println("Both numbers are equal");
			
		}
	} //closes the if

}
