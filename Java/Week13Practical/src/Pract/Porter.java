/**
 * 
 */
package Pract;

/**
 * @author User
 *
 */
public class Porter extends Employee {
	
	private String site;

	/**
	 * @param string3 
	 * @param d 
	 * @param string2 
	 * @param string 
	 * 
	 */
	public Porter(String string, String string2, double d, String string3) {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}


	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}


	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate) {
		super(firstName, lastName, baseRate);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Pract.Employee#calculateWeeklySalary(double)
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		// TODO Auto-generated method stub

	}

	/**
	 * Displays the porter's details
	 */
	public void printAll(){
		System.out.printf("[%-10s] %-20s %-20s £%.2f Site : %s","Porter",this.getFirstName(), this.getLastName(), this.getBaseRate(), this.site);
	}

}
