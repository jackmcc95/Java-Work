package mapStuff;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {

		Map<Integer, Contacts> phoneNumbers = new HashMap<>();
		
		Contacts c1 = new Contacts();
		c1.setfName("Jack");
		c1.setlName("McCann");
		c1.setEmail("jmccann901@qub.ac.uk");
		
		Contacts c2 = new Contacts("Una", "McG", "unamcg@qub.ac.uk");
		
		phoneNumbers.put(1, c1);
		phoneNumbers.put(2, c2);
		
		phoneNumbers.put(3, new Contacts("Niamh", "McGoo", "niamhmcg@qub.ac.uk"));
		
		
		Contacts c3 = phoneNumbers.get(3);
		System.out.println(c3.toString());
		System.out.println(c1.toString());
		
		
		for(Integer key : phoneNumbers.keySet()) {
			System.out.println(key + " " + phoneNumbers.get(key).getfName() +  phoneNumbers.get(key).getEmail());
		}
	
	}

}
