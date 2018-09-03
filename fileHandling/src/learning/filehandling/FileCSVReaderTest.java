package learning.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileCSVReaderTest {

	public static void main(String[] args) {

		try {
			File f = new File("C:\\Users\\aksarvepalli\\Desktop\\emprecords.csv");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String val;

			while ((val = br.readLine()) != null) {
				
				String [] myArray = val.split(",");
				for(String ss : myArray){
					
					System.out.println(ss);
				}

			}

		} catch (

		Exception ex)

		{

		}
	}

}
