/**
 * 
 */
package methods;

/**
 * @author User
 *
 */
public class methodsExample {
	
	/**
	 * Method will output my name to screen when invoked
	 *
	 */
	public static void invokeMe () {
		
		System.out.println("Jack");
	}
	
	public static void yearTurn100(){
		   int currentAge, currentYear, yearTurning100;
		   currentAge = 23;
		   yearTurning100 = 0;
		   currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		   yearTurning100 = 100 - currentAge + currentYear;
		   System.out.println("Year turning 100 is : "+yearTurning100);
		}
	
	public static void outputName(int times){
		for (int loop=1; loop<=times; loop++){
			System.out.println("Jack");
		}
	}
		
	public static void count(int start){
			for (int loop=start; loop>=0; loop--){
				System.out.println(loop);

	}
	}
	public static void min(int num1, int num2){
		if (num1>num2){
			System.out.printf("%d is bigger than %d",num1, num2);
		} else if (num2>num1){
			System.out.printf("%d is bigger than %d",num2, num1);
		} else {
			System.out.printf("%d is same as %d",num1, num2);
		}
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		//method call
		invokeMe();
		yearTurn100();
		outputName(10);
		count(10);
		min(10, 5);
	}
	
}
