/**
 * 
 */
package Loop;

/**
 * @author User
 *
 */
public class WhileLoopOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// count counter
		int counter;
		//initial value
		counter = 20;
		
		while (counter>0) {
			// loop body
			System.out.println("counter" + counter); //infinite loop-no stop button yet
			
			//increment the counter
			counter --;
			
		} // end of while loop
		System.out.println("Done !");
		

	}

}
