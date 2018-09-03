package learning.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			System.out.println("hello1");
			a[3] = 89;
			String str = "dasffd";
			System.out.println(str.length());
			System.out.println("hello 5");
			System.out.println("hello2");
		} catch (NullPointerException ex) {
			System.out.println("I  catched null pointer excpetion " + ex.getMessage());
		}catch (Exception ex) {
			System.out.println("I  catched some other exception " + ex.getMessage());
		}  finally {
			System.out.println("Freeing resources");
		}

		System.out.println("Hello 3");

	}

}
