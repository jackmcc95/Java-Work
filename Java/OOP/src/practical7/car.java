package practical7;

public class car {
	
	// instance variable declaration
	private String Make;
	private String Model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;
	/**
	 * @return the make
	 */
	public String getMake() {
		return Make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		Make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		Model = model;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * @return the engineSize
	 */
	public double getEngineSize() {
		return engineSize;
	}
	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}
	/**
	 * @param started the started to set
	 */
	public void setStarted(boolean started) {
		this.started = started;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "car [Make=" + Make + ", Model=" + Model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}
	
	public void startCar() {
		if(this.started) {
			System.out.println("car is already started");
		}else{
		this.started = true;
		System.out.println("car started");
		}
		
	}
	
	public void stopCar() {
		if(!this.started) {
			System.out.println("car is already stopped");
		}else {		
		this.started = false;
		System.out.println("car stopped");
	}
	
}
}
