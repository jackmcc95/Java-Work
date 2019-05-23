package flightControl;
/**
 * 
 * @author Jack
 *
 */

public class Flight {
	
	//instance vars
	private String FlightNumber;
	private String Destination;
	private String Origin;
	private double Duration;
	
	
	/**
	 * Default Constructor
	 */
	public Flight () {
		
	}


	/**
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		super();
		FlightNumber = flightNumber;
		Destination = destination;
		Origin = origin;
		Duration = duration;
	}


	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return FlightNumber;
	}


	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return Destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		Destination = destination;
	}


	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return Origin;
	}


	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		Origin = origin;
	}


	/**
	 * @return the duration
	 */
	public double getDuration() {
		return Duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		Duration = duration;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight [FlightNumber=" + FlightNumber + ", Destination=" + Destination + ", Origin=" + Origin
				+ ", Duration=" + Duration + "]";
	}

	
	
	
}
