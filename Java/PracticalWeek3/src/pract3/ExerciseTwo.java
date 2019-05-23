/**
 * 
 */
package pract3;

/**
 * @author User
 *
 */
public class ExerciseTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare vars
		double number;
		number = 900;
		
		//static method calls
		System.out.println("square root : "+Math.sqrt(number));
		System.out.println("8 raised to the power of 2: "+Math.pow(8, 2));
		
		//use of static fields
		double radius = 6;
		double area = (radius*radius)*Math.PI;
		System.out.printf("Area of circle with radius %.2f is %.2f",radius, area);
		
		
	}

}
