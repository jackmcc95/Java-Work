package practical7;

public class carFractory {

	public static void main(String[] args) {
		
		car car1 = new car ();
		car1.setColour("red");
		car1.setMake("Ford");
		car1.setModel("Fiesta");
		
		System.out.println(car1.toString());
		
		car1.startCar();
		car1.startCar();
		car1.stopCar();
		
		car1.stopCar();
	}

}
