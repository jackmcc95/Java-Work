/**
 * 
 */
package dryRunTest2;

/**
 * @author User
 *
 */
public class CarFactory {

	/**
	 * Default Constructor
	 */
	public CarFactory() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creating cars
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		F1 f11 = new F1("Ferarri", "Maraello", 330, 1.23);
		F1 f12 = new F1("McLaren", "MCL2016", 998, 1.12);
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, true);

		// create an array
		Car[] cars = { fs1, f11, f12, r1, fs2 };
		showAllCarDetails(cars);
		lowestHP(cars);
		MaxHP(cars);
		subaruCar(cars);

	}

	// create method to display cars
	public static void showAllCarDetails(Car[] cars) {
		for (Car c : cars) {
			c.displayAll();

		}
	}

	// show car with least horsepower
	public static void lowestHP(Car[] cars) {

		int min = cars[0].getHorsepower();
		String leastHPmodel = cars[0].getModel();

		for (Car c : cars) {
			if (c.getHorsepower() < min) {
				min = c.getHorsepower();
				leastHPmodel = c.getModel();
			}
		}

		System.out.println("Min HP " + leastHPmodel);
	}

	public static void MaxHP(Car[] cars) {
		int max = cars[0].getHorsepower();
		String biggestHPmodel = cars[0].getModel();

		for (Car c : cars) {
			if (c.getHorsepower() > max) {
				max = c.getHorsepower();
				biggestHPmodel = c.getModel();
			}
		}
		System.out.println("Max HP " + biggestHPmodel);

	}
	public static void subaruCar(Car[]cars) {
		System.out.println("Getting car details for SUBARU");
		for(int loop=0; loop<cars.length; loop++) {
			if(cars[loop].getMake().equalsIgnoreCase("Subaru")) {
				System.out.printf(cars[loop].getMake());
			}
		}
	}

}
