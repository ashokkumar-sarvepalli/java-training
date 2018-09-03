package learning.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Animal a = new Cat(4,27);
		makeNoise(a);
		
		
		Cat d = (Cat) a;
		d.details();
		
		
		

	}

	private static void makeNoise(Animal a) {
		a.makeNoise();
		a.isAlive();
		
	}

}
