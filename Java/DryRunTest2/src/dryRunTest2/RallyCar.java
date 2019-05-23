/**
 * 
 */
package dryRunTest2;

/**
 * @author Jack
 *
 */
public class RallyCar extends Car {

	private double area;
	
	// default constructor
	public RallyCar() {
	}
	
	
	//constructor with args
	/**
	 * 
	 * @param make
	 * @param model
	 * @param horsepower
	 * @param area
	 */
	public RallyCar (String make, String model, int horsepower, double area) {
		super (make, model, horsepower);
		this.area = area;
	}
	

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	//Creating a displayAll method
		@Override
		public void displayAll() {
			System.out.println("Rally Car");
			super.displayAll();
			System.out.println("Area \t" + this.area);	
}
}
