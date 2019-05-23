/**
 * 
 */
package pract3;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class SquarePractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);

		double side = 4;

	System.out.println("Enter the side of the square (in cms) ?");
		side = scanner.nextDouble();
	System.out.printf("Perimeter : %.2f %s",side*4 ," cm \n");
	System.out.printf("Area      : %.2f %s",Math.pow(side, 2) ," cm2");
		scanner.close();

		
	}

}
