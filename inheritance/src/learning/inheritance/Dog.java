package learning.inheritance;

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

		 strength = "great strength";
		 makeNoise();
		 System.out.println("My Petname is "+petName +"Color is "+color);
	 }

	@Override
	protected void makeNoise() {
		System.out.println("Dog with height "+height + " and weight says "+weight+"says bow bow" );
		
	}
	 
	

	 
	
	 
}
