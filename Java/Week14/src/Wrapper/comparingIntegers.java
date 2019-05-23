/**
 * 
 */
package Wrapper;

/**
 * @author User
 *
 */
public class comparingIntegers {

	/**
	 * 
	 */
	public comparingIntegers() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer intW1 = new Integer (3);
		Integer intW2 = new Integer(100);
		
		//using equals (returns Boolean true if the values of the object and 
		// argument are equal
		
		if(intW1.equals(intW2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not the same");
		}
		
		//using compareTo (returns an int value that is positive, negative or zero
		//Negative means that the object has a value less than the argument,
		// positive means its greater and zero means they are the same.
		
		System.out.println("return from compareTo is : "+intW1.compareTo(intW2));
	}

}
