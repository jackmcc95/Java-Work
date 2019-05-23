/**
 * 
 */
package messing;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class loopsPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int num = 1;

		sum = sum + num;

		System.out.println("The sum is: " + sum);

		while (num <= 10) {
			sum += num;
			++num;
			{

			}
			System.out.println(sum);

			Scanner scanner = new Scanner(System.in);
			int option;
			do {
				System.out.println("1. File");
				System.out.println("2. Edit");
				System.out.println("3. Save");
				System.out.println("4. Delete");
				System.out.println("5. Exit");
				System.out.println();
				System.out.println("Select Option");

				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("OPTION :File");
					break;
				case 2:
					System.out.println("OPTION :Edit");
					break;
				case 3:
					System.out.println("OPTION :Save");
					break;
				case 4:
					System.out.println("OPTION :Delete");
					break;
				case 5:
					System.out.println("OPTION :Exit");
					break;
				default:
					System.out.println("OPTION :Enter a correct number");

				}

			} while (option != 5);
			scanner.close();
		}

	}
}
