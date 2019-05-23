/**
 * 
 */
package Loop;

/**
 * @author User
 *
 */
public class PartOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare vars
		int num, sum;
		
		//assign values
		sum=0;
		num=1;
		
		//do some maths
		//sum = num+sum;
		
		while(num<=10) {
			sum += num;
			++num;
		}
		//output to screen
		System.out.println("The sum is : "+sum);

		
	}

}
