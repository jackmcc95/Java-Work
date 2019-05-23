/**
 * 
 */
package Loop;

/**
 * @author User
 *
 */
public class BackwardsCountdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//counts down from 10 to 1 and then exists and then
		// next statement is executed
		
		int countDown = 10;
		while (countDown!= 0) {
			System.out.println(countDown);
			countDown--;			
		}
		System.out.println("Blast Off!!");
		
	}

}
