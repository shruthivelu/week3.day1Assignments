package week3.day1Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		
		//text1.length(); text2.length();
		
		
		if (text1.length()==text2.length()) {
			System.out.println("both the values are in same length");	
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (text1.length()==text2.length()) {
				if (Arrays.equals(ch1, ch2)) {
					System.out.println("Anagram");
				}
				else {
					System.out.println("Not an Anagram");
				}		
				
			}
			
		}
		
		

	}

}
