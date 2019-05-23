/**
 * 
 */
package messing;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Pract3C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		// vars
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		
		//	Ask user for age
		
		System.out.println("Please enter your age.....");
		age = scanner.nextInt();
		
		if (age<17) {
			System.out.println("Sorry to young to continue");
	}else if (age>=18) {
		System.out.println("Enter your name....");
		name = scanner.next();
		System.out.printf("Name entered is %s age entered is %s", name, age);
		
		scanner.close();
		
		
	}
	}

}
