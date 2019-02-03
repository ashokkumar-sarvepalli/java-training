package learning.abstraction;

public abstract class Download {

	protected byte[] downloadAsBytes(String startDate, String endDate)
	{
		// hitting database getting data converting in to some format 
	   String string = "hello your statment";
	   return string.getBytes();
	}
	
	protected abstract void convertAndDownload(byte[] bytes);
}
