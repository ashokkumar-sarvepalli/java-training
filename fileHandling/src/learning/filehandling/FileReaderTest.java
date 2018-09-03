package learning.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReaderTest {

	public static void main(String[] args) {
		try{
			File f = new File("C:\\Ashok\\JavaClasses\\input.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String val;
			List<String> words = new ArrayList<String>();
			
			Map<String,Integer> myMap = new HashMap<String,Integer>();
			
			
			while((val=br.readLine())!=null){
				String [] myArray = val.split("\\s+");
				for(String ss : myArray){
					if(myMap.containsKey(ss)){
						int count = myMap.get(ss);
						count = count+1;
						myMap.put(ss, count);
						
					}else{
						myMap.put(ss, 1);
					}
				}
				
			}
			
		
			for(Map.Entry<String,Integer> mapping : myMap.entrySet()){
				System.out.println(mapping.getKey()+":"+mapping.getValue());
			}
			
			
			}catch(Exception ex){
				
			}
	}

}
