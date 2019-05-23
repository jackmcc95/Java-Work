/**
 * 
 */
package methods;

/**
 * @author Jack
 *
 */

public class methodReturns {

	public static void main(String[] args) {

		String userName;
		userName = getUserName();
		
		if (userName.length() == 0){
			System.out.println("What, no name ?");
		} else {
			System.out.println("Hello "+userName);
		}
	}
	
	/**
	 * Method prompts user for name and returns the inputted value as a string
	 * @return the user's input
	 */
	public static String getUserName(){
		
		String userName;
		userName=null;	
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter your full name : ");
		userName = scanner.nextLine();
		
		scanner.close();
		
		return userName;
	}

}
