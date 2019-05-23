package messing;

public class Practical6DArrays {

	public static void main(String[] args) {

		double total = 0;
		double average = 0;

		double[] Temps = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };
		for (int loop = 0; loop < Temps.length; loop++) {
			total += Temps[loop];
			average = total / Temps.length;
		}

		System.out.println("The average temperature is : " + average);
	

}
}
