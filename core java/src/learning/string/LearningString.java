package learning.string;

public class LearningString {

	public static void main(String[] args) {
		
//		
//		String aa = "tara";
//		//System.out.println(aa.length());
//		
//		
//		String a = "hello";
//		
//		int b=6;
//		a = a.substring(0, 2) + "how" + a.substring(2);
//		
//		a.length();
//		a.indexOf("llo");
		
		
		
		String sentence = "hello how are you how things going how is you";
		
		String [] words = sentence.split("\\s+");
		int count =0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase("hoW")) {
				count++;
			}
		}
		
		
		
		System.out.println(count);
		

	}

}
