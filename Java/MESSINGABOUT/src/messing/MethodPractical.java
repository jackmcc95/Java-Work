package messing;

import java.util.Random;

public class MethodPractical {

	
	public static void oddOrEven (int num) {
		if(num %2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
			
		}
	}
		
	public static void convertFromUpperToLower(char letter) {	
		if(Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		}else {
			System.out.println("Aready in lower case");
			
		}
	
		
	}
	
	public static void isMultiple(int num1, int num2) {
		if(num2 % num1 ==0) {
			System.out.printf("%d is a multiple of  %d", num1, num2);
		}else {
			System.out.printf("%d is not a multiple of  %d", num1, num2);
		}
	}
	
	public static void randomNum () {
		Random rand = new Random();
		int num =0;
		
		for( int loop=1; loop<=10; loop++) {
			num = rand.nextInt(100);
				num++;
				System.out.println(num);
			}
		}
	
	public static int rectangleArea (int num1, int num2) {
		int area;
		area = num1*num2;
		return area;
		
	}

	public static int stringReturn (int month) {
	
		return month;
		
	}
		
	
	
	
	public static void main(String[] args) {
		 oddOrEven(11);
		 convertFromUpperToLower('G');
		 isMultiple(5, 20);
		 randomNum();
		 System.out.println();
		 rectangleArea(9, 3);
		 
		 
		 
		 
	}

		
	}


