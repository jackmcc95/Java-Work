/**
 * 
 */
package dryRunTest2;

/**
 * @author Jack
 *
 */
public class F1 extends Car {

	
	private double area;
	
	/**
	 * Default Constructor
	 */
	public F1() {
	}

	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public F1(String make, String model, int horsepower, double area) {
		super(make, model, horsepower);
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
				System.out.println("F1");
				super.displayAll();
				System.out.println("Area \t" + this.area);	
}
}
