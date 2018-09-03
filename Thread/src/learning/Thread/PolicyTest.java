package learning.Thread;

public class PolicyTest {
	
	
	public static void main(String []args){
	    Policy policy = new Policy();
	    PolicyBuilder pb1 = new PolicyBuilder(policy,"LIFE-INSURANCE");
		PolicyBuilder pb2 = new PolicyBuilder(policy,"LIFE-INSURANCE");
		Thread t1 = new Thread(pb1,"Thread-1");
		Thread t2 = new Thread(pb2,"Thread-2");
		t1.start();
		t2.start();	
		
	  
	  }

}
