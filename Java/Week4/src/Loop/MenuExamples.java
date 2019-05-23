/**
 * 
 */
package Loop;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class MenuExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
				//show menu
				System.out.println("Menu");
				System.out.println("1.File");
				System.out.println("2.Edit");
				System.out.println("3.Delete");
				System.out.println("4.Exit");
				System.out.println("Enter the option");
				
				//get the users input
				option = scanner.nextInt();
				
				//do something with the input
				switch (option) {
				case 1: 
					System.out.println("Your option : File");
					break;
				case 2:
					System.out.println("Your option : Edit");
					break;
				case 3:
					System.out.println("Your option : Delete");
					break;
				case 4:
					System.out.println("Your option : Exit");
					break;
				
				default:
				System.out.println("Sorry try that again");
				
				}
		}	while (option!=4);
				System.out.println("Program Over!");
		scanner.close();
		
		
	}

}
