package messing;

public class Arrays8 {

	public static void main(String[] args) {

		int[] assignment1 = { 24, 42, 29, 66, 77 };
		int[] assignment2 = { 79, 68, 31, 22, 42 };

		int totala1 = 0;
		int totala2 = 0;
		int avg1 = 0;
		int avg2 = 0;
		int overalltotal = 0;
		int overallAvg = 0;
		int largestMark1 = assignment1[0];
		int largestMark2 = assignment2[0];
		

		for (int loop = 0; loop < assignment1.length; loop++) {
			totala1 += assignment1[loop];
			avg1 = totala1 / assignment1.length;
		}
		System.out.println("Assignment 1 average : " + (double) avg1);
		
		for(int loop = 0; loop<assignment2.length; loop++) {
			totala2+=assignment2[loop];
			avg2 = totala2 / assignment2.length;
		}
		System.out.println("Assignment 1 average : " + (double) avg2);
		
		overalltotal = ((avg1+avg2));
		
		System.out.println("Overall total is : " + (double) overalltotal);
		
		overallAvg= overalltotal/2;
		System.out.println("Overall average is : " + (double) overallAvg);
		
		if(avg1>avg2) {
			System.out.println("The best average is : assignment1");
		}else {
			System.out.println("The best average is : assignment2");
			{
			
		for ( int loop=0; loop<assignment1.length; loop++) {
			if(assignment1[loop]> largestMark1) {
				largestMark1=assignment1[loop];
			}
			{
			
		System.out.println("Largest mark in Assignment 1 : "+ largestMark1);
			}}
		{
			for ( int loop=0; loop<assignment1.length; loop++) {
				if(assignment2[loop]> largestMark2) {
					largestMark2=assignment2[loop];
				}
				{
				
			System.out.println("Largest mark in Assignment 2: "+ largestMark2);
			{
		}}
			}
			
		}
		
		
		}

	{

}
	{
	}
	}}}


