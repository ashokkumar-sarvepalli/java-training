package learning.innerclass;

public class OuterClass {
	private int a;
	private String b;
	private static int c;

	private class InnnerClass {
		private int counts = 10;
		public void myMethod() {

		}

		public void setValues(int value, String name, int count) {
			a = value;
			b = name;
			c = count+counts;
		}

	}

	public int getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public int getC() {
		return c;
	}
}
