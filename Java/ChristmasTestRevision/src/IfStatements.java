/**
 * 
 */

/**
 * @author Jack
 *
 */
public class IfStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Method checks a user's (hardcoded variables) age and credit history. Business
		 * rule : to be successful the applicant must be 18 years old or over and have a
		 * good credit history. A message on the success of the application is output.
		 * Uses a logical AND (&&) to check the two vars.
		 * 
		 * @param args
		 */

		// decalre the vars
		int age;
		boolean goodCreditHistory;

		// set the vars
		age = 19;
		goodCreditHistory = true;

		// check if user is 18+ and good credit history is set as true
		if ((age >= 18) && (goodCreditHistory)) {
			// if both are TRUE then in here to let the user know
			// their application has been successful
			System.out.println("Your application is successful");
		} else {
			// either or both conditions are false. So in here to let
			// the user know the application has been unsuccessful
			System.out.println("Application rejected - Due to age or credit history");
		}

		// month of year to test
		int month = 2;

		// firstly checking if month is semester 1 range
		if ((month == 1) || ((month >= 9) && (month <= 12))) {
			System.out.println("Semester 1");
		} else if ((month >= 2) && (month <= 6)) { // checking if semester 2 range
			System.out.println("Semester 2");
		} else {
			// otherwise summer (but what if month is < 1 and >12 - validation ?)
			System.out.println("Summer");
		}


	int month1 =8;

	switch(month1){

	case 1:  case 9: case 10: case 11: case 12:  
	    System.out.println("Semester 1");
	    break;
	case 2: case 3: case 4: case 5:
	    System.out.println("Semester 2");
	    break;
	case 6: case 7: case 8:
	    System.out.println("Summer");
	    break;
	default :
	    System.out.println("Invalid");
	}

}
}