/**
 * 
 */
package week3;
// import statements
import java.util.Scanner;

/**
 * Class is going to interact with the user
 * @author User
 *
 */
public class Importing {

	/**
	 * method gets user's name and output hello message
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaring vars
		String UsersName;
		
		// get the scanner and set it up
		Scanner Scanner = new Scanner (System.in);
		
		// output message of hello and prompt for user's name
		System.out.println("Hello, What is your name?");
		
		//get the user's name 
		UsersName = Scanner.next();
		
		// output message with user's name
		System.out.println("Hello there" + UsersName);
		
		
	}

}
