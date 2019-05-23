package setdemos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesterDemo {

	public static void main(String[] args) {

		String [] colours = {"red", "white", "blue", "green", "grey", "orange", "tan", "white", "cyan", "peach", "grey", "orange"};
		
		List<String>list = Arrays.asList(colours);
		System.out.println(list.toString());
		
	}

	public static void PrintNonDuplictes(Collection<String> values) {
		
		Set<String> set = new HashSet<String>(values) ;
		System.out.println("Non duplicates are : ");
		System.out.println(set.toString());
		
		}
		
	}
