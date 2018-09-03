package learning.varargs;

public class VarArgs {
	
	public static void main(String []args){
		System.out.println(add(4,5));
		System.out.println(add(4,5,6));
		System.out.println(add(4,5,6,7,8));
		
		
		
	}
	
	public static int add(int ...nums){
		int sum =0;
		  for(int i=0;i<nums.length;i++)
		  {
		    sum = sum+nums[i];
		  }
		  return sum;
	}

}
