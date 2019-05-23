package messing;


public class aArrayShoeSize {

	public static void main(String[] args) {
		
		int [] ShoeSize = {11, 10, 10, 9, 11, 9, 11, (int) 8.5};
		int total, average;
		total = 0;
		average = 0;
		
		
		for(int loop=0; loop<ShoeSize.length; loop++) {
			System.out.println(loop+ " size : "+ShoeSize[loop]);
			total+=ShoeSize[loop];
		}
		
		// calculate the average shoe size
		
		average=total/ShoeSize.length;
		System.out.println("Average shoe size is : " + average);
		
	}

}
