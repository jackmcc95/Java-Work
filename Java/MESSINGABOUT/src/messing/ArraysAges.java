package messing;

public class ArraysAges {

	public static void main(String[] args) {
		
		int [] Ages = {22, 23, 32, 34, 21, 45};
		int average = 0;
		int total = 0;
		int max = Ages[0];
		int min = Ages[0];
		
		for( int loop=0; loop<Ages.length; loop++) {
			System.out.print(Ages[loop] + ", ");
			total+=Ages[loop];
		}
		System.out.println();
		
		average=total/Ages.length;
		System.out.println("The average age is : " + average);
		
		
		//Calculating the largest Ages
		for( int loop=0; loop<Ages.length; loop ++) {
			if ( Ages[loop]>max) {
				max = Ages[loop];	
			}
		}
				System.out.println("The biggest age is : " + max);
				//calculating the minimum age
				for( int loop=0; loop<Ages.length; loop++) {
					if(Ages[loop]<min) {
						min = Ages[loop];
					}
				}
				System.out.println("The minimum age is : " +min);
	}


}
