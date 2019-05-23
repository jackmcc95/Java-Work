package practical7;

public class calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return
	 * 
	 */
	public int addNumbers (int num1, int num2 ) {
		return num1 +num2;
	}
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	public double sqrRoot (int num) {
		return Math.sqrt(num);
	}
	
	/**
	 * this will clear the memory to '0'
	 */
	public void clearMemory () {
		this.memory = 0;
	}

}
	
