/**
 * 
 */
package Wrapper;

import java.util.Arrays;


/**
 * @author User
 *
 */
public class arrayExercise {

	/**
	 * 
	 */
	public arrayExercise() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		// note change from slide
		Integer i4 = 4;
		int i5 = 67;
		int i6 = 31;
		String i7 = "60";
		double i8 = 22.2;
		int i9 = -22;
		
		// store all in an Array
		Double[] numbers = new Double[9];
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = new Double(i3);
		numbers[3] = i4.doubleValue();
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		numbers[6] = Double.parseDouble(i7);
		numbers[7] = new Double(i8);
		numbers[8] = new Double(i9);
	
		System.out.println(numbers);
		
		// show all values in array (unsorted)
		System.out.println("UnSorted : ");
 		for (int loop = 0; loop < numbers.length; loop++) {
 			System.out.println(numbers[loop]);
 		}

		// sort
		Arrays.sort(numbers);
	
		// show all values in array (sorted)
		System.out.println("Sorted : ");
 		for (int loop = 0; loop < numbers.length; loop++) { 
 			System.out.println(numbers[loop]);
 		}
	}
}
