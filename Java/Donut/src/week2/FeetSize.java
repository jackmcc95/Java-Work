/**
 * 
 */
package week2;

import java.util.Scanner;


/**
 * @author User
 *
 */
public class FeetSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// size of shoe
		double ShoeSize;
		ShoeSize = 9;
		// hard coded
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your shoe size?");
		ShoeSize = scanner.nextDouble();
		
		if(ShoeSize>6) {
			
		}
		System.out.println("Adult section");
		
		if(ShoeSize<6) {
			
		System.out.println("kids section");
		} //end of if statement
		
		System.out.println("My shoe size is : " +ShoeSize);
		
		scanner.close();
	}

}
