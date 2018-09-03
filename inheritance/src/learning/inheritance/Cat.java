package learning.inheritance;

public class Cat extends Animal{

	 private int age;
	 private double speed;
	 
	 public Cat(int age, double speed){
		 super(3,21);
		 this.age = age;
		 this.speed = speed;
		 System.out.println("Cat is Sleeping");
	 }
	 
	 public void details(){
		 makeNoise();
		 System.out.println("The age of the cat is "+age +"It runs at "+speed);
	 }

	@Override
	protected void makeNoise() {
		System.out.println("Cat with height "+height + " and weight says "+weight+"says meow meow" );

		
	}
	
	
	
	

}
