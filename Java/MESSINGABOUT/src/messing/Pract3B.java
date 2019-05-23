/**
 * 
 */
package messing;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Pract3B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mark = 29; 
		
		
		System.out.println("Give a student a mark between 0-100");
		mark = scanner.nextInt();
		
		if ((mark >=0) && ((mark<=49))) {
			System.out.println("Fail");
		}else if(mark >= 50 && (mark <= 59)){
			System.out.println("Pass");
		}else if (mark<=60 && (mark >=69)){
			System.out.println("Merit");
		}else if (mark>=70 && (mark <=100)){
			System.out.println("Distinction");
		}else {
			System.out.println("Error - Incorrect Number");
		}
		
		scanner.close();

}

}
