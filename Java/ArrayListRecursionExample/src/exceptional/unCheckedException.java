package exceptional;

public class unCheckedException {

	public unCheckedException() {
	}

	public static void main(String[] args) {

		unCheckedException unc = new unCheckedException();
		try {
			unc.checkNumber(6,0);
		}catch (ArithmeticException arithmeticException) {
			System.out.println("That was a zero");
			System.err.println("Really bad thing just hpppened");
			
		}
	}

	
	public void checkNumber (int num1, int num2) throws ArithmeticException{
		if(num2==0) {
			throw new ArithmeticException("A zero");
		}else {
			System.out.println(num1/num2);
		}
	}
	
}
