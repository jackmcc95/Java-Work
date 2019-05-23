package messing;

public class arraysExerciseTWO {

	/**
	 * Creates the array to store the results of the Mobile Survey.
	 * Then  the array to another method to analyse the results.
	 * @param args
	 */
	
		public static void main(String[] args) {
			   // array to store mobile survey results 
			   int[] results = {30, 25, 5, 4, 6, 20};
	
			   // method call  	
			   analyseResults(results);
			}
			
			/**
			 * Loop through the array lists outputting the details. 
			 * @param results (array of results from Mobile survey)
			 */
			public static void analyseResults(int[] results){
				int total =0;
				
				for (int loop=0; loop<results.length;loop++){
					
					switch (loop){
					case 0 : 
						System.out.print("Android ");
						break;
					case 1 : 
						System.out.print("iphone ");
						break;
					case 2 : 
						System.out.print("BlackBerry ");
						break;
					case 3 : 
						System.out.print("Windows ");
						break;
					case 4 : 
						System.out.print("Other ");
						break;
					case 5 : 
						System.out.print("Unknown ");
						break;
					default :
						System.out.println("Error");	
					}
					// keep running total
					total+=results[loop];
					
					// frequency 
					System.out.print(results[loop]);
					System.out.println();
				}	
				System.out.println("Total responses : "+total);
	
			}
			
	}
