/**
 * 
 */
package pract3;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class SquareRootPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// declare var
			double inputNum;

			// initialise the scanner
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter number ...");
			// read from keyboard
			inputNum = scanner.nextDouble();
			// output the value 
			System.out.println("Square root is : " + Math.sqrt(inputNum));

			scanner.close();    
		      }

		
	}

