package learning.abstraction;

public class ExcelDownload extends Download{


	@Override
	protected void convertAndDownload(byte[] bytes) {
		System.out.println("Downloaded as excel");

		
	}
}
