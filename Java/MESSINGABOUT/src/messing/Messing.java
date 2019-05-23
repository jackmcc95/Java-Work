package messing;

public class Messing {

	public Messing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String myname;
		myname = "Jack McCann";
		
		System.out.println(myname);
		System.out.println(myname.length());
		System.out.println(myname.charAt(0));
		System.out.println(myname.toLowerCase());
		System.out.println(myname.replace("a","£"));
		
		
		int length = 6;
		int area = length*length;
		
		System.out.println("Area is : " +area);
	
		double radius = 9.0;
		double Area = radius*radius*3.142;
		System.out.printf("Area of circle is : %2f", Area);	
		System.out.println();
		
		int num1 = 3;
		int num2 = 10;
		
		if(num1 > num2) {
			System.out.println("The biggest number is : "+ num1);
		}
		if (num2>num1) {
			System.out.println("The biggest number is : "+ num2);
		}
		
		int yearOfBirth, yearIturn25, yearIturn60, yearIturn100;
		
		yearOfBirth = 1995;
		yearIturn25= yearOfBirth + 25;
		yearIturn60 = yearOfBirth +60;
		yearIturn100 = yearOfBirth + 100;
		System.out.println();
		
		System.out.println("Birth : " +yearOfBirth);
		System.out.println("25 : " + yearIturn25);
		System.out.println("60 : " + yearIturn60);
		System.out.println("100 : "+ yearIturn100);
		
	}
}

