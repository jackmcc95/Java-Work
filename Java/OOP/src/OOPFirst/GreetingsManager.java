/**
 * 
 */
package OOPFirst;

/**
 * @author User
 *
 */
public class GreetingsManager {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {

		//System.out.println("Start of Greetings Manager");
		
		// creating object of the type message centre
		//MessageCentre myMessageCentre = new MessageCentre();
		// invoking method of message centre
		//myMessageCentre.displayWelcomeMessage();
		
		//System.out.println("End of Greetings Manager");
	//}
	
	public static void main(String[] args) {
		
		MessageCentre myMessageCentre = new MessageCentre();
		myMessageCentre.displayWelcomeMessage("pm");
	}

}
