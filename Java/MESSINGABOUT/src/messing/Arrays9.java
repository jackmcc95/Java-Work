package messing;

public class Arrays9 {

	public static void main(String[] args) {

		String biggestWord = null;
		String smallestWord = null;
		int numberWords = 0;
		int numberLetters = 0;

		String[] newArray = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key",
				"for", "unlocking", "our", "potential" };

		for (int loop = 0; loop < newArray.length; loop++) {
			System.out.print(newArray[loop]);
			System.out.print(" ");
			
			numberWords++;	
			
			numberLetters+=newArray[loop].length();
			
		biggestWord = newArray[0];
		smallestWord = newArray[0];
		
		if(newArray[loop].length() > biggestWord.length()) {
				biggestWord = newArray[loop];
		}
		
		if(newArray[loop].length() < smallestWord.length()) {
					smallestWord = newArray[loop];
		}
		}
		System.out.println("\nNumber of Words : " + numberWords);
		System.out.println("Number of letters : " + numberLetters);
		System.out.println("Biggest word is : " + biggestWord);	
		System.out.println("Smallest word is : "+ smallestWord);
	
	}
	{
	}
}


		
		