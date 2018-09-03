package learning.inheritance1;

import learning.inheritance.Animal;

public class Dog extends Animal{

	 private String petName;
	 private String color;
	 
	 public Dog(int height, int weight,String petName, String color){
		 super(height,weight);
		 this.petName = petName;
		 this.color = color;
		 System.out.println("Dog is sleeping");
	 }
	 
	 public void petDetails(){
		 makeNoise();
		 System.out.println("My Petname is "+petName +"Color is "+color);
	 }

	@Override
	protected void makeNoise() {
		// TODO Auto-generated method stub
		
	}
}
