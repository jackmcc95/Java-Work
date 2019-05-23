/**
 * 
 */
package OOPFirst;

/**
 * @author User
 *
 */
public class MessageCentre {
	
	
	//public void displayWelcomeMessage() {
		
		//System.out.println("Hello and Welcome");
		
	//}

	public void displayWelcomeMessage(String timeOfDay) {
		
		String message;
		message = "hello ";
		
		if(timeOfDay.equalsIgnoreCase("am")) {
			message+="and good morning";
		}else if (timeOfDay.equalsIgnoreCase("pm")) {
			message+="and good afternoon";
		}else {
			// unknown value passed as parameter
			message += "and good day";
		}
		System.out.println(message);	
	}
}
