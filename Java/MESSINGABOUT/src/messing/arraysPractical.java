package messing;

public class arraysPractical {
	
	public static final double RATE = 10.25;
	
	public static void hoursAndWages (int [] hours) {
		int totalHours = 0;
		for ( int day =0; day<hours.length; day++) {
			System.out.printf("Day %d hours %d \n", (day + 1), hours [day]);
			
			//add up all hours worked (loop)
			
			totalHours += hours [day];
		}
		
		System.out.println("Total hours" + totalHours);
		System.out.printf("Total salary : £%.2f ", (totalHours *RATE));
	}

	public static void main(String[] args) {
		int [] hours = {8, 7, 9, 7, 4};
		hoursAndWages(hours);
	}

}
