package learning.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> myMap = new HashMap<String,String>();
		myMap.put("IND", "INDIA");
		myMap.put("USA", "UNITED STATES OF AMERICA");
		myMap.put("AUS", "AUSTRALIA");
		myMap.put("RSA", "SOUTHAFRICA");
		myMap.put("RSA", "SOUTH AFRICA");
		myMap.put("SA", "SOUTH AFRICA");
		
		
		System.out.println(myMap.size());
		
		Set<String> mySet = myMap.keySet();
		for(String s:mySet){
			System.out.println(s+":");
			System.out.println(myMap.get(s));
		}
		
		String value = myMap.get("RSA");
		System.out.println(value);
		
		System.out.println(myMap.containsKey("RSA"));
		System.out.println(myMap.containsValue("AUSTRALIA"));
		
		System.out.println("Displaying the values");
		Collection<String> myValues = myMap.values();
		for(String s:myValues){
			System.out.println(s);
		}
		
		for(Map.Entry<String,String> myMaps : myMap.entrySet()){
			System.out.println(myMaps.getKey()+":"+myMaps.getValue());
		}
	}

}
