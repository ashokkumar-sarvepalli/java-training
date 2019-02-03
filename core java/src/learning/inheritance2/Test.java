package learning.inheritance2;

public class Test {

	public static void main(String[] args) {
	
		
		MinorAccount minor = new MinorAccount();
		//"342332","John","9734620073",3330.0,3.4,true,15,10
		minor.setAccountNumber("342332");
		minor.setCustName("John");
		minor.setPhone("9734620073");
		
		
		System.out.println(minor.getAccountNumber());

	}

}
