package learning.abstraction;

public class TextDownload extends Download {

	@Override
	protected void convertAndDownload(byte[] bytes) {
		System.out.println("Download as text");
		
	}
}
