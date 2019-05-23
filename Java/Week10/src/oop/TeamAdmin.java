package oop;

public class TeamAdmin {

	public static void main(String[] args) {
		
		Footballer f1 = new Footballer ();
		f1.setfName("Gareth");
		f1.setlName("Bale");
		f1.setSquadNumber(9);
		f1.setEmployeeNumber(122324);
		
		System.out.println(f1.getfName());
		System.out.println(f1.getlName());
		System.out.println("Squad Number " + f1.getSquadNumber());
		System.out.println("Employee Number " +f1.getEmployeeNumber());
	
		System.out.println(f1.toString());
		
	}
	public static void main1(String[] args) {

		Footballer f2 = new Footballer("Leo", "Messi", 10, 3232);
		System.out.println(f2.toString());
}
}