package AL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListStuff {

	public ArrayListStuff() {
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		// can't use primitive types with array lists, need to be objects.
		
		list.add("Apples");
		list.add("Oranges");
		
		System.out.println(list.toString());
		
		list.add(0, "Pears");
		
		System.out.println(list.toString());

		System.out.println("Size : " + list.size());
		
		
		//looping through
		for(int loop = 0; loop< list.size(); loop++) {
			System.out.println(list.get(loop));
		
		}
		
		//enhanced for loop
		System.out.println();
		System.out.println("Enhanced For");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("Iterator");
		Iterator<String>iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//search for 
		if(list.contains("Pears")) {
			System.out.println("Got Pears");
		}
		
		// sorting
		Collections.sort(list);
		System.out.println(list.toString());
		
		
		//calling a method
		showMeList(list);
		
	}
	
	public static void showMeList(ArrayList<String>theList) {
		System.out.println(theList.toString());
	}

}
