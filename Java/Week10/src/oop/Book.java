/**
 * 
 */
package oop;

/**
 * @author Jack
 *
 */
public class Book {

	//instance var

	
	//constructors
	/**
	 * Default
	 */
	
	public Book() {
		System.out.println("Creating a book");
	}
	
	
	
	//methods
	private String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
