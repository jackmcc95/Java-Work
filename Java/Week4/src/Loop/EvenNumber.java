/**
 * 
 */
package Loop;

/**
 * @author User
 *
 */
public class EvenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			//Even Numbers
		
		int counter;
		counter = 0;
		
		while (counter<=20) {
			//only going to print this if even number
			if (counter %2==0) {
				System.out.println(counter);
			
			}
			counter++;
		}
		
	}

}
