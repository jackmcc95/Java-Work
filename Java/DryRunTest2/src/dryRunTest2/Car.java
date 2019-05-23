/**
 * 
 */
package dryRunTest2;

/**
 * @author Jack
 *
 */
public class Car {
	
	private String make;
	private String model;
	private int horsepower;
	
	/**
	 * Default Constructor
	 */
	public Car () {
	}
	
	
	/**
	 * CONSTRUCTOR WITH ARGS
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public Car (String make, String model, int horsepower) {
		this.make = make;
		this.model = model;
		this.setHorsepower(horsepower); //Updated Horsepower
	}

	public void displayAll () {
		System.out.println("Make : " + this.make);
		System.out.println("Model : " + this.model);
		System.out.println("HorsePower : " + this.horsepower);
	}
	
	
	// Creating Getters and Setters 
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}

	/**
	 * @param horsepower the horsepower to set
	 */
	//Set horsepower to 0-1000
	public void setHorsepower(int horsepower) {
		if ( horsepower>=0 && horsepower<=1000) {
			this.horsepower = horsepower;
		} else {
			this.horsepower = -999;
		}
	}
	
	

}
