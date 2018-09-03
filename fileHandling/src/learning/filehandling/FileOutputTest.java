package learning.filehandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		FileOutputStream fis = null;
		BufferedOutputStream bis = null;
		File f = null;

		try {
			String s = "Hello World!!";
			f = new File("C:\\Ashok\\JavaClasses\\input2.txt");
			//f.createNewFile();
			fis = new FileOutputStream(f);
			bis = new BufferedOutputStream(fis);
			bis.write(s.getBytes());
			bis.flush();

		} catch (Exception ex) {

		} finally {

			try {
				fis.close();
				bis.close();
			} catch (IOException e) {
				// do Nothing
			}

		}

	}

}
