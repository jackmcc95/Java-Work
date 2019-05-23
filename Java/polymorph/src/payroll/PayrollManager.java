package payroll;

public class PayrollManager {

	public static void main(String[] args) {
		
		employee e1 = new employee();
		e1.setName("Joe Soap");
		e1.setJobTitle("Cleaner");
		
		e1.displayAll();
		
		Lecturer le = new Lecturer ();
		le.setName("Aidan");
		le.setJobTitle("Lecturer");
		le.setSubject("CS");
		
		le.calculateWages(40);
	}

	public static void processWages(employee [] employees ) {
		for (employee employee : employees) {
			
		}
	}
	
}
