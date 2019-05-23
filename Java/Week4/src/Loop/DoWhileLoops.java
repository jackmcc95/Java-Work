/**
 * 
 */
package Loop;

/**
 * @author User
 *
 */
public class DoWhileLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int loop;
		loop=20;
		
		while (loop>1) {
		
		System.out.println(loop);
		loop--;
		}
		int doWhileCounter;
		doWhileCounter=2;
		
		do {
			System.out.println(doWhileCounter);
			doWhileCounter++;
		}while (doWhileCounter<10);
		
		
		//infiniteloop
		int loops= 12;
		do {
			System.out.println("count is" + loop);
			loop--;
		}while (loop<11);
	}
	}




