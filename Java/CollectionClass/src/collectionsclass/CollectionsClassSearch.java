package collectionsclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSearch {

	public static void main(String[] args) {

		int SearchIndex = 0;
		String[] countries = {"Italy", "France", "USA", "New Zealand"};
		
		
		//create and display a list containing the countries array elements
		List <String > list = Arrays.asList(countries);
		
		//sort the list
		Collections.sort(list);
		System.out.println(list);
		
		//search for the country kist
		SearchIndex = Collections.binarySearch(list, "USA");
		System.out.println(SearchIndex);
		
		
		//search for country not in the list
		SearchIndex = Collections.binarySearch(list, "England");
		System.out.println(SearchIndex);
	}
	

}
