package practical7;
/**
 * This class will output famous quotes
 * @author Jack McCann
 *
 */
public class Quotes {

	/**
	 * This method outputs the quotes.
	 */
		public void shakesphereQuote() {
			System.out.println("Shakesphere: Good night, Good night, parting is such sweet sorrow.......");
		}
		
		public void oscarWildeQuote(){
			System.out.println("Wilde: Experience is simply the name we give our mistakes....");
		}
		public void churchhillQuote() {
			System.out.println("Churchill: Continous effort, not strenght not effort is the ......");
		}
		public void georgeWBushQuote() {
			System.out.println("Bush: One of the great things about books is ..........");
		}
		public void einsteinQuote( ) {
			System.out.println("Einstein: If the facts dont fit the query.....");
		}


	public static void main (String args []) {
		
		//create an instance of the class to be tested
		Quotes quotes = new Quotes ();
		quotes.shakesphereQuote();
		quotes.oscarWildeQuote();
		quotes.churchhillQuote();
		quotes.georgeWBushQuote();
		quotes.einsteinQuote();
	}
}
