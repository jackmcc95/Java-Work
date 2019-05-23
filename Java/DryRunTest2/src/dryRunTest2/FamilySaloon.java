/**
 * 
 */
package dryRunTest2;

/**
 * @author Jack
 *
 */
public class FamilySaloon extends Car {
	
	private boolean metallicPaint;

	//Default Constructor
	public FamilySaloon () {
	}

	//Constructor with args
	/**
	 * 
	 * @param make
	 * @param model
	 * @param horsepower
	 * @param metallicPaint
	 */
	public FamilySaloon (String make, String model, int horsepower, boolean metallicPaint) {
		super(make, model, horsepower);
		this.metallicPaint = metallicPaint;
		}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	
	//Creating a displayAll method
	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("MetallicPaint \t" + this.metallicPaint);
		
	}
	
	
	
}
