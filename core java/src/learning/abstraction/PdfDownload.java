package learning.abstraction;

public class PdfDownload extends Download{

	@Override
	protected void convertAndDownload(byte[] bytes) {
		System.out.println("Downloaded as pdf");
		
	}
	
	
	public String sayHello() {
		return "hello";
	}
}
