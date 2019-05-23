/**
 * 
 */
package MethodsPractical;

import java.util.Calendar;
import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author User
 *
 */
public class PracticalMethods {

	/**
	 * when passed any given integer, will determine whether it is odd or even.
	 * 
	 * @param number (integer only)
	 * @param args
	 */

	public static void oddOrEven(int number) {

		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	/**
	 * 
	 * @param letter
	 */
	public static void convertFromUpperToLower(char letter) {
		System.out.println(Character.toLowerCase(letter));

		if (Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		} else
			System.out.println("Already in lower case");
	}

	/**
	 * when passed a pair of integers will determine if the second is a multiple of
	 * the first.
	 * 
	 * @param num1 - base number
	 * @param num2 - number to check if it is a multiple of base number
	 */
	public static void isMultiple(int num1, int num2) {
		if (num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d", num1, num2);
		} else {
			System.out.printf("%d is not a multiple of %d", num1, num2);
		}
	}

	/**
	 * 
	 */
	public static void RandomNumberGenerator() {

		Random rand = new Random();

		int number = 0;

		for (int loop = 0; loop <= 10; loop++) {
			number = rand.nextInt(100);
			number++;
			System.out.println(number);
		}
	}

	/**
	 * 
	 * @param args
	 */

	public static void PrintStars() {
		int count = 5;

		// print the number
		for (int outerLoop = count; outerLoop > 0; outerLoop--) {
			System.out.print(outerLoop + " ");

			// print the stars
			for (int innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // end of outer

	public static void printNumberInWord(int input) {
		if (input == 1) {
			System.out.println("ONE");
		} else if (input == 2) {
			System.out.println("TWO");
		} else if (input == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("UNKNOWN");
		}

	}

	public static void counter(int upperLimit) {
		int total=0;
		double average=0.0;
		
		for(int Loop=1; Loop<=upperLimit; Loop++) {
			total +=Loop;
		}
		System.out.println("Total is:"+total);
		
		average = (double)total / (double)upperLimit;
		System.out.printf("Average is:%.2f",average);
	}
	
	
	public static void currentTime () {
		
		Calendar now = Calendar.getInstance();
		
		int hour;
		hour = now.get(Calendar.HOUR_OF_DAY);
		
		if(hour <= 11) {
			System.out.println("Good Morning");
		}else {
			System.out.println("Hope you had a great day");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Start Main");
		System.out.println();
		oddOrEven(4);
		oddOrEven(5);

		convertFromUpperToLower('a');

		isMultiple(5, 10);
		System.out.println();

		isMultiple(3, 10);
		System.out.println();

		RandomNumberGenerator();
		System.out.println();

		PrintStars();
		System.out.println();

		printNumberInWord(5);
		System.out.println();
		
		counter(100);
		System.out.println();
		
		currentTime();
		System.out.println();
		
		System.out.println();
		System.out.println("End Main");

	}

}
