package exceptional;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {

	public CheckException() {
	}

	public static void main(String[] args) {

		CheckException ck = new CheckException();
		try {
			ck.iAMCheked();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void iAMCheked() throws FileNotFoundException {
		FileReader fr = new FileReader("nothere.txt");
	}

}
