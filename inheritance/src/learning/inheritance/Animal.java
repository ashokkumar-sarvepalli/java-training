package learning.inheritance;

public abstract class Animal {

	protected int height;
	protected int weight;
	private String thinkingCap;
	String strength;

	public Animal(int height, int weight){
		this.height = height;
		this.weight = weight;
		System.out.println("Animal is Sleeping");
	}
	
	protected abstract void makeNoise();
	
	protected final void isAlive(){
		System.out.println("Animal is Alive");
	}
	

}
