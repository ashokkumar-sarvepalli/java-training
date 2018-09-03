package learning.innerclass;

public class UITest {

	public static void main(String[] args) {

		
		onClick();
	}

	private static void onClick() {
       Button b = new Button(){

		@Override
		public void reSize() {
			// do Nothing
		}

		@Override
		public void onClick() {
			System.out.println("succesfully clicked ");
			
		}

		@Override
		public void hOver() {
			// do Nothing
			
		}
    	  
      };
      
      b.onClick();
	}

}
