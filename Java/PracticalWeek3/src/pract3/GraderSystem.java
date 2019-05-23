/**
 * 
 */
package pract3;

/**
 * 
 * @author User
 *
 */
public class GraderSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int testScore;
		char grade;
		
		grade = 'F';
		testScore=83;
		
		if(testScore>=90) {
			grade='A';
		}else if (testScore>=80) {
			grade='B';
		}else if (testScore>=70) {
			grade='C';
		}else { 
			System.out.println('F');
		}
		
		System.out.println("Grade = "+grade);
		
		
	}

}
