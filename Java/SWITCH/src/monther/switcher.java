package monther;

public class switcher {

	public switcher() {
	}

	public static String monthtoString(int month) {
		String monthstring = "";

		switch (month) {

		case 1:
			monthstring = "January";
			break;

		case 2:
			monthstring = "February";
			break;

		case 3:
			monthstring = "March";
			break;
		default:
			throw new NumberFormatException();
		}
		return monthstring;
	}
}
