/**
 * 
 */
package polymorph;

/**
 * @author Jack
 *
 */
public class ZooFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal al = new Animal ();
		al.makeNoise();
		
		// Dynamic method dispatch- uses Animal instead of Dog
		Animal dog = new Dog();
		dog.makeNoise();
		
		Animal lion = new Lion ();
		lion.makeNoise();
		
		//polymorphic array
		Animal [] animals = {al, dog, lion};
		
		for(Animal animal :animals) {
			animal.makeNoise();
		}
		
	}


	public static void animalNoiseMaker(Animal [] animals) {
		for (Animal a :animals) {
			a.makeNoise();
	}
		}
	}
	
