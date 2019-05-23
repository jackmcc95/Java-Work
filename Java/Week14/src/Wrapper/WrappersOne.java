/**
 * 
 */
package Wrapper;

/**
 * @author User
 *
 */
public class WrappersOne {

	/**
	 * 
	 */
	public WrappersOne() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int myNum = 33;
		Integer myInt = new Integer(56);
		
		System.out.println(myNum);
		System.out.println(myInt);
		
		
		//text as a num
		Integer myInt2 = new Integer("45");
		System.out.println(myInt2);
		
		
		//not good
		Integer prob = new Integer(10);
		System.out.println(prob);
		
		Integer myI =new Integer (34);
		int weeInt = myI.intValue();
		System.out.println("int value"+ weeInt);
		
		
		//utility type function example
		System.out.println("BIGGEST : "+ Integer.max(weeInt, myI));
		
		double weeD = myI.doubleValue();
		System.out.println(weeD);
		
		int myInt1 = Integer.parseInt("10");
		System.out.println(myInt1);
		
		//addition of int and Double
		Double myD = myI.doubleValue() + 3.4;
		System.out.println(myD);
	}
}
