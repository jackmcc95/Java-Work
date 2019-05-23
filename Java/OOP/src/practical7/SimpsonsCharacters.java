package practical7;

/**
 * Creating Simpsons characters
 * @author User
 *
 */
public class SimpsonsCharacters {
	
	private String name;
	
	private String catchphrase;
	
	
	/**
	 * sets name of character
	 * @param name
	 */
	public void setName (String name) {
		this.name = name;
	}
	
	/**
	 * Gets the name
	 * @return 
	 * @return
	 */
	public String getName () {
		return name;
				
	}
	
	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}
	
	/**
	 * gets catchphrase
	 * 
	 */
	public String getCatchphrase() {
		return catchphrase;
}
	
	public void sayCatchphrase() {
		System.out.println( this.name  +  "says" + this.catchphrase);
	}
}
