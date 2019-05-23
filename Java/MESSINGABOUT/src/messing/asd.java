package messing;


public class asd {

	public static void main(String[] args) {

		double total = 0;
		double average = 0;
		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		double biggest = heights[0];
		double smallest = heights[0];

		for (int loop = 0; loop < heights.length; loop++) {
			System.out.print(heights[loop]);
			total += heights[loop];
			average = total / heights.length;
		}
	
		System.out.println("The average height of student is : " + average);
		
		for (int loop = 0; loop<heights.length; loop ++) {
			if(heights[loop]>biggest) {
				biggest=heights[loop];
				}
		}
		
			System.out.println("The biggest height is : "+ biggest);
			{
			
			for (int loop = 0; loop<heights.length; loop ++) {
				if(heights[loop]<smallest) {
					smallest=heights[loop];
				}
					}
				System.out.println("The smallest is : " + smallest);
		}
	{

}
}
}


