/**
 * 
 */
package messing;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Practical3 {

	/**
	 * 
	 */
	public Practical3() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a decimal point number in the format of xx.xxxxx");
		inputNumber = scanner.nextDouble();
		
		System.out.printf("Number rounded to 2 decimal places : %.2f %n", inputNumber);
		System.out.printf("Number rounded to 3 decimal places : %.3f %n ", Math.pow(inputNumber, 2));
		System.out.printf("Number Square root and 4 decimal placed : %.4f %n ", Math.sqrt(inputNumber));
		
		scanner.close();
		
		
	}

}
