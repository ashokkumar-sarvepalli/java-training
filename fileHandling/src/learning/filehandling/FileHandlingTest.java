package learning.filehandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileHandlingTest {

	public static void main(String[] args) {

		try{
		File f = new File("C:\\Ashok\\JavaClasses\\input.txt");
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int val;
		while((val=bis.read())!=-1){
			System.out.print((char) val);
			
		}
		
		
		
		
		}catch(Exception ex){
			
		}
		
	}

}
