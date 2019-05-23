/**
 * 
 */
package pract3;

/**
 * @author User
 *
 */
public class Monther {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int month;
		month = 11;

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
			
		default:
				System.out.println("You living on Mars?");
				

		}

	}

}
