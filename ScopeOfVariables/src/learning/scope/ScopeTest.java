package learning.scope;

public class ScopeTest {
	
	private int f;
	private static int count;
	public static void main(String []args){
		int a,b;
		
		ScopeTest s = new ScopeTest();
		System.out.println(s.f);
		ScopeTest s2 = new ScopeTest();
		System.out.println(s2.f);
		count=5;
		System.out.println(count);
		System.out.println(s2.count);
		System.out.println(s.count);
		s2.count = s2.count+5;
		System.out.println(count);
		System.out.println(s.count);
	}
	
	public void dummy(){
		System.out.println(count);
	}

}
