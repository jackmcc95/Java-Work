package practical7;

public class cartoonApp {

	public static void main(String[] args) {
		
		
		//Bart
	SimpsonsCharacters bart = new SimpsonsCharacters();
	bart.setName ("Bart ");
	bart.setCatchphrase(" Eat my shorts");
	
	System.out.println(bart.getName());
	System.out.println(bart.getCatchphrase());
	
	bart.sayCatchphrase();
	
		//Homer
	SimpsonsCharacters homer = new SimpsonsCharacters();
	homer.setName("Homer ");
	homer.setCatchphrase(" D'OH");
	
	System.out.println(homer.getName());
	System.out.println(homer.getCatchphrase());
	
	homer.sayCatchphrase();
	
	}

}
