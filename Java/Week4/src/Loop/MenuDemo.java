/**
 * 
 */
package Loop;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class MenuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// vars
		Scanner scanner = new Scanner(System.in);
		int userOption;
		
		//**loop start
		
			// Draw Menu
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Print");
			System.out.println("4. Exit");
	
			// Prompt user for a response
			System.out.println("Enter option...");
	
			// read in their option
			userOption = scanner.nextInt();

			// process option
		if (userOption == 1) {
			System.out.println("File OK...");
			} else if (userOption == 2) {
				System.out.println("Edit OK...");
			} else if (userOption == 3) {
				System.out.println("Print OK...");
			} else if (userOption ==4) {
				System.out.println("Exit OK");
			}
		
			//**loop end
			
			// exit
			System.out.println("BYE !!!");
	
			scanner.close();

	}

}
